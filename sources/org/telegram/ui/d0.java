package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class d0 implements Runnable {
    public final int f35950a;
    public final float f35951b;
    public final Object f35952c;

    public d0(Object obj, float f10, int i10) {
        this.f35950a = i10;
        this.f35952c = obj;
        this.f35951b = f10;
    }

    @Override
    public final void run() {
        switch (this.f35950a) {
            case 0:
                ((l4) this.f35952c).f38607e0.J.c(this.f35951b, true);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f35952c;
                if (zaVar.f33839a.getTranslationX() == this.f35951b) {
                    zaVar.f33849y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35952c;
                float f10 = this.f35951b;
                vh1 vh1Var = y0Var.f32474c;
                if (f10 > 0.0f) {
                    int i10 = vh1Var.f31973w;
                    if (i10 < 2) {
                        vh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = vh1Var.f31973w;
                    if (i11 > 0) {
                        vh1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f32473b = false;
                return;
            case 3:
                ((b80) this.f35952c).f35386f.f36135e.smoothScrollTo(0, (int) this.f35951b);
                return;
            case 4:
                float f11 = this.f35951b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35952c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35952c, this.f35951b);
                return;
        }
    }
}
