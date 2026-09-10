package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class fj1 implements org.telegram.ui.Components.b91 {
    public final WallpapersListActivity f32853a;

    public fj1(WallpapersListActivity wallpapersListActivity) {
        this.f32853a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        ae1 ae1Var = new ae1(new lj1(file, file, ""), bitmap, false);
        ae1Var.c1(0L);
        this.f32853a.presentFragment(ae1Var, z10);
    }

    @Override
    public final void a() {
    }
}
