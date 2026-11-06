package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f44136a;
    public final float f44137b;
    public final Object f44138c;

    public b0(Object obj, float f10, int i7) {
        this.f44136a = i7;
        this.f44138c = obj;
        this.f44137b = f10;
    }

    @Override
    public final void run() {
        switch (this.f44136a) {
            case 0:
                ((g4) this.f44138c).f45831h0.M.c(true, this.f44137b);
                return;
            case 1:
                org.telegram.ui.Components.ua uaVar = (org.telegram.ui.Components.ua) this.f44138c;
                if (uaVar.f38565a.getTranslationX() == this.f44137b) {
                    uaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f44138c;
                float f10 = this.f44137b;
                yb1 yb1Var = w0Var.f39533c;
                if (f10 > 0.0f) {
                    int i7 = yb1Var.f39619x;
                    if (i7 < 2) {
                        yb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = yb1Var.f39619x;
                    if (i10 > 0) {
                        yb1Var.c(i10 - 1, true);
                    }
                }
                w0Var.f39532b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f44138c, this.f44137b);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f44138c;
                float f11 = this.f44137b;
                if (!h0Var.f52817u) {
                    h0Var.f52799a.removeCallbacks(h0Var.O);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        h0Var.f52799a.postDelayed(h0Var.O, (long) Math.ceil(f11));
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
