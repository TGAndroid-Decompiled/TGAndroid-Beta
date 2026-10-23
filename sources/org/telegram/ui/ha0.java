package org.telegram.ui;

import java.util.regex.Pattern;
public final class ha0 implements sf.c {
    public final na0 f37567a;
    public final LaunchActivity f37568b;

    public ha0(LaunchActivity launchActivity) {
        this.f37568b = launchActivity;
        Pattern pattern = LaunchActivity.C1;
        this.f37567a = new na0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.C1;
        this.f37568b.getWindow();
    }

    @Override
    public final void d() {
        this.f37567a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.C1;
        LaunchActivity launchActivity = this.f37568b;
        launchActivity.getClass();
        this.f37567a.a(true);
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
