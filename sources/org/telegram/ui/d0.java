package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class d0 implements Runnable {
    public final int f37366a;
    public final float f37367b;
    public final Object f37368c;

    public d0(Object obj, float f10, int i9) {
        this.f37366a = i9;
        this.f37368c = obj;
        this.f37367b = f10;
    }

    @Override
    public final void run() {
        switch (this.f37366a) {
            case 0:
                ((l4) this.f37368c).f40014d0.I.c(this.f37367b, true);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f37368c;
                if (zaVar.f35253a.getTranslationX() == this.f37367b) {
                    zaVar.f35263y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f37368c;
                float f10 = this.f37367b;
                fh1 fh1Var = x0Var.f33931c;
                if (f10 > 0.0f) {
                    int i9 = fh1Var.f33433w;
                    if (i9 < 2) {
                        fh1Var.c(i9 + 1, true);
                    }
                } else {
                    int i10 = fh1Var.f33433w;
                    if (i10 > 0) {
                        fh1Var.c(i10 - 1, true);
                    }
                }
                x0Var.f33930b = false;
                return;
            case 3:
                ((o70) this.f37368c).f40999f.f41703e.smoothScrollTo(0, (int) this.f37367b);
                return;
            case 4:
                float f11 = this.f37367b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f37368c, f11).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f37368c, this.f37367b);
                return;
        }
    }
}
