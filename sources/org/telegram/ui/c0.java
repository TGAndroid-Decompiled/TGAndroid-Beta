package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f35785a;
    public final float f35786b;
    public final Object f35787c;

    public c0(Object obj, float f7, int i10) {
        this.f35785a = i10;
        this.f35787c = obj;
        this.f35786b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35785a) {
            case 0:
                ((l4) this.f35787c).f38758h0.M.c(this.f35786b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f35787c;
                if (ibVar.f27165a.getTranslationX() == this.f35786b) {
                    ibVar.f27174y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35787c;
                float f7 = this.f35786b;
                ch1 ch1Var = y0Var.f31881c;
                if (f7 > 0.0f) {
                    int i10 = ch1Var.f31400w;
                    if (i10 < 2) {
                        ch1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ch1Var.f31400w;
                    if (i11 > 0) {
                        ch1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31880b = false;
                return;
            case 3:
                ((r70) this.f35787c).f40620f.e.smoothScrollTo(0, (int) this.f35786b);
                return;
            case 4:
                float f10 = this.f35786b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35787c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35787c, this.f35786b);
                return;
        }
    }
}
