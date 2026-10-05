package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class qi1 implements org.telegram.ui.Components.n91 {
    public final WallpapersListActivity f39808a;

    public qi1(WallpapersListActivity wallpapersListActivity) {
        this.f39808a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        pd1 pd1Var = new pd1(new xi1(file, file, ""), bitmap, false);
        pd1Var.c1(0L);
        this.f39808a.presentFragment(pd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
