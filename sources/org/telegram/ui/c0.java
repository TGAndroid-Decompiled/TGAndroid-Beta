package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f32530a;
    public final float f32531b;
    public final Object f32532c;

    public c0(Object obj, float f7, int i10) {
        this.f32530a = i10;
        this.f32532c = obj;
        this.f32531b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32530a) {
            case 0:
                ((i4) this.f32532c).f34394h0.M.c(this.f32531b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f32532c;
                if (ibVar.f25036a.getTranslationX() == this.f32531b) {
                    ibVar.f25045y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32532c;
                float f7 = this.f32531b;
                fi1 fi1Var = a1Var.f29179c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f29225w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f29225w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29178b = false;
                return;
            case 3:
                ((e80) this.f32532c).f33298f.e.smoothScrollTo(0, (int) this.f32531b);
                return;
            case 4:
                float f10 = this.f32531b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32532c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32532c, this.f32531b);
                return;
        }
    }
}
