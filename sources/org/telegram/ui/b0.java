package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f35806a;
    public final float f35807b;
    public final Object f35808c;

    public b0(Object obj, float f7, int i10) {
        this.f35806a = i10;
        this.f35808c = obj;
        this.f35807b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35806a) {
            case 0:
                ((k4) this.f35808c).f38793h0.M.c(this.f35807b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35808c;
                if (ibVar.f27265a.getTranslationX() == this.f35807b) {
                    ibVar.f27274y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35808c;
                float f7 = this.f35807b;
                hh1 hh1Var = y0Var.f32020c;
                if (f7 > 0.0f) {
                    int i10 = hh1Var.f31539w;
                    if (i10 < 2) {
                        hh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = hh1Var.f31539w;
                    if (i11 > 0) {
                        hh1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f32019b = false;
                return;
            case 3:
                ((u70) this.f35808c).f42294f.e.smoothScrollTo(0, (int) this.f35807b);
                return;
            case 4:
                float f10 = this.f35807b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35808c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35808c, this.f35807b);
                return;
        }
    }
}
