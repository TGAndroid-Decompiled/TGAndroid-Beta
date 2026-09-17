package org.telegram.ui;

import java.util.regex.Pattern;
public final class eb0 implements rf.c {
    public final kb0 f36018a;
    public final LaunchActivity f36019b;

    public eb0(LaunchActivity launchActivity) {
        this.f36019b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f36018a = new kb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f36019b.getWindow();
    }

    @Override
    public final void d() {
        this.f36018a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f36019b;
        launchActivity.getClass();
        this.f36018a.a(true);
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
