package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f44120a;
    public final float f44121b;
    public final Object f44122c;

    public b0(Object obj, float f10, int i7) {
        this.f44120a = i7;
        this.f44122c = obj;
        this.f44121b = f10;
    }

    @Override
    public final void run() {
        switch (this.f44120a) {
            case 0:
                ((g4) this.f44122c).f45804h0.M.c(true, this.f44121b);
                return;
            case 1:
                org.telegram.ui.Components.ua uaVar = (org.telegram.ui.Components.ua) this.f44122c;
                if (uaVar.f38574a.getTranslationX() == this.f44121b) {
                    uaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f44122c;
                float f10 = this.f44121b;
                yb1 yb1Var = w0Var.f39536c;
                if (f10 > 0.0f) {
                    int i7 = yb1Var.f39622x;
                    if (i7 < 2) {
                        yb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = yb1Var.f39622x;
                    if (i10 > 0) {
                        yb1Var.c(i10 - 1, true);
                    }
                }
                w0Var.f39535b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f44122c, this.f44121b);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f44122c;
                float f11 = this.f44121b;
                if (!h0Var.f52791u) {
                    h0Var.f52773a.removeCallbacks(h0Var.O);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        h0Var.f52773a.postDelayed(h0Var.O, (long) Math.ceil(f11));
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
