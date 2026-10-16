package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class ij1 implements org.telegram.ui.Components.r91 {
    public final WallpapersListActivity f36827a;

    public ij1(WallpapersListActivity wallpapersListActivity) {
        this.f36827a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        ce1 ce1Var = new ce1(new pj1(file, file, ""), bitmap, false);
        ce1Var.c1(0L);
        this.f36827a.presentFragment(ce1Var, z10);
    }

    @Override
    public final void a() {
    }
}
