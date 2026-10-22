package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35765a;
    public final float f35766b;
    public final Object f35767c;

    public c0(Object obj, float f7, int i10) {
        this.f35765a = i10;
        this.f35767c = obj;
        this.f35766b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35765a) {
            case 0:
                ((l4) this.f35767c).f38770h0.M.c(this.f35766b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35767c;
                if (ibVar.f27213a.getTranslationX() == this.f35766b) {
                    ibVar.f27222y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35767c;
                float f7 = this.f35766b;
                ah1 ah1Var = y0Var.f31838c;
                if (f7 > 0.0f) {
                    int i10 = ah1Var.f31357w;
                    if (i10 < 2) {
                        ah1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ah1Var.f31357w;
                    if (i11 > 0) {
                        ah1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31837b = false;
                return;
            case 3:
                ((p70) this.f35767c).f40089f.e.smoothScrollTo(0, (int) this.f35766b);
                return;
            case 4:
                float f10 = this.f35766b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35767c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35767c, this.f35766b);
                return;
        }
    }
}
