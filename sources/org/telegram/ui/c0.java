package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f34403a;
    public final float f34404b;
    public final Object f34405c;

    public c0(Object obj, float f7, int i10) {
        this.f34403a = i10;
        this.f34405c = obj;
        this.f34404b = f7;
    }

    @Override
    public final void run() {
        switch (this.f34403a) {
            case 0:
                ((k4) this.f34405c).f37266h0.M.c(this.f34404b, true);
                return;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.f34405c;
                if (kbVar.f26336a.getTranslationX() == this.f34404b) {
                    kbVar.f26345y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f34405c;
                float f7 = this.f34404b;
                vi1 vi1Var = y0Var.f30264c;
                if (f7 > 0.0f) {
                    int i10 = vi1Var.f29781w;
                    if (i10 < 2) {
                        vi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = vi1Var.f29781w;
                    if (i11 > 0) {
                        vi1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f30263b = false;
                return;
            case 3:
                ((n80) this.f34405c).f38285f.e.smoothScrollTo(0, (int) this.f34404b);
                return;
            case 4:
                float f10 = this.f34404b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f34405c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f34405c, this.f34404b);
                return;
        }
    }
}
