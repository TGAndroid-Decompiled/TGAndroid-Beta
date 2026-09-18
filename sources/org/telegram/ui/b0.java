package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f32013a;
    public final float f32014b;
    public final Object f32015c;

    public b0(Object obj, float f7, int i10) {
        this.f32013a = i10;
        this.f32015c = obj;
        this.f32014b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32013a) {
            case 0:
                ((h4) this.f32015c).f34161h0.M.c(this.f32014b, true);
                return;
            case 1:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) this.f32015c;
                if (gbVar.f24158a.getTranslationX() == this.f32014b) {
                    gbVar.f24167y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32015c;
                float f7 = this.f32014b;
                mi1 mi1Var = a1Var.f28850c;
                if (f7 > 0.0f) {
                    int i10 = mi1Var.f28892w;
                    if (i10 < 2) {
                        mi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = mi1Var.f28892w;
                    if (i11 > 0) {
                        mi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f28849b = false;
                return;
            case 3:
                ((l80) this.f32015c).f35483f.e.smoothScrollTo(0, (int) this.f32014b);
                return;
            case 4:
                float f10 = this.f32014b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32015c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32015c, this.f32014b);
                return;
        }
    }
}
