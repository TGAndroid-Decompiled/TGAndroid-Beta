package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f34577a;
    public final float f34578b;
    public final Object f34579c;

    public b0(Object obj, float f7, int i10) {
        this.f34577a = i10;
        this.f34579c = obj;
        this.f34578b = f7;
    }

    @Override
    public final void run() {
        switch (this.f34577a) {
            case 0:
                ((i4) this.f34579c).f37221h0.M.c(this.f34578b, true);
                return;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.f34579c;
                if (ibVar.f27059a.getTranslationX() == this.f34578b) {
                    ibVar.f27069y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f34579c;
                float f7 = this.f34578b;
                ni1 ni1Var = y0Var.f31944c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f31423w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f31423w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f31943b = false;
                return;
            case 3:
                ((j80) this.f34579c).f37695f.f38223e.smoothScrollTo(0, (int) this.f34578b);
                return;
            case 4:
                float f10 = this.f34578b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f34579c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f34579c, this.f34578b);
                return;
        }
    }
}
