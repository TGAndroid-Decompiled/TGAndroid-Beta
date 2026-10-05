package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35250a;
    public final float f35251b;
    public final Object f35252c;

    public c0(Object obj, float f7, int i10) {
        this.f35250a = i10;
        this.f35252c = obj;
        this.f35251b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35250a) {
            case 0:
                ((i4) this.f35252c).f37271h0.M.c(this.f35251b, true);
                return;
            case 1:
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.f35252c;
                if (jbVar.f27781a.getTranslationX() == this.f35251b) {
                    jbVar.f27791y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f35252c;
                float f7 = this.f35251b;
                di1 di1Var = a1Var.f31834c;
                if (f7 > 0.0f) {
                    int i10 = di1Var.f31884w;
                    if (i10 < 2) {
                        di1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = di1Var.f31884w;
                    if (i11 > 0) {
                        di1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f31833b = false;
                return;
            case 3:
                ((i80) this.f35252c).f37317f.f37909e.smoothScrollTo(0, (int) this.f35251b);
                return;
            case 4:
                float f10 = this.f35251b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35252c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35252c, this.f35251b);
                return;
        }
    }
}
