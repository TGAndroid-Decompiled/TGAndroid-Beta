package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f34603a;
    public final float f34604b;
    public final Object f34605c;

    public b0(Object obj, float f7, int i10) {
        this.f34603a = i10;
        this.f34605c = obj;
        this.f34604b = f7;
    }

    @Override
    public final void run() {
        switch (this.f34603a) {
            case 0:
                ((i4) this.f34605c).f37247h0.M.c(this.f34604b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f34605c;
                if (ibVar.f27085a.getTranslationX() == this.f34604b) {
                    ibVar.f27095y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f34605c;
                float f7 = this.f34604b;
                ni1 ni1Var = y0Var.f31970c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f31449w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f31449w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31969b = false;
                return;
            case 3:
                ((j80) this.f34605c).f37721f.f38249e.smoothScrollTo(0, (int) this.f34604b);
                return;
            case 4:
                float f10 = this.f34604b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f34605c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f34605c, this.f34604b);
                return;
        }
    }
}
