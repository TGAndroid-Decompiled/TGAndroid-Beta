package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f44141a;
    public final float f44142b;
    public final Object f44143c;

    public b0(Object obj, float f10, int i7) {
        this.f44141a = i7;
        this.f44143c = obj;
        this.f44142b = f10;
    }

    @Override
    public final void run() {
        switch (this.f44141a) {
            case 0:
                ((g4) this.f44143c).f45807h0.M.c(true, this.f44142b);
                return;
            case 1:
                org.telegram.ui.Components.ua uaVar = (org.telegram.ui.Components.ua) this.f44143c;
                if (uaVar.f38576a.getTranslationX() == this.f44142b) {
                    uaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f44143c;
                float f10 = this.f44142b;
                zb1 zb1Var = w0Var.f39589c;
                if (f10 > 0.0f) {
                    int i7 = zb1Var.f39675x;
                    if (i7 < 2) {
                        zb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = zb1Var.f39675x;
                    if (i10 > 0) {
                        zb1Var.c(i10 - 1, true);
                    }
                }
                w0Var.f39588b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f44143c, this.f44142b);
                return;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f44143c;
                float f11 = this.f44142b;
                if (!i1Var.f52854w) {
                    i1Var.f52835a.removeCallbacks(i1Var.Q);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        i1Var.f52835a.postDelayed(i1Var.Q, (long) Math.ceil(f11));
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
