package org.telegram.ui;

import java.util.regex.Pattern;
public final class eb0 implements qf.c {
    public final kb0 f32141a;
    public final LaunchActivity f32142b;

    public eb0(LaunchActivity launchActivity) {
        this.f32142b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f32141a = new kb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f32142b.getWindow();
    }

    @Override
    public final void d() {
        this.f32141a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f32142b;
        launchActivity.getClass();
        this.f32141a.a(true);
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
