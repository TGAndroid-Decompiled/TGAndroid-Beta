package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class pc1 implements org.telegram.ui.Components.a71 {
    public final WallpapersListActivity f48754a;

    public pc1(WallpapersListActivity wallpapersListActivity) {
        this.f48754a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        x71 x71Var = new x71(new uc1(file, file, ""), bitmap, false);
        x71Var.h1(0L);
        this.f48754a.presentFragment(x71Var, z9);
    }

    @Override
    public final void a() {
    }
}
