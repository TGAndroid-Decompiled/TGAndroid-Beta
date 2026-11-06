package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f44135a;
    public final float f44136b;
    public final Object f44137c;

    public b0(Object obj, float f10, int i7) {
        this.f44135a = i7;
        this.f44137c = obj;
        this.f44136b = f10;
    }

    @Override
    public final void run() {
        switch (this.f44135a) {
            case 0:
                ((g4) this.f44137c).f45830h0.M.c(true, this.f44136b);
                return;
            case 1:
                org.telegram.ui.Components.ua uaVar = (org.telegram.ui.Components.ua) this.f44137c;
                if (uaVar.f38561a.getTranslationX() == this.f44136b) {
                    uaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f44137c;
                float f10 = this.f44136b;
                yb1 yb1Var = w0Var.f39554c;
                if (f10 > 0.0f) {
                    int i7 = yb1Var.f39640x;
                    if (i7 < 2) {
                        yb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = yb1Var.f39640x;
                    if (i10 > 0) {
                        yb1Var.c(i10 - 1, true);
                    }
                }
                w0Var.f39553b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f44137c, this.f44136b);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f44137c;
                float f11 = this.f44136b;
                if (!h0Var.f52815u) {
                    h0Var.f52797a.removeCallbacks(h0Var.O);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        h0Var.f52797a.postDelayed(h0Var.O, (long) Math.ceil(f11));
                        return;
                    } else if (i11 == 0) {
                        h0Var.c();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
