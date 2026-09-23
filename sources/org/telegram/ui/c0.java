package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f32205a;
    public final float f32206b;
    public final Object f32207c;

    public c0(Object obj, float f7, int i10) {
        this.f32205a = i10;
        this.f32207c = obj;
        this.f32206b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32205a) {
            case 0:
                ((i4) this.f32207c).f34009h0.M.c(this.f32206b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f32207c;
                if (ibVar.f24927a.getTranslationX() == this.f32206b) {
                    ibVar.f24936y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32207c;
                float f7 = this.f32206b;
                fi1 fi1Var = a1Var.f28841c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f28883w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f28883w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f28840b = false;
                return;
            case 3:
                ((g80) this.f32207c).f33485f.e.smoothScrollTo(0, (int) this.f32206b);
                return;
            case 4:
                float f10 = this.f32206b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32207c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32207c, this.f32206b);
                return;
        }
    }
}
