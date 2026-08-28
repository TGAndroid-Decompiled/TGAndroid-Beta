package org.telegram.ui;

import java.util.regex.Pattern;
public final class ja0 implements ye.c {
    public final ff.t0 f39425a;
    public final LaunchActivity f39426b;

    public ja0(LaunchActivity launchActivity) {
        this.f39426b = launchActivity;
        Pattern pattern = LaunchActivity.f35493x1;
        this.f39425a = new ff.t0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.f35493x1;
        this.f39426b.getWindow();
    }

    @Override
    public final void d() {
        this.f39425a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.f35493x1;
        LaunchActivity launchActivity = this.f39426b;
        launchActivity.getClass();
        this.f39425a.a(true);
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
