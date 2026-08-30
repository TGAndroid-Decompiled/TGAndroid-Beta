package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class gi1 implements org.telegram.ui.Components.r81 {
    public final WallpapersListActivity f34631a;

    public gi1(WallpapersListActivity wallpapersListActivity) {
        this.f34631a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        cd1 cd1Var = new cd1(new ni1(file, file, ""), bitmap, false);
        cd1Var.c1(0L);
        this.f34631a.presentFragment(cd1Var, z4);
    }

    @Override
    public final void a() {
    }
}
