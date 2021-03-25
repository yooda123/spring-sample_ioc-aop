package com.example.demo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.CoffeeRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {

//	private CoffeeRepository repository;
	private final ApplicationContext AppContext;
	
	@GetMapping("/")
	public String showList(Model model) {
		CoffeeRepository repository = (CoffeeRepository)AppContext.getBean("coffeeRepository");
		model.addAttribute("toString", this.toString());
		model.addAttribute("allCoffee", repository.findAll());
		return "index";
	}
	
}
