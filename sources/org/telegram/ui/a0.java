package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f44891a;
    public final float f44892b;
    public final Object f44893c;

    public a0(Object obj, float f10, int i7) {
        this.f44891a = i7;
        this.f44893c = obj;
        this.f44892b = f10;
    }

    @Override
    public final void run() {
        switch (this.f44891a) {
            case 0:
                ((g4) this.f44893c).f47324i0.N.c(true, this.f44892b);
                return;
            case 1:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) this.f44893c;
                if (qaVar.f38592a.getTranslationX() == this.f44892b) {
                    qaVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f44893c;
                float f10 = this.f44892b;
                yb1 yb1Var = a1Var.f40488c;
                if (f10 > 0.0f) {
                    int i7 = yb1Var.f40547x;
                    if (i7 < 2) {
                        yb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = yb1Var.f40547x;
                    if (i10 > 0) {
                        yb1Var.c(i10 - 1, true);
                    }
                }
                a1Var.f40487b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f44893c, this.f44892b);
                return;
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.f44893c;
                float f11 = this.f44892b;
                if (!l1Var.f54318w) {
                    l1Var.f54299a.removeCallbacks(l1Var.Q);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        l1Var.f54299a.postDelayed(l1Var.Q, (long) Math.ceil(f11));
                        return;
                    } else if (i11 == 0) {
                        l1Var.d();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
