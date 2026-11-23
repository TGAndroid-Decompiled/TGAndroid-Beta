package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f45526a;
    public final float f45527b;
    public final Object f45528c;

    public a0(Object obj, float f10, int i7) {
        this.f45526a = i7;
        this.f45528c = obj;
        this.f45527b = f10;
    }

    @Override
    public final void run() {
        switch (this.f45526a) {
            case 0:
                ((g4) this.f45528c).f48072i0.N.c(true, this.f45527b);
                return;
            case 1:
                org.telegram.ui.Components.ya yaVar = (org.telegram.ui.Components.ya) this.f45528c;
                if (yaVar.f42385a.getTranslationX() == this.f45527b) {
                    yaVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f45528c;
                zb1 zb1Var = a1Var.f40767c;
                if (this.f45527b > 0.0f) {
                    int i7 = zb1Var.f40826x;
                    if (i7 < 2) {
                        zb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = zb1Var.f40826x;
                    if (i10 > 0) {
                        zb1Var.c(i10 - 1, true);
                    }
                }
                a1Var.f40766b = false;
                return;
            default:
                HttpGetFileTask.b((HttpGetFileTask) this.f45528c, this.f45527b);
                return;
        }
    }
}
