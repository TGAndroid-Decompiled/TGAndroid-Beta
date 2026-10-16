package org.telegram.ui;

import java.util.regex.Pattern;
public final class gb0 implements sf.c {
    public final mb0 f36127a;
    public final LaunchActivity f36128b;

    public gb0(LaunchActivity launchActivity) {
        this.f36128b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36127a = new mb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36128b.getWindow();
    }

    @Override
    public final void d() {
        this.f36127a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36128b;
        launchActivity.getClass();
        this.f36127a.a(true);
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
