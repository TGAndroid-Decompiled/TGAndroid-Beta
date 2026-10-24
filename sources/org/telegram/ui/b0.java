package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f35872a;
    public final float f35873b;
    public final Object f35874c;

    public b0(Object obj, float f7, int i10) {
        this.f35872a = i10;
        this.f35874c = obj;
        this.f35873b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35872a) {
            case 0:
                ((k4) this.f35874c).f38762h0.M.c(this.f35873b, true);
                return;
            case 1:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) this.f35874c;
                if (gbVar.f26605a.getTranslationX() == this.f35873b) {
                    gbVar.f26614y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35874c;
                float f7 = this.f35873b;
                gh1 gh1Var = y0Var.f31990c;
                if (f7 > 0.0f) {
                    int i10 = gh1Var.f31509w;
                    if (i10 < 2) {
                        gh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = gh1Var.f31509w;
                    if (i11 > 0) {
                        gh1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31989b = false;
                return;
            case 3:
                ((u70) this.f35874c).f42341f.e.smoothScrollTo(0, (int) this.f35873b);
                return;
            case 4:
                float f10 = this.f35873b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35874c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35874c, this.f35873b);
                return;
        }
    }
}
