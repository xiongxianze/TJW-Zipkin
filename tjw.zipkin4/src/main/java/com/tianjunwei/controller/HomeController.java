package com.tianjunwei.controller;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	 @RequestMapping("tar")
	public String tar() throws InterruptedException, IOException { //service4 method
	        Random random = new Random();
	        int sleep= random.nextInt(1000);
	        TimeUnit.MILLISECONDS.sleep(sleep);
	        return " [service4 sleep " + sleep+" ms]";
	}
}