package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35755a;
    public final float f35756b;
    public final Object f35757c;

    public c0(Object obj, float f7, int i10) {
        this.f35755a = i10;
        this.f35757c = obj;
        this.f35756b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35755a) {
            case 0:
                ((l4) this.f35757c).f38760h0.M.c(this.f35756b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35757c;
                if (ibVar.f27173a.getTranslationX() == this.f35756b) {
                    ibVar.f27182y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35757c;
                float f7 = this.f35756b;
                ah1 ah1Var = y0Var.f31883c;
                if (f7 > 0.0f) {
                    int i10 = ah1Var.f31402w;
                    if (i10 < 2) {
                        ah1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ah1Var.f31402w;
                    if (i11 > 0) {
                        ah1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31882b = false;
                return;
            case 3:
                ((p70) this.f35757c).f40080f.e.smoothScrollTo(0, (int) this.f35756b);
                return;
            case 4:
                float f10 = this.f35756b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35757c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35757c, this.f35756b);
                return;
        }
    }
}
