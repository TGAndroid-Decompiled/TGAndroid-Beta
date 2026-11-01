package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class ge1 implements org.telegram.ui.Components.c81 {
    public final WallpapersListActivity f37466a;

    public ge1(WallpapersListActivity wallpapersListActivity) {
        this.f37466a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        k91 k91Var = new k91(new le1(file, file, ""), bitmap, false);
        k91Var.h1(0L);
        this.f37466a.presentFragment(k91Var, z10);
    }

    @Override
    public final void a() {
    }
}
