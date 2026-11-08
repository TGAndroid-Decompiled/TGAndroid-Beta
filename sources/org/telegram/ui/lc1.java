package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class lc1 implements org.telegram.ui.Components.a71 {
    public final WallpapersListActivity f47510a;

    public lc1(WallpapersListActivity wallpapersListActivity) {
        this.f47510a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        v71 v71Var = new v71(new qc1(file, file, ""), bitmap, false);
        v71Var.h1(0L);
        this.f47510a.presentFragment(v71Var, z9);
    }

    @Override
    public final void a() {
    }
}
