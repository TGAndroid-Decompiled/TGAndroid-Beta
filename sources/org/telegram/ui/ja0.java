package org.telegram.ui;

import java.util.regex.Pattern;
public final class ja0 implements sf.c {
    public final pa0 f38120a;
    public final LaunchActivity f38121b;

    public ja0(LaunchActivity launchActivity) {
        this.f38121b = launchActivity;
        Pattern pattern = LaunchActivity.C1;
        this.f38120a = new pa0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.C1;
        this.f38121b.getWindow();
    }

    @Override
    public final void d() {
        this.f38120a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.C1;
        LaunchActivity launchActivity = this.f38121b;
        launchActivity.getClass();
        this.f38120a.a(true);
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
