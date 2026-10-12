package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f36288a;
    public final float f36289b;
    public final Object f36290c;

    public c0(Object obj, float f7, int i10) {
        this.f36288a = i10;
        this.f36290c = obj;
        this.f36289b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36288a) {
            case 0:
                ((i4) this.f36290c).f38652h0.M.c(this.f36289b, true);
                return;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.f36290c;
                if (kbVar.f27805a.getTranslationX() == this.f36289b) {
                    kbVar.f27815y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f36290c;
                float f7 = this.f36289b;
                qi1 qi1Var = b1Var.f31596c;
                if (f7 > 0.0f) {
                    int i10 = qi1Var.f31652w;
                    if (i10 < 2) {
                        qi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = qi1Var.f31652w;
                    if (i11 > 0) {
                        qi1Var.c(i11 - 1, true);
                    }
                }
                b1Var.f31595b = false;
                return;
            case 3:
                ((l80) this.f36290c).f39661f.f40321e.smoothScrollTo(0, (int) this.f36289b);
                return;
            case 4:
                float f10 = this.f36289b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36290c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36290c, this.f36289b);
                return;
        }
    }
}
