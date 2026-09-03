package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class d0 implements Runnable {
    public final int f35916a;
    public final float f35917b;
    public final Object f35918c;

    public d0(Object obj, float f10, int i10) {
        this.f35916a = i10;
        this.f35918c = obj;
        this.f35917b = f10;
    }

    @Override
    public final void run() {
        switch (this.f35916a) {
            case 0:
                ((l4) this.f35918c).f38512e0.J.c(this.f35917b, true);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f35918c;
                if (zaVar.f33882a.getTranslationX() == this.f35917b) {
                    zaVar.f33892y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f35918c;
                float f10 = this.f35917b;
                bi1 bi1Var = y0Var.f32479c;
                if (f10 > 0.0f) {
                    int i10 = bi1Var.f31978w;
                    if (i10 < 2) {
                        bi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = bi1Var.f31978w;
                    if (i11 > 0) {
                        bi1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f32478b = false;
                return;
            case 3:
                ((b80) this.f35918c).f35400f.f36114e.smoothScrollTo(0, (int) this.f35917b);
                return;
            case 4:
                float f11 = this.f35917b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f35918c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f35918c, this.f35917b);
                return;
        }
    }
}
