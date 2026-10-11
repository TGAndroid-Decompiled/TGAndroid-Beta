package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f36214a;
    public final float f36215b;
    public final Object f36216c;

    public b0(Object obj, float f7, int i10) {
        this.f36214a = i10;
        this.f36216c = obj;
        this.f36215b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36214a) {
            case 0:
                ((h4) this.f36216c).f38273h0.M.c(this.f36215b, true);
                return;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.f36216c;
                if (kbVar.f27909a.getTranslationX() == this.f36215b) {
                    kbVar.f27919y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f36216c;
                float f7 = this.f36215b;
                ni1 ni1Var = b1Var.f31910c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f31966w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f31966w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                b1Var.f31909b = false;
                return;
            case 3:
                ((i80) this.f36216c).f38607f.f39225e.smoothScrollTo(0, (int) this.f36215b);
                return;
            case 4:
                float f10 = this.f36215b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36216c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36216c, this.f36215b);
                return;
        }
    }
}
