package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class dj1 implements org.telegram.ui.Components.aa1 {
    public final WallpapersListActivity f36838a;

    public dj1(WallpapersListActivity wallpapersListActivity) {
        this.f36838a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        zd1 zd1Var = new zd1(new kj1(file, file, ""), bitmap, false);
        zd1Var.c1(0L);
        this.f36838a.presentFragment(zd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
