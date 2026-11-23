package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class lc1 implements org.telegram.ui.Components.p71 {
    public final WallpapersListActivity f49723a;

    public lc1(WallpapersListActivity wallpapersListActivity) {
        this.f49723a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        v71 v71Var = new v71(new qc1(file, file, ""), bitmap, false);
        v71Var.h1(0L);
        this.f49723a.presentFragment(v71Var, z10);
    }

    @Override
    public final void a() {
    }
}
