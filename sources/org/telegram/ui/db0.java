package org.telegram.ui;

import java.util.regex.Pattern;
public final class db0 implements rf.c {
    public final jb0 f36722a;
    public final LaunchActivity f36723b;

    public db0(LaunchActivity launchActivity) {
        this.f36723b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36722a = new jb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36723b.getWindow();
    }

    @Override
    public final void d() {
        this.f36722a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36723b;
        launchActivity.getClass();
        this.f36722a.a(true);
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
