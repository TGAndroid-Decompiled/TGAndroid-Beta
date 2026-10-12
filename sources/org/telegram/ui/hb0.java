package org.telegram.ui;

import java.util.regex.Pattern;
public final class hb0 implements sf.c {
    public final nb0 f36684a;
    public final LaunchActivity f36685b;

    public hb0(LaunchActivity launchActivity) {
        this.f36685b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36684a = new nb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36685b.getWindow();
    }

    @Override
    public final void d() {
        this.f36684a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36685b;
        launchActivity.getClass();
        this.f36684a.a(true);
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
