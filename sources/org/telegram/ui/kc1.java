package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class kc1 implements org.telegram.ui.Components.b71 {
    public final WallpapersListActivity f48629a;

    public kc1(WallpapersListActivity wallpapersListActivity) {
        this.f48629a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        t71 t71Var = new t71(new pc1(file, file, ""), bitmap, false);
        t71Var.h1(0L);
        this.f48629a.presentFragment(t71Var, z10);
    }

    @Override
    public final void a() {
    }
}
