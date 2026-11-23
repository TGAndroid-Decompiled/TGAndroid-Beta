package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f45443a;
    public final float f45444b;
    public final Object f45445c;

    public a0(Object obj, float f10, int i7) {
        this.f45443a = i7;
        this.f45445c = obj;
        this.f45444b = f10;
    }

    @Override
    public final void run() {
        switch (this.f45443a) {
            case 0:
                ((g4) this.f45445c).f47961i0.N.c(true, this.f45444b);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f45445c;
                if (zaVar.f42742a.getTranslationX() == this.f45444b) {
                    zaVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.f45445c;
                bc1 bc1Var = z0Var.f41508c;
                if (this.f45444b > 0.0f) {
                    int i7 = bc1Var.f40933x;
                    if (i7 < 2) {
                        bc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = bc1Var.f40933x;
                    if (i10 > 0) {
                        bc1Var.c(i10 - 1, true);
                    }
                }
                z0Var.f41507b = false;
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f45445c, this.f45444b);
                return;
        }
    }
}
