package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35762a;
    public final float f35763b;
    public final Object f35764c;

    public c0(Object obj, float f7, int i10) {
        this.f35762a = i10;
        this.f35764c = obj;
        this.f35763b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35762a) {
            case 0:
                ((l4) this.f35764c).f38762h0.M.c(this.f35763b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35764c;
                if (ibVar.f27175a.getTranslationX() == this.f35763b) {
                    ibVar.f27184y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35764c;
                float f7 = this.f35763b;
                ah1 ah1Var = y0Var.f31885c;
                if (f7 > 0.0f) {
                    int i10 = ah1Var.f31404w;
                    if (i10 < 2) {
                        ah1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ah1Var.f31404w;
                    if (i11 > 0) {
                        ah1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31884b = false;
                return;
            case 3:
                ((p70) this.f35764c).f40089f.e.smoothScrollTo(0, (int) this.f35763b);
                return;
            case 4:
                float f10 = this.f35763b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35764c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35764c, this.f35763b);
                return;
        }
    }
}
