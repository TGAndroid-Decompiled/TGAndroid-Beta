package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f45398a;
    public final float f45399b;
    public final Object f45400c;

    public a0(Object obj, float f10, int i7) {
        this.f45398a = i7;
        this.f45400c = obj;
        this.f45399b = f10;
    }

    @Override
    public final void run() {
        switch (this.f45398a) {
            case 0:
                ((g4) this.f45400c).f47923i0.N.c(true, this.f45399b);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f45400c;
                if (zaVar.f42830a.getTranslationX() == this.f45399b) {
                    zaVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.f45400c;
                bc1 bc1Var = z0Var.f41372c;
                if (this.f45399b > 0.0f) {
                    int i7 = bc1Var.f40797x;
                    if (i7 < 2) {
                        bc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = bc1Var.f40797x;
                    if (i10 > 0) {
                        bc1Var.c(i10 - 1, true);
                    }
                }
                z0Var.f41371b = false;
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f45400c, this.f45399b);
                return;
        }
    }
}
