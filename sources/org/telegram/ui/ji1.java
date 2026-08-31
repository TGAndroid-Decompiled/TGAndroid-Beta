package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class ji1 implements org.telegram.ui.Components.s81 {
    public final WallpapersListActivity f38169a;

    public ji1(WallpapersListActivity wallpapersListActivity) {
        this.f38169a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        ed1 ed1Var = new ed1(new qi1(file, file, ""), bitmap, false);
        ed1Var.c1(0L);
        this.f38169a.presentFragment(ed1Var, z4);
    }

    @Override
    public final void a() {
    }
}
