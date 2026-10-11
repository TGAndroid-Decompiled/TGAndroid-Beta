package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f36248a;
    public final float f36249b;
    public final Object f36250c;

    public b0(Object obj, float f7, int i10) {
        this.f36248a = i10;
        this.f36250c = obj;
        this.f36249b = f7;
    }

    @Override
    public final void run() {
        switch (this.f36248a) {
            case 0:
                ((h4) this.f36250c).f38307h0.M.c(this.f36249b, true);
                return;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.f36250c;
                if (kbVar.f28009a.getTranslationX() == this.f36249b) {
                    kbVar.f28019y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f36250c;
                float f7 = this.f36249b;
                ni1 ni1Var = b1Var.f31974c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.f32030w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.f32030w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                b1Var.f31973b = false;
                return;
            case 3:
                ((i80) this.f36250c).f38641f.f39259e.smoothScrollTo(0, (int) this.f36249b);
                return;
            case 4:
                float f10 = this.f36249b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f36250c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f36250c, this.f36249b);
                return;
        }
    }
}
