package org.telegram.ui;

import java.util.regex.Pattern;
public final class eb0 implements qf.c {
    public final kb0 f33259a;
    public final LaunchActivity f33260b;

    public eb0(LaunchActivity launchActivity) {
        this.f33260b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f33259a = new kb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f33260b.getWindow();
    }

    @Override
    public final void d() {
        this.f33259a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f33260b;
        launchActivity.getClass();
        this.f33259a.a(true);
        launchActivity.getWindow();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }
}
