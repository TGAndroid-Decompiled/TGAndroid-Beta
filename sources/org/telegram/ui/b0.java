package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f37925a;
    public final float f37926b;
    public final Object f37927c;

    public b0(Object obj, float f7, int i10) {
        this.f37925a = i10;
        this.f37927c = obj;
        this.f37926b = f7;
    }

    @Override
    public final void run() {
        switch (this.f37925a) {
            case 0:
                ((j4) this.f37927c).f40434h0.M.c(this.f37926b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f37927c;
                if (ibVar.f29253a.getTranslationX() == this.f37926b) {
                    ibVar.f29262y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yb1 yb1Var = (org.telegram.ui.Components.yb1) this.f37927c;
                float f7 = this.f37926b;
                if (!yb1Var.f35015s) {
                    yb1Var.f35000a.removeCallbacks(yb1Var.O);
                    int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i10 > 0) {
                        yb1Var.f35000a.postDelayed(yb1Var.O, (long) Math.ceil(f7));
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
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f37927c;
                float f10 = this.f37926b;
                ih1 ih1Var = y0Var.f34212c;
                if (f10 > 0.0f) {
                    int i11 = ih1Var.f33738w;
                    if (i11 < 2) {
                        ih1Var.c(i11 + 1, true);
                    }
                } else {
                    int i12 = ih1Var.f33738w;
                    if (i12 > 0) {
                        ih1Var.c(i12 - 1, true);
                    }
                }
                y0Var.f34211b = false;
                return;
            case 4:
                float f11 = this.f37926b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f37927c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f37927c, this.f37926b);
                return;
        }
    }
}
