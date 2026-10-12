package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f34649a;
    public final float f34650b;
    public final Object f34651c;

    public c0(Object obj, float f7, int i10) {
        this.f34649a = i10;
        this.f34651c = obj;
        this.f34650b = f7;
    }

    @Override
    public final void run() {
        switch (this.f34649a) {
            case 0:
                ((k4) this.f34651c).f37545h0.M.c(this.f34650b, true);
                return;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.f34651c;
                if (kbVar.f26653a.getTranslationX() == this.f34650b) {
                    kbVar.f26662y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f34651c;
                float f7 = this.f34650b;
                wi1 wi1Var = y0Var.f30595c;
                if (f7 > 0.0f) {
                    int i10 = wi1Var.f30112w;
                    if (i10 < 2) {
                        wi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = wi1Var.f30112w;
                    if (i11 > 0) {
                        wi1Var.c(i11 - 1, true);
                    }
                }
                y0Var.f30594b = false;
                return;
            case 3:
                ((n80) this.f34651c).f38570f.e.smoothScrollTo(0, (int) this.f34650b);
                return;
            case 4:
                float f10 = this.f34650b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f34651c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f34651c, this.f34650b);
                return;
        }
    }
}
