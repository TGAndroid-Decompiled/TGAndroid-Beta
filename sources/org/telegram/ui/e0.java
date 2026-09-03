package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class e0 implements Runnable {
    public final int f33570a;
    public final float f33571b;
    public final Object f33572c;

    public e0(Object obj, float f10, int i10) {
        this.f33570a = i10;
        this.f33572c = obj;
        this.f33571b = f10;
    }

    @Override
    public final void run() {
        switch (this.f33570a) {
            case 0:
                ((n4) this.f33572c).f36363e0.J.c(this.f33571b, true);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f33572c;
                if (zaVar.f31312a.getTranslationX() == this.f33571b) {
                    zaVar.f31321y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f33572c;
                float f10 = this.f33571b;
                bi1 bi1Var = x0Var.f29997c;
                if (f10 > 0.0f) {
                    int i10 = bi1Var.f29532w;
                    if (i10 < 2) {
                        bi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = bi1Var.f29532w;
                    if (i11 > 0) {
                        bi1Var.c(i11 - 1, true);
                    }
                }
                x0Var.f29996b = false;
                return;
            case 3:
                ((c80) this.f33572c).f33042f.e.smoothScrollTo(0, (int) this.f33571b);
                return;
            case 4:
                float f11 = this.f33571b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f33572c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f33572c, this.f33571b);
                return;
        }
    }
}
