package org.telegram.ui;

import java.util.regex.Pattern;
public final class oa0 implements tf.c {
    public final ag.b1 f42042a;
    public final LaunchActivity f42043b;

    public oa0(LaunchActivity launchActivity) {
        this.f42043b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.f42042a = new ag.b1(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.f42043b.getWindow();
    }

    @Override
    public final void d() {
        this.f42042a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.f42043b;
        launchActivity.getClass();
        this.f42042a.a(true);
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
