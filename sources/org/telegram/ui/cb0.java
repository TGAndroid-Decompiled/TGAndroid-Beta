package org.telegram.ui;

import java.util.regex.Pattern;
public final class cb0 implements rf.c {
    public final ib0 f36608a;
    public final LaunchActivity f36609b;

    public cb0(LaunchActivity launchActivity) {
        this.f36609b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36608a = new ib0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36609b.getWindow();
    }

    @Override
    public final void d() {
        this.f36608a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36609b;
        launchActivity.getClass();
        this.f36608a.a(true);
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
