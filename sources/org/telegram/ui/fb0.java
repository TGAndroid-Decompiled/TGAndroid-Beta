package org.telegram.ui;

import java.util.regex.Pattern;
public final class fb0 implements qf.c {
    public final lb0 f33503a;
    public final LaunchActivity f33504b;

    public fb0(LaunchActivity launchActivity) {
        this.f33504b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f33503a = new lb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f33504b.getWindow();
    }

    @Override
    public final void d() {
        this.f33503a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f33504b;
        launchActivity.getClass();
        this.f33503a.a(true);
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
