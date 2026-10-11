package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class aj1 implements org.telegram.ui.Components.v91 {
    public final WallpapersListActivity f36137a;

    public aj1(WallpapersListActivity wallpapersListActivity) {
        this.f36137a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        wd1 wd1Var = new wd1(new hj1(file, file, ""), bitmap, false);
        wd1Var.c1(0L);
        this.f36137a.presentFragment(wd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
