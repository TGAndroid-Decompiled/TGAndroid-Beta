package org.telegram.ui;

import java.util.regex.Pattern;
public final class na0 implements sf.c {
    public final ta0 f39833a;
    public final LaunchActivity f39834b;

    public na0(LaunchActivity launchActivity) {
        this.f39834b = launchActivity;
        Pattern pattern = LaunchActivity.E1;
        this.f39833a = new ta0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.E1;
        this.f39834b.getWindow();
    }

    @Override
    public final void d() {
        this.f39833a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.E1;
        LaunchActivity launchActivity = this.f39834b;
        launchActivity.getClass();
        this.f39833a.a(true);
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
