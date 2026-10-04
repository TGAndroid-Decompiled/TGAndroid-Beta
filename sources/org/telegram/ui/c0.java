package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35221a;
    public final float f35222b;
    public final Object f35223c;

    public c0(Object obj, float f7, int i10) {
        this.f35221a = i10;
        this.f35223c = obj;
        this.f35222b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35221a) {
            case 0:
                ((i4) this.f35223c).f37263h0.M.c(this.f35222b, true);
                return;
            case 1:
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.f35223c;
                if (jbVar.f27709a.getTranslationX() == this.f35222b) {
                    jbVar.f27719y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f35223c;
                float f7 = this.f35222b;
                fi1 fi1Var = a1Var.f31761c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f31811w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f31811w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f31760b = false;
                return;
            case 3:
                ((i80) this.f35223c).f37313f.f37881e.smoothScrollTo(0, (int) this.f35222b);
                return;
            case 4:
                float f10 = this.f35222b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35223c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35223c, this.f35222b);
                return;
        }
    }
}
