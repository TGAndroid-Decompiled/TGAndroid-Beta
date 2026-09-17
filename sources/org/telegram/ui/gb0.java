package org.telegram.ui;

import java.util.regex.Pattern;
public final class gb0 implements qf.c {
    public final mb0 f33941a;
    public final LaunchActivity f33942b;

    public gb0(LaunchActivity launchActivity) {
        this.f33942b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f33941a = new mb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f33942b.getWindow();
    }

    @Override
    public final void d() {
        this.f33941a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f33942b;
        launchActivity.getClass();
        this.f33941a.a(true);
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
