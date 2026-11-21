package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f45439a;
    public final float f45440b;
    public final Object f45441c;

    public a0(Object obj, float f10, int i7) {
        this.f45439a = i7;
        this.f45441c = obj;
        this.f45440b = f10;
    }

    @Override
    public final void run() {
        switch (this.f45439a) {
            case 0:
                ((g4) this.f45441c).f47957i0.N.c(true, this.f45440b);
                return;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f45441c;
                if (zaVar.f42739a.getTranslationX() == this.f45440b) {
                    zaVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.f45441c;
                bc1 bc1Var = z0Var.f41507c;
                if (this.f45440b > 0.0f) {
                    int i7 = bc1Var.f40932x;
                    if (i7 < 2) {
                        bc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = bc1Var.f40932x;
                    if (i10 > 0) {
                        bc1Var.c(i10 - 1, true);
                    }
                }
                z0Var.f41506b = false;
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f45441c, this.f45440b);
                return;
        }
    }
}
