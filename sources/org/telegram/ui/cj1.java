package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class cj1 implements org.telegram.ui.Components.v91 {
    public final WallpapersListActivity f36739a;

    public cj1(WallpapersListActivity wallpapersListActivity) {
        this.f36739a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        xd1 xd1Var = new xd1(new jj1(file, file, ""), bitmap, false);
        xd1Var.c1(0L);
        this.f36739a.presentFragment(xd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
