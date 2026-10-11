package org.telegram.ui;

import java.util.regex.Pattern;
public final class bb0 implements rf.c {
    public final hb0 f36361a;
    public final LaunchActivity f36362b;

    public bb0(LaunchActivity launchActivity) {
        this.f36362b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36361a = new hb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36362b.getWindow();
    }

    @Override
    public final void d() {
        this.f36361a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36362b;
        launchActivity.getClass();
        this.f36361a.a(true);
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
