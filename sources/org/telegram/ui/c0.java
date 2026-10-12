package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f36286a;
    public final float f36287b;
    public final Object f36288c;

    public c0(Object obj, float f7, int i10) {
        this.f36286a = i10;
        this.f36288c = obj;
        this.f36287b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36286a) {
            case 0:
                ((i4) this.f36288c).f38649h0.M.c(this.f36287b, true);
                return;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.f36288c;
                if (kbVar.f27802a.getTranslationX() == this.f36287b) {
                    kbVar.f27812y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f36288c;
                float f7 = this.f36287b;
                qi1 qi1Var = b1Var.f31611c;
                if (f7 > 0.0f) {
                    int i10 = qi1Var.f31667w;
                    if (i10 < 2) {
                        qi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = qi1Var.f31667w;
                    if (i11 > 0) {
                        qi1Var.c(i11 - 1, true);
                    }
                }
                b1Var.f31610b = false;
                return;
            case 3:
                ((l80) this.f36288c).f39667f.f40318e.smoothScrollTo(0, (int) this.f36287b);
                return;
            case 4:
                float f10 = this.f36287b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36288c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36288c, this.f36287b);
                return;
        }
    }
}
