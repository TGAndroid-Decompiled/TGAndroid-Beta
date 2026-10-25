package org.telegram.ui;

import java.util.regex.Pattern;
public final class ma0 implements tf.c {
    public final ag.b1 f41511a;
    public final LaunchActivity f41512b;

    public ma0(LaunchActivity launchActivity) {
        this.f41512b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.f41511a = new ag.b1(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.f41512b.getWindow();
    }

    @Override
    public final void d() {
        this.f41511a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.f41512b;
        launchActivity.getClass();
        this.f41511a.a(true);
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
