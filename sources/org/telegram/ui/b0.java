package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f32243a;
    public final float f32244b;
    public final Object f32245c;

    public b0(Object obj, float f7, int i10) {
        this.f32243a = i10;
        this.f32245c = obj;
        this.f32244b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32243a) {
            case 0:
                ((h4) this.f32245c).f34118h0.M.c(this.f32244b, true);
                return;
            case 1:
                org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) this.f32245c;
                if (hbVar.f24765a.getTranslationX() == this.f32244b) {
                    hbVar.f24774y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32245c;
                float f7 = this.f32244b;
                mi1 mi1Var = a1Var.f29235c;
                if (f7 > 0.0f) {
                    int i10 = mi1Var.f29277w;
                    if (i10 < 2) {
                        mi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = mi1Var.f29277w;
                    if (i11 > 0) {
                        mi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29234b = false;
                return;
            case 3:
                ((j80) this.f32245c).f34865f.e.smoothScrollTo(0, (int) this.f32244b);
                return;
            case 4:
                float f10 = this.f32244b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32245c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32245c, this.f32244b);
                return;
        }
    }
}
