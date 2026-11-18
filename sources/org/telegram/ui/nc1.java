package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class nc1 implements org.telegram.ui.Components.l71 {
    public final WallpapersListActivity f50157a;

    public nc1(WallpapersListActivity wallpapersListActivity) {
        this.f50157a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        x71 x71Var = new x71(new sc1(file, file, ""), bitmap, false);
        x71Var.h1(0L);
        this.f50157a.presentFragment(x71Var, z10);
    }

    @Override
    public final void a() {
    }
}
