package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f32206a;
    public final float f32207b;
    public final Object f32208c;

    public b0(Object obj, float f7, int i10) {
        this.f32206a = i10;
        this.f32208c = obj;
        this.f32207b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32206a) {
            case 0:
                ((h4) this.f32208c).f34062h0.M.c(this.f32207b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f32208c;
                if (ibVar.f24888a.getTranslationX() == this.f32207b) {
                    ibVar.f24897y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32208c;
                float f7 = this.f32207b;
                li1 li1Var = a1Var.f29166c;
                if (f7 > 0.0f) {
                    int i10 = li1Var.f29208w;
                    if (i10 < 2) {
                        li1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = li1Var.f29208w;
                    if (i11 > 0) {
                        li1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29165b = false;
                return;
            case 3:
                ((j80) this.f32208c).f34726f.e.smoothScrollTo(0, (int) this.f32207b);
                return;
            case 4:
                float f10 = this.f32207b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32208c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32208c, this.f32207b);
                return;
        }
    }
}
