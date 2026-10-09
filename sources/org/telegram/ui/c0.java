package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f36470a;
    public final float f36471b;
    public final Object f36472c;

    public c0(Object obj, float f7, int i10) {
        this.f36470a = i10;
        this.f36472c = obj;
        this.f36471b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36470a) {
            case 0:
                ((i4) this.f36472c).f38503h0.M.c(this.f36471b, true);
                return;
            case 1:
                org.telegram.ui.Components.lb lbVar = (org.telegram.ui.Components.lb) this.f36472c;
                if (lbVar.f28406a.getTranslationX() == this.f36471b) {
                    lbVar.f28416y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f36472c;
                float f7 = this.f36471b;
                pi1 pi1Var = a1Var.f31852c;
                if (f7 > 0.0f) {
                    int i10 = pi1Var.f31897w;
                    if (i10 < 2) {
                        pi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = pi1Var.f31897w;
                    if (i11 > 0) {
                        pi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f31851b = false;
                return;
            case 3:
                ((j80) this.f36472c).f38861f.f39465e.smoothScrollTo(0, (int) this.f36471b);
                return;
            case 4:
                float f10 = this.f36471b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36472c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36472c, this.f36471b);
                return;
        }
    }
}
