package org.telegram.ui;

import java.util.regex.Pattern;
public final class na0 implements sf.c {
    public final ta0 f39788a;
    public final LaunchActivity f39789b;

    public na0(LaunchActivity launchActivity) {
        this.f39789b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.f39788a = new ta0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.f39789b.getWindow();
    }

    @Override
    public final void d() {
        this.f39788a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.f39789b;
        launchActivity.getClass();
        this.f39788a.a(true);
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
