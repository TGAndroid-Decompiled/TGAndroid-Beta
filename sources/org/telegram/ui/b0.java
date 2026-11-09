package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class b0 implements Runnable {
    public final int f43841a;
    public final float f43842b;
    public final Object f43843c;

    public b0(Object obj, float f10, int i7) {
        this.f43841a = i7;
        this.f43843c = obj;
        this.f43842b = f10;
    }

    @Override
    public final void run() {
        switch (this.f43841a) {
            case 0:
                ((g4) this.f43843c).f45890h0.M.c(true, this.f43842b);
                return;
            case 1:
                org.telegram.ui.Components.ua uaVar = (org.telegram.ui.Components.ua) this.f43843c;
                if (uaVar.f38662a.getTranslationX() == this.f43842b) {
                    uaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f43843c;
                float f10 = this.f43842b;
                cc1 cc1Var = w0Var.f39678c;
                if (f10 > 0.0f) {
                    int i7 = cc1Var.f39764x;
                    if (i7 < 2) {
                        cc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = cc1Var.f39764x;
                    if (i10 > 0) {
                        cc1Var.c(i10 - 1, true);
                    }
                }
                w0Var.f39677b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f43843c, this.f43842b);
                return;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f43843c;
                float f11 = this.f43842b;
                if (!i1Var.f52868w) {
                    i1Var.f52849a.removeCallbacks(i1Var.Q);
                    int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    if (i11 > 0) {
                        i1Var.f52849a.postDelayed(i1Var.Q, (long) Math.ceil(f11));
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
