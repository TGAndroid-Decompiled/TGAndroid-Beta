package org.telegram.ui;

import java.util.regex.Pattern;

public final class na0 implements ze.c {

    public final gf.t0 f40711a;

    public final LaunchActivity f40712b;

    public na0(LaunchActivity launchActivity) {
        this.f40712b = launchActivity;
        Pattern pattern = LaunchActivity.f35496x1;
        this.f40711a = new gf.t0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.f35496x1;
        this.f40712b.getWindow();
    }

    @Override
    public final void d() {
        this.f40711a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.f35496x1;
        LaunchActivity launchActivity = this.f40712b;
        launchActivity.getClass();
        this.f40711a.a(true);
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
