package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f31996a;
    public final float f31997b;
    public final Object f31998c;

    public b0(Object obj, float f7, int i10) {
        this.f31996a = i10;
        this.f31998c = obj;
        this.f31997b = f7;
    }

    @Override
    public final void run() {
        switch (this.f31996a) {
            case 0:
                ((h4) this.f31998c).f34078h0.M.c(this.f31997b, true);
                return;
            case 1:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) this.f31998c;
                if (gbVar.f24283a.getTranslationX() == this.f31997b) {
                    gbVar.f24292y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f31998c;
                float f7 = this.f31997b;
                ni1 ni1Var = a1Var.f28867c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f28909w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f28909w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f28866b = false;
                return;
            case 3:
                ((j80) this.f31998c).f34814f.e.smoothScrollTo(0, (int) this.f31997b);
                return;
            case 4:
                float f10 = this.f31997b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f31998c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f31998c, this.f31997b);
                return;
        }
    }
}
