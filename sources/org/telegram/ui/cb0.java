package org.telegram.ui;

import java.util.regex.Pattern;
public final class cb0 implements rf.c {
    public final ib0 f36610a;
    public final LaunchActivity f36611b;

    public cb0(LaunchActivity launchActivity) {
        this.f36611b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36610a = new ib0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36611b.getWindow();
    }

    @Override
    public final void d() {
        this.f36610a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36611b;
        launchActivity.getClass();
        this.f36610a.a(true);
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
