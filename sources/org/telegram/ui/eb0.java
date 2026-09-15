package org.telegram.ui;

import java.util.regex.Pattern;
public final class eb0 implements qf.c {
    public final kb0 f33305a;
    public final LaunchActivity f33306b;

    public eb0(LaunchActivity launchActivity) {
        this.f33306b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f33305a = new kb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f33306b.getWindow();
    }

    @Override
    public final void d() {
        this.f33305a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f33306b;
        launchActivity.getClass();
        this.f33305a.a(true);
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
