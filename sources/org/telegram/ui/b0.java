package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f37928a;
    public final float f37929b;
    public final Object f37930c;

    public b0(Object obj, float f7, int i10) {
        this.f37928a = i10;
        this.f37930c = obj;
        this.f37929b = f7;
    }

    @Override
    public final void run() {
        switch (this.f37928a) {
            case 0:
                ((j4) this.f37930c).f40437h0.M.c(this.f37929b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f37930c;
                if (ibVar.f29255a.getTranslationX() == this.f37929b) {
                    ibVar.f29264y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yb1 yb1Var = (org.telegram.ui.Components.yb1) this.f37930c;
                float f7 = this.f37929b;
                if (!yb1Var.f35018s) {
                    yb1Var.f35003a.removeCallbacks(yb1Var.O);
                    int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i10 > 0) {
                        yb1Var.f35003a.postDelayed(yb1Var.O, (long) Math.ceil(f7));
                        return;
                    } else if (i10 == 0) {
                        yb1Var.c();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f37930c;
                float f10 = this.f37929b;
                ih1 ih1Var = y0Var.f34215c;
                if (f10 > 0.0f) {
                    int i11 = ih1Var.f33741w;
                    if (i11 < 2) {
                        ih1Var.c(i11 + 1, true);
                    }
                } else {
                    int i12 = ih1Var.f33741w;
                    if (i12 > 0) {
                        ih1Var.c(i12 - 1, true);
                    }
                }
                y0Var.f34214b = false;
                return;
            case 4:
                float f11 = this.f37929b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f37930c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f37930c, this.f37929b);
                return;
        }
    }
}
