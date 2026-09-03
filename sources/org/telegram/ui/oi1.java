package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class oi1 implements org.telegram.ui.Components.r81 {
    public final WallpapersListActivity f36826a;

    public oi1(WallpapersListActivity wallpapersListActivity) {
        this.f36826a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        jd1 jd1Var = new jd1(new vi1(file, file, ""), bitmap, false);
        jd1Var.c1(0L);
        this.f36826a.presentFragment(jd1Var, z4);
    }

    @Override
    public final void a() {
    }
}
