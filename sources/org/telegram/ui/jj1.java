package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class jj1 implements org.telegram.ui.Components.q91 {
    public final WallpapersListActivity f37400a;

    public jj1(WallpapersListActivity wallpapersListActivity) {
        this.f37400a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        ce1 ce1Var = new ce1(new qj1(file, file, ""), bitmap, false);
        ce1Var.c1(0L);
        this.f37400a.presentFragment(ce1Var, z10);
    }

    @Override
    public final void a() {
    }
}
