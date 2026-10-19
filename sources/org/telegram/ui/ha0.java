package org.telegram.ui;

import java.util.regex.Pattern;
public final class ha0 implements sf.c {
    public final na0 f37582a;
    public final LaunchActivity f37583b;

    public ha0(LaunchActivity launchActivity) {
        this.f37583b = launchActivity;
        Pattern pattern = LaunchActivity.C1;
        this.f37582a = new na0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.C1;
        this.f37583b.getWindow();
    }

    @Override
    public final void d() {
        this.f37582a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.C1;
        LaunchActivity launchActivity = this.f37583b;
        launchActivity.getClass();
        this.f37582a.a(true);
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
