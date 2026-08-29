package org.telegram.ui;

import java.util.regex.Pattern;
public final class ma0 implements bf.c {
    public final jf.s0 f40504a;
    public final LaunchActivity f40505b;

    public ma0(LaunchActivity launchActivity) {
        this.f40505b = launchActivity;
        Pattern pattern = LaunchActivity.f35560x1;
        this.f40504a = new jf.s0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.f35560x1;
        this.f40505b.getWindow();
    }

    @Override
    public final void d() {
        this.f40504a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.f35560x1;
        LaunchActivity launchActivity = this.f40505b;
        launchActivity.getClass();
        this.f40504a.a(true);
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
