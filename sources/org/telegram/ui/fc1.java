package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class fc1 implements org.telegram.ui.Components.s61 {
    public final WallpapersListActivity f45258a;

    public fc1(WallpapersListActivity wallpapersListActivity) {
        this.f45258a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        l71 l71Var = new l71(new lc1(file, file, ""), bitmap, false);
        l71Var.h1(0L);
        this.f45258a.presentFragment(l71Var, z10);
    }

    @Override
    public final void a() {
    }
}
