package org.telegram.ui;

import java.util.regex.Pattern;
public final class gb0 implements qf.c {
    public final mb0 f33855a;
    public final LaunchActivity f33856b;

    public gb0(LaunchActivity launchActivity) {
        this.f33856b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f33855a = new mb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f33856b.getWindow();
    }

    @Override
    public final void d() {
        this.f33855a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f33856b;
        launchActivity.getClass();
        this.f33855a.a(true);
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
