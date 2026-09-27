package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class qi1 implements org.telegram.ui.Components.e91 {
    public final WallpapersListActivity f36757a;

    public qi1(WallpapersListActivity wallpapersListActivity) {
        this.f36757a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        pd1 pd1Var = new pd1(new xi1(file, file, ""), bitmap, false);
        pd1Var.c1(0L);
        this.f36757a.presentFragment(pd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
