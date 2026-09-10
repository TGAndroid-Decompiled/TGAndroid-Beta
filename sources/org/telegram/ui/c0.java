package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f31476a;
    public final float f31477b;
    public final Object f31478c;

    public c0(Object obj, float f7, int i10) {
        this.f31476a = i10;
        this.f31478c = obj;
        this.f31477b = f7;
    }

    @Override
    public final void run() {
        switch (this.f31476a) {
            case 0:
                ((j4) this.f31478c).f33908h0.M.c(this.f31477b, true);
                return;
            case 1:
                org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) this.f31478c;
                if (hbVar.f23561a.getTranslationX() == this.f31477b) {
                    hbVar.f23570y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.f31478c;
                float f7 = this.f31477b;
                si1 si1Var = z0Var.f28555c;
                if (f7 > 0.0f) {
                    int i10 = si1Var.f28073w;
                    if (i10 < 2) {
                        si1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = si1Var.f28073w;
                    if (i11 > 0) {
                        si1Var.c(i11 - 1, true);
                    }
                }
                z0Var.f28554b = false;
                return;
            case 3:
                ((i80) this.f31478c).f33558f.e.smoothScrollTo(0, (int) this.f31477b);
                return;
            case 4:
                float f10 = this.f31477b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f31478c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f31478c, this.f31477b);
                return;
        }
    }
}
