package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class aj1 implements org.telegram.ui.Components.o81 {
    public final WallpapersListActivity f34489a;

    public aj1(WallpapersListActivity wallpapersListActivity) {
        this.f34489a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        wd1 wd1Var = new wd1(new hj1(file, file, ""), bitmap, false);
        wd1Var.c1(0L);
        this.f34489a.presentFragment(wd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
