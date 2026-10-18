package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class ph1 implements org.telegram.ui.Components.i91 {
    public final WallpapersListActivity f40155a;

    public ph1(WallpapersListActivity wallpapersListActivity) {
        this.f40155a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        mc1 mc1Var = new mc1(new vh1(file, file, ""), bitmap, false);
        mc1Var.c1(0L);
        this.f40155a.presentFragment(mc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
