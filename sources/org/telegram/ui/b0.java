package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f34576a;
    public final float f34577b;
    public final Object f34578c;

    public b0(Object obj, float f7, int i10) {
        this.f34576a = i10;
        this.f34578c = obj;
        this.f34577b = f7;
    }

    @Override
    public final void run() {
        switch (this.f34576a) {
            case 0:
                ((i4) this.f34578c).f37220h0.M.c(this.f34577b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f34578c;
                if (ibVar.f27058a.getTranslationX() == this.f34577b) {
                    ibVar.f27068y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f34578c;
                float f7 = this.f34577b;
                ni1 ni1Var = y0Var.f31943c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f31422w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f31422w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31942b = false;
                return;
            case 3:
                ((j80) this.f34578c).f37694f.f38222e.smoothScrollTo(0, (int) this.f34577b);
                return;
            case 4:
                float f10 = this.f34577b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f34578c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f34578c, this.f34577b);
                return;
        }
    }
}
