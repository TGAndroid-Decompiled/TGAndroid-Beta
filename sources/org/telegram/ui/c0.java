package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f32617a;
    public final float f32618b;
    public final Object f32619c;

    public c0(Object obj, float f7, int i10) {
        this.f32617a = i10;
        this.f32619c = obj;
        this.f32618b = f7;
    }

    @Override
    public final void run() {
        switch (this.f32617a) {
            case 0:
                ((i4) this.f32619c).f34490h0.M.c(this.f32618b, true);
                return;
            case 1:
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.f32619c;
                if (jbVar.f25388a.getTranslationX() == this.f32618b) {
                    jbVar.f25397y.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f32619c;
                float f7 = this.f32618b;
                fi1 fi1Var = a1Var.f29180c;
                if (f7 > 0.0f) {
                    int i10 = fi1Var.f29226w;
                    if (i10 < 2) {
                        fi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = fi1Var.f29226w;
                    if (i11 > 0) {
                        fi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.f29179b = false;
                return;
            case 3:
                ((e80) this.f32619c).f33382f.e.smoothScrollTo(0, (int) this.f32618b);
                return;
            case 4:
                float f10 = this.f32618b;
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f32619c, f10).commit();
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f32619c, this.f32618b);
                return;
        }
    }
}
