package org.telegram.ui;

import java.util.regex.Pattern;
public final class bb0 implements qf.c {
    public final hb0 f32309a;
    public final LaunchActivity f32310b;

    public bb0(LaunchActivity launchActivity) {
        this.f32310b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f32309a = new hb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f32310b.getWindow();
    }

    @Override
    public final void d() {
        this.f32309a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f32310b;
        launchActivity.getClass();
        this.f32309a.a(true);
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
