package org.telegram.ui;

import java.util.regex.Pattern;
public final class ha0 implements sf.c {
    public final na0 f37562a;
    public final LaunchActivity f37563b;

    public ha0(LaunchActivity launchActivity) {
        this.f37563b = launchActivity;
        Pattern pattern = LaunchActivity.C1;
        this.f37562a = new na0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.C1;
        this.f37563b.getWindow();
    }

    @Override
    public final void d() {
        this.f37562a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.C1;
        LaunchActivity launchActivity = this.f37563b;
        launchActivity.getClass();
        this.f37562a.a(true);
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
