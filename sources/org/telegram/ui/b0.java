package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f32225a;
    public final float f32226b;
    public final Object f32227c;

    public b0(Object obj, float f7, int i10) {
        this.f32225a = i10;
        this.f32227c = obj;
        this.f32226b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32225a) {
            case 0:
                ((h4) this.f32227c).f34102h0.M.c(this.f32226b, true);
                return;
            case 1:
                org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) this.f32227c;
                if (hbVar.f24591a.getTranslationX() == this.f32226b) {
                    hbVar.f24600y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32227c;
                float f7 = this.f32226b;
                mi1 mi1Var = a1Var.f29273c;
                if (f7 > 0.0f) {
                    int i10 = mi1Var.f29315w;
                    if (i10 < 2) {
                        mi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = mi1Var.f29315w;
                    if (i11 > 0) {
                        mi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29272b = false;
                return;
            case 3:
                ((j80) this.f32227c).f34840f.e.smoothScrollTo(0, (int) this.f32226b);
                return;
            case 4:
                float f10 = this.f32226b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32227c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32227c, this.f32226b);
                return;
        }
    }
}
