package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class d0 implements Runnable {
    public final int f33455a;
    public final float f33456b;
    public final Object f33457c;

    public d0(Object obj, float f10, int i10) {
        this.f33455a = i10;
        this.f33457c = obj;
        this.f33456b = f10;
    }

    @Override
    public final void run() {
        switch (this.f33455a) {
            case 0:
                ((l4) this.f33457c).f35933e0.J.c(this.f33456b, true);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f33457c;
                if (zaVar.f31293a.getTranslationX() == this.f33456b) {
                    zaVar.f31302y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f33457c;
                float f10 = this.f33456b;
                th1 th1Var = x0Var.f30025c;
                if (f10 > 0.0f) {
                    int i10 = th1Var.f29560w;
                    if (i10 < 2) {
                        th1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = th1Var.f29560w;
                    if (i11 > 0) {
                        th1Var.c(i11 - 1, true);
                    }
                }
                x0Var.f30024b = false;
                return;
            case 3:
                ((a80) this.f33457c).f32488f.e.smoothScrollTo(0, (int) this.f33456b);
                return;
            case 4:
                float f11 = this.f33456b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f33457c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f33457c, this.f33456b);
                return;
        }
    }
}
