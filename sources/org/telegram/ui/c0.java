package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f36514a;
    public final float f36515b;
    public final Object f36516c;

    public c0(Object obj, float f7, int i10) {
        this.f36514a = i10;
        this.f36516c = obj;
        this.f36515b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36514a) {
            case 0:
                ((i4) this.f36516c).f38547h0.M.c(this.f36515b, true);
                return;
            case 1:
                org.telegram.ui.Components.lb lbVar = (org.telegram.ui.Components.lb) this.f36516c;
                if (lbVar.f28287a.getTranslationX() == this.f36515b) {
                    lbVar.f28297y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f36516c;
                float f7 = this.f36515b;
                pi1 pi1Var = a1Var.f31917c;
                if (f7 > 0.0f) {
                    int i10 = pi1Var.f31962w;
                    if (i10 < 2) {
                        pi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = pi1Var.f31962w;
                    if (i11 > 0) {
                        pi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f31916b = false;
                return;
            case 3:
                ((j80) this.f36516c).f38905f.f39509e.smoothScrollTo(0, (int) this.f36515b);
                return;
            case 4:
                float f10 = this.f36515b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36516c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36516c, this.f36515b);
                return;
        }
    }
}
