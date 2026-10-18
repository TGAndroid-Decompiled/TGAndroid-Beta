package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35739a;
    public final float f35740b;
    public final Object f35741c;

    public c0(Object obj, float f7, int i10) {
        this.f35739a = i10;
        this.f35741c = obj;
        this.f35740b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35739a) {
            case 0:
                ((l4) this.f35741c).f38713h0.M.c(this.f35740b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35741c;
                if (ibVar.f27158a.getTranslationX() == this.f35740b) {
                    ibVar.f27167y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35741c;
                float f7 = this.f35740b;
                ch1 ch1Var = y0Var.f31874c;
                if (f7 > 0.0f) {
                    int i10 = ch1Var.f31393w;
                    if (i10 < 2) {
                        ch1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ch1Var.f31393w;
                    if (i11 > 0) {
                        ch1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31873b = false;
                return;
            case 3:
                ((r70) this.f35741c).f40586f.e.smoothScrollTo(0, (int) this.f35740b);
                return;
            case 4:
                float f10 = this.f35740b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35741c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35741c, this.f35740b);
                return;
        }
    }
}
