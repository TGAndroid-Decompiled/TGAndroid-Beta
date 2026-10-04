package org.telegram.ui;

import java.util.regex.Pattern;
public final class cb0 implements qf.c {
    public final ib0 f35401a;
    public final LaunchActivity f35402b;

    public cb0(LaunchActivity launchActivity) {
        this.f35402b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f35401a = new ib0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f35402b.getWindow();
    }

    @Override
    public final void d() {
        this.f35401a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f35402b;
        launchActivity.getClass();
        this.f35401a.a(true);
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
