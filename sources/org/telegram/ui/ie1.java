package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class ie1 implements org.telegram.ui.Components.b81 {
    public final WallpapersListActivity f38254a;

    public ie1(WallpapersListActivity wallpapersListActivity) {
        this.f38254a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        m91 m91Var = new m91(new ne1(file, file, ""), bitmap, false);
        m91Var.g1(0L);
        this.f38254a.presentFragment(m91Var, z10);
    }

    @Override
    public final void a() {
    }
}
