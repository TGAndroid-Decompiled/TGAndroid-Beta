package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35766a;
    public final float f35767b;
    public final Object f35768c;

    public c0(Object obj, float f7, int i10) {
        this.f35766a = i10;
        this.f35768c = obj;
        this.f35767b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35766a) {
            case 0:
                ((l4) this.f35768c).f38771h0.M.c(this.f35767b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35768c;
                if (ibVar.f27214a.getTranslationX() == this.f35767b) {
                    ibVar.f27223y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35768c;
                float f7 = this.f35767b;
                ah1 ah1Var = y0Var.f31839c;
                if (f7 > 0.0f) {
                    int i10 = ah1Var.f31358w;
                    if (i10 < 2) {
                        ah1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ah1Var.f31358w;
                    if (i11 > 0) {
                        ah1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31838b = false;
                return;
            case 3:
                ((p70) this.f35768c).f40090f.e.smoothScrollTo(0, (int) this.f35767b);
                return;
            case 4:
                float f10 = this.f35767b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35768c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35768c, this.f35767b);
                return;
        }
    }
}
