package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class e0 implements Runnable {
    public final int f37658a;
    public final float f37659b;
    public final Object f37660c;

    public e0(Object obj, float f9, int i10) {
        this.f37658a = i10;
        this.f37660c = obj;
        this.f37659b = f9;
    }

    @Override
    public final void run() {
        switch (this.f37658a) {
            case 0:
                ((m4) this.f37660c).f40392d0.I.c(this.f37659b, true);
                return;
            case 1:
                org.telegram.ui.Components.eb ebVar = (org.telegram.ui.Components.eb) this.f37660c;
                if (ebVar.f27988a.getTranslationX() == this.f37659b) {
                    ebVar.f27998y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f37660c;
                float f9 = this.f37659b;
                hh1 hh1Var = y0Var.f34130c;
                if (f9 > 0.0f) {
                    int i10 = hh1Var.f33628w;
                    if (i10 < 2) {
                        hh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = hh1Var.f33628w;
                    if (i11 > 0) {
                        hh1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f34129b = false;
                return;
            case 3:
                ((q70) this.f37660c).f41559f.f42296e.smoothScrollTo(0, (int) this.f37659b);
                return;
            case 4:
                float f10 = this.f37659b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f37660c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f37660c, this.f37659b);
                return;
        }
    }
}
