package org.telegram.ui;

import java.util.regex.Pattern;
public final class eb0 implements rf.c {
    public final kb0 f35990a;
    public final LaunchActivity f35991b;

    public eb0(LaunchActivity launchActivity) {
        this.f35991b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f35990a = new kb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f35991b.getWindow();
    }

    @Override
    public final void d() {
        this.f35990a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f35991b;
        launchActivity.getClass();
        this.f35990a.a(true);
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
