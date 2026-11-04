package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class c0 implements Runnable {
    public final int f44181a;
    public final float f44182b;
    public final Object f44183c;

    public c0(Object obj, float f10, int i3) {
        this.f44181a = i3;
        this.f44183c = obj;
        this.f44182b = f10;
    }

    @Override
    public final void run() {
        switch (this.f44181a) {
            case 0:
                ((i4) this.f44183c).f46088i0.N.c(true, this.f44182b);
                return;
            case 1:
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) this.f44183c;
                if (taVar.f38364a.getTranslationX() == this.f44182b) {
                    taVar.E.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.i0 i0Var = (org.telegram.ui.Components.voip.i0) this.f44183c;
                float f10 = this.f44182b;
                sb1 sb1Var = i0Var.f39404c;
                if (f10 > 0.0f) {
                    int i3 = sb1Var.f39454x;
                    if (i3 < 2) {
                        sb1Var.c(i3 + 1, true);
                    }
                } else {
                    int i10 = sb1Var.f39454x;
                    if (i10 > 0) {
                        sb1Var.c(i10 - 1, true);
                    }
                }
                i0Var.f39403b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f44183c, this.f44182b);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f44183c;
                float f11 = this.f44182b;
                if (!h0Var.f52882u) {
                    h0Var.f52864a.removeCallbacks(h0Var.O);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        h0Var.f52864a.postDelayed(h0Var.O, (long) Math.ceil(f11));
                        return;
                    } else if (i11 == 0) {
                        h0Var.b();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
