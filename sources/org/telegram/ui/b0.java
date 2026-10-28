package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f37850a;
    public final float f37851b;
    public final Object f37852c;

    public b0(Object obj, float f7, int i10) {
        this.f37850a = i10;
        this.f37852c = obj;
        this.f37851b = f7;
    }

    @Override
    public final void run() {
        switch (this.f37850a) {
            case 0:
                ((j4) this.f37852c).f40402h0.M.c(this.f37851b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f37852c;
                if (ibVar.f29282a.getTranslationX() == this.f37851b) {
                    ibVar.f29291y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.dc1 dc1Var = (org.telegram.ui.Components.dc1) this.f37852c;
                float f7 = this.f37851b;
                if (!dc1Var.f27412t) {
                    dc1Var.f27396a.removeCallbacks(dc1Var.P);
                    int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i10 > 0) {
                        dc1Var.f27396a.postDelayed(dc1Var.P, (long) Math.ceil(f7));
                        return;
                    } else if (i10 == 0) {
                        dc1Var.d();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f37852c;
                float f10 = this.f37851b;
                kh1 kh1Var = y0Var.f34320c;
                if (f10 > 0.0f) {
                    int i11 = kh1Var.f33846w;
                    if (i11 < 2) {
                        kh1Var.c(i11 + 1, true);
                    }
                } else {
                    int i12 = kh1Var.f33846w;
                    if (i12 > 0) {
                        kh1Var.c(i12 - 1, true);
                    }
                }
                y0Var.f34319b = false;
                return;
            case 4:
                float f11 = this.f37851b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f37852c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f37852c, this.f37851b);
                return;
        }
    }
}
