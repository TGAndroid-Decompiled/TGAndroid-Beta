package org.telegram.ui;

import java.util.regex.Pattern;
public final class bb0 implements rf.c {
    public final hb0 f36327a;
    public final LaunchActivity f36328b;

    public bb0(LaunchActivity launchActivity) {
        this.f36328b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36327a = new hb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36328b.getWindow();
    }

    @Override
    public final void d() {
        this.f36327a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36328b;
        launchActivity.getClass();
        this.f36327a.a(true);
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
