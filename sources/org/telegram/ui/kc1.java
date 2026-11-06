package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class kc1 implements org.telegram.ui.Components.a71 {
    public final WallpapersListActivity f47168a;

    public kc1(WallpapersListActivity wallpapersListActivity) {
        this.f47168a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        u71 u71Var = new u71(new pc1(file, file, ""), bitmap, false);
        u71Var.h1(0L);
        this.f47168a.presentFragment(u71Var, z9);
    }

    @Override
    public final void a() {
    }
}
