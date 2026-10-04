package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35226a;
    public final float f35227b;
    public final Object f35228c;

    public c0(Object obj, float f7, int i10) {
        this.f35226a = i10;
        this.f35228c = obj;
        this.f35227b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35226a) {
            case 0:
                ((i4) this.f35228c).f37268h0.M.c(this.f35227b, true);
                return;
            case 1:
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.f35228c;
                if (jbVar.f27714a.getTranslationX() == this.f35227b) {
                    jbVar.f27724y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f35228c;
                float f7 = this.f35227b;
                fi1 fi1Var = a1Var.f31767c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f31817w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f31817w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f31766b = false;
                return;
            case 3:
                ((i80) this.f35228c).f37318f.f37886e.smoothScrollTo(0, (int) this.f35227b);
                return;
            case 4:
                float f10 = this.f35227b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35228c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35228c, this.f35227b);
                return;
        }
    }
}
