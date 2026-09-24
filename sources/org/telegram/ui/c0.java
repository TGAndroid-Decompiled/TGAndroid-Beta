package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f32517a;
    public final float f32518b;
    public final Object f32519c;

    public c0(Object obj, float f7, int i10) {
        this.f32517a = i10;
        this.f32519c = obj;
        this.f32518b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32517a) {
            case 0:
                ((i4) this.f32519c).f34382h0.M.c(this.f32518b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f32519c;
                if (ibVar.f24970a.getTranslationX() == this.f32518b) {
                    ibVar.f24979y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32519c;
                float f7 = this.f32518b;
                fi1 fi1Var = a1Var.f29253c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f29299w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f29299w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29252b = false;
                return;
            case 3:
                ((e80) this.f32519c).f33272f.e.smoothScrollTo(0, (int) this.f32518b);
                return;
            case 4:
                float f10 = this.f32518b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32519c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32519c, this.f32518b);
                return;
        }
    }
}
