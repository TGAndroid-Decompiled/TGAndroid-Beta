package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f32012a;
    public final float f32013b;
    public final Object f32014c;

    public b0(Object obj, float f7, int i10) {
        this.f32012a = i10;
        this.f32014c = obj;
        this.f32013b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32012a) {
            case 0:
                ((h4) this.f32014c).f34139h0.M.c(this.f32013b, true);
                return;
            case 1:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) this.f32014c;
                if (gbVar.f24286a.getTranslationX() == this.f32013b) {
                    gbVar.f24295y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32014c;
                float f7 = this.f32013b;
                mi1 mi1Var = a1Var.f28870c;
                if (f7 > 0.0f) {
                    int i10 = mi1Var.f28912w;
                    if (i10 < 2) {
                        mi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = mi1Var.f28912w;
                    if (i11 > 0) {
                        mi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f28869b = false;
                return;
            case 3:
                ((j80) this.f32014c).f34833f.e.smoothScrollTo(0, (int) this.f32013b);
                return;
            case 4:
                float f10 = this.f32013b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32014c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32014c, this.f32013b);
                return;
        }
    }
}
