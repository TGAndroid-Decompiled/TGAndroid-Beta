package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f32009a;
    public final float f32010b;
    public final Object f32011c;

    public b0(Object obj, float f7, int i10) {
        this.f32009a = i10;
        this.f32011c = obj;
        this.f32010b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32009a) {
            case 0:
                ((h4) this.f32011c).f34156h0.M.c(this.f32010b, true);
                return;
            case 1:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) this.f32011c;
                if (gbVar.f24155a.getTranslationX() == this.f32010b) {
                    gbVar.f24164y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32011c;
                float f7 = this.f32010b;
                mi1 mi1Var = a1Var.f28847c;
                if (f7 > 0.0f) {
                    int i10 = mi1Var.f28889w;
                    if (i10 < 2) {
                        mi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = mi1Var.f28889w;
                    if (i11 > 0) {
                        mi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f28846b = false;
                return;
            case 3:
                ((l80) this.f32011c).f35478f.e.smoothScrollTo(0, (int) this.f32010b);
                return;
            case 4:
                float f10 = this.f32010b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32011c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32011c, this.f32010b);
                return;
        }
    }
}
