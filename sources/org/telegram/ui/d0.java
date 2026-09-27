package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class d0 implements Runnable {
    public final int f32827a;
    public final float f32828b;
    public final Object f32829c;

    public d0(Object obj, float f7, int i10) {
        this.f32827a = i10;
        this.f32829c = obj;
        this.f32828b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32827a) {
            case 0:
                ((j4) this.f32829c).f34615h0.M.c(this.f32828b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f32829c;
                if (ibVar.f25073a.getTranslationX() == this.f32828b) {
                    ibVar.f25082y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32829c;
                float f7 = this.f32828b;
                di1 di1Var = a1Var.f29205c;
                if (f7 > 0.0f) {
                    int i10 = di1Var.f29251w;
                    if (i10 < 2) {
                        di1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = di1Var.f29251w;
                    if (i11 > 0) {
                        di1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29204b = false;
                return;
            case 3:
                ((h80) this.f32829c).f34163f.e.smoothScrollTo(0, (int) this.f32828b);
                return;
            case 4:
                float f10 = this.f32828b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32829c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32829c, this.f32828b);
                return;
        }
    }
}
