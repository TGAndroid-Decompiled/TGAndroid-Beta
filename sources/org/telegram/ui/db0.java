package org.telegram.ui;

import java.util.regex.Pattern;
public final class db0 implements rf.c {
    public final jb0 f36720a;
    public final LaunchActivity f36721b;

    public db0(LaunchActivity launchActivity) {
        this.f36721b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36720a = new jb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36721b.getWindow();
    }

    @Override
    public final void d() {
        this.f36720a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36721b;
        launchActivity.getClass();
        this.f36720a.a(true);
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
