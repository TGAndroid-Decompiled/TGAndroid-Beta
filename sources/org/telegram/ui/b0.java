package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f34604a;
    public final float f34605b;
    public final Object f34606c;

    public b0(Object obj, float f7, int i10) {
        this.f34604a = i10;
        this.f34606c = obj;
        this.f34605b = f7;
    }

    @Override
    public final void run() {
        switch (this.f34604a) {
            case 0:
                ((i4) this.f34606c).f37248h0.M.c(this.f34605b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f34606c;
                if (ibVar.f27086a.getTranslationX() == this.f34605b) {
                    ibVar.f27096y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f34606c;
                float f7 = this.f34605b;
                ni1 ni1Var = y0Var.f31971c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f31450w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f31450w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31970b = false;
                return;
            case 3:
                ((j80) this.f34606c).f37722f.f38250e.smoothScrollTo(0, (int) this.f34605b);
                return;
            case 4:
                float f10 = this.f34605b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f34606c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f34606c, this.f34605b);
                return;
        }
    }
}
