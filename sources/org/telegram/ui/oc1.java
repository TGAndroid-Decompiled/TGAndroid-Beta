package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class oc1 implements org.telegram.ui.Components.b71 {
    public final WallpapersListActivity f48432a;

    public oc1(WallpapersListActivity wallpapersListActivity) {
        this.f48432a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        w71 w71Var = new w71(new tc1(file, file, ""), bitmap, false);
        w71Var.h1(0L);
        this.f48432a.presentFragment(w71Var, z9);
    }

    @Override
    public final void a() {
    }
}
