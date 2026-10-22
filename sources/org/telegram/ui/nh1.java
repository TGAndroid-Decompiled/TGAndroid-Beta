package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class nh1 implements org.telegram.ui.Components.k91 {
    public final WallpapersListActivity f39600a;

    public nh1(WallpapersListActivity wallpapersListActivity) {
        this.f39600a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        kc1 kc1Var = new kc1(new th1(file, file, ""), bitmap, false);
        kc1Var.c1(0L);
        this.f39600a.presentFragment(kc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
