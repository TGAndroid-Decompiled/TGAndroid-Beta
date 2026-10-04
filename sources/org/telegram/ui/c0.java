package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35220a;
    public final float f35221b;
    public final Object f35222c;

    public c0(Object obj, float f7, int i10) {
        this.f35220a = i10;
        this.f35222c = obj;
        this.f35221b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35220a) {
            case 0:
                ((i4) this.f35222c).f37262h0.M.c(this.f35221b, true);
                return;
            case 1:
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.f35222c;
                if (jbVar.f27708a.getTranslationX() == this.f35221b) {
                    jbVar.f27718y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f35222c;
                float f7 = this.f35221b;
                fi1 fi1Var = a1Var.f31760c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f31810w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f31810w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f31759b = false;
                return;
            case 3:
                ((i80) this.f35222c).f37312f.f37880e.smoothScrollTo(0, (int) this.f35221b);
                return;
            case 4:
                float f10 = this.f35221b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35222c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35222c, this.f35221b);
                return;
        }
    }
}
