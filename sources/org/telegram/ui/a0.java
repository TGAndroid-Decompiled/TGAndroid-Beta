package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f45408a;
    public final float f45409b;
    public final Object f45410c;

    public a0(Object obj, float f10, int i7) {
        this.f45408a = i7;
        this.f45410c = obj;
        this.f45409b = f10;
    }

    @Override
    public final void run() {
        switch (this.f45408a) {
            case 0:
                ((g4) this.f45410c).f47908i0.N.c(true, this.f45409b);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f45410c;
                if (zaVar.f42700a.getTranslationX() == this.f45409b) {
                    zaVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.f45410c;
                bc1 bc1Var = z0Var.f41470c;
                if (this.f45409b > 0.0f) {
                    int i7 = bc1Var.f40895x;
                    if (i7 < 2) {
                        bc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = bc1Var.f40895x;
                    if (i10 > 0) {
                        bc1Var.c(i10 - 1, true);
                    }
                }
                z0Var.f41469b = false;
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f45410c, this.f45409b);
                return;
        }
    }
}
