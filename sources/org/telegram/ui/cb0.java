package org.telegram.ui;

import java.util.regex.Pattern;
public final class cb0 implements qf.c {
    public final ib0 f35395a;
    public final LaunchActivity f35396b;

    public cb0(LaunchActivity launchActivity) {
        this.f35396b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f35395a = new ib0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f35396b.getWindow();
    }

    @Override
    public final void d() {
        this.f35395a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f35396b;
        launchActivity.getClass();
        this.f35395a.a(true);
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
