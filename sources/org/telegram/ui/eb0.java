package org.telegram.ui;

import java.util.regex.Pattern;
public final class eb0 implements rf.c {
    public final kb0 f36017a;
    public final LaunchActivity f36018b;

    public eb0(LaunchActivity launchActivity) {
        this.f36018b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36017a = new kb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36018b.getWindow();
    }

    @Override
    public final void d() {
        this.f36017a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36018b;
        launchActivity.getClass();
        this.f36017a.a(true);
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
