package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f36468a;
    public final float f36469b;
    public final Object f36470c;

    public c0(Object obj, float f7, int i10) {
        this.f36468a = i10;
        this.f36470c = obj;
        this.f36469b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36468a) {
            case 0:
                ((i4) this.f36470c).f38501h0.M.c(this.f36469b, true);
                return;
            case 1:
                org.telegram.ui.Components.lb lbVar = (org.telegram.ui.Components.lb) this.f36470c;
                if (lbVar.f28406a.getTranslationX() == this.f36469b) {
                    lbVar.f28416y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f36470c;
                float f7 = this.f36469b;
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
                ((j80) this.f36470c).f38859f.f39463e.smoothScrollTo(0, (int) this.f36469b);
                return;
            case 4:
                float f10 = this.f36469b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36470c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36470c, this.f36469b);
                return;
        }
    }
}
