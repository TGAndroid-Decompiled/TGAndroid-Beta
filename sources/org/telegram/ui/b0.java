package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f43856a;
    public final float f43857b;
    public final Object f43858c;

    public b0(Object obj, float f10, int i7) {
        this.f43856a = i7;
        this.f43858c = obj;
        this.f43857b = f10;
    }

    @Override
    public final void run() {
        switch (this.f43856a) {
            case 0:
                ((g4) this.f43858c).f45959h0.M.c(true, this.f43857b);
                return;
            case 1:
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) this.f43858c;
                if (taVar.f38250a.getTranslationX() == this.f43857b) {
                    taVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f43858c;
                float f10 = this.f43857b;
                dc1 dc1Var = w0Var.f39598c;
                if (f10 > 0.0f) {
                    int i7 = dc1Var.f39686x;
                    if (i7 < 2) {
                        dc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = dc1Var.f39686x;
                    if (i10 > 0) {
                        dc1Var.c(i10 - 1, true);
                    }
                }
                w0Var.f39597b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f43858c, this.f43857b);
                return;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f43858c;
                float f11 = this.f43857b;
                if (!i1Var.f52867w) {
                    i1Var.f52848a.removeCallbacks(i1Var.Q);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        i1Var.f52848a.postDelayed(i1Var.Q, (long) Math.ceil(f11));
                        return;
                    } else if (i11 == 0) {
                        i1Var.d();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
