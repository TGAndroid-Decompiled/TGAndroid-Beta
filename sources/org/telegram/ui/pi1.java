package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class pi1 implements org.telegram.ui.Components.r81 {
    public final WallpapersListActivity f40028a;

    public pi1(WallpapersListActivity wallpapersListActivity) {
        this.f40028a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        jd1 jd1Var = new jd1(new wi1(file, file, ""), bitmap, false);
        jd1Var.c1(0L);
        this.f40028a.presentFragment(jd1Var, z4);
    }

    @Override
    public final void a() {
    }
}
