package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f32531a;
    public final float f32532b;
    public final Object f32533c;

    public c0(Object obj, float f7, int i10) {
        this.f32531a = i10;
        this.f32533c = obj;
        this.f32532b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32531a) {
            case 0:
                ((i4) this.f32533c).f34395h0.M.c(this.f32532b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f32533c;
                if (ibVar.f24995a.getTranslationX() == this.f32532b) {
                    ibVar.f25004y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32533c;
                float f7 = this.f32532b;
                fi1 fi1Var = a1Var.f29262c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f29308w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f29308w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29261b = false;
                return;
            case 3:
                ((e80) this.f32533c).f33299f.e.smoothScrollTo(0, (int) this.f32532b);
                return;
            case 4:
                float f10 = this.f32532b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32533c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32533c, this.f32532b);
                return;
        }
    }
}
