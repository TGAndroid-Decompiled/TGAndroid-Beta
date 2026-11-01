package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f35499a;
    public final float f35500b;
    public final Object f35501c;

    public a0(Object obj, float f7, int i10) {
        this.f35499a = i10;
        this.f35501c = obj;
        this.f35500b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35499a) {
            case 0:
                ((h4) this.f35501c).f37679h0.M.c(true, this.f35500b);
                return;
            case 1:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) this.f35501c;
                if (oaVar.f29072a.getTranslationX() == this.f35500b) {
                    oaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.i0 i0Var = (org.telegram.ui.Components.voip.i0) this.f35501c;
                float f7 = this.f35500b;
                sd1 sd1Var = i0Var.f31545c;
                if (f7 > 0.0f) {
                    int i10 = sd1Var.f31599x;
                    if (i10 < 2) {
                        sd1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = sd1Var.f31599x;
                    if (i11 > 0) {
                        sd1Var.c(i11 - 1, true);
                    }
                }
                i0Var.f31544b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f35501c, this.f35500b);
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.f35501c;
                float f10 = this.f35500b;
                if (!k0Var.f44396u) {
                    k0Var.f44379a.removeCallbacks(k0Var.P);
                    int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i12 > 0) {
                        k0Var.f44379a.postDelayed(k0Var.P, (long) Math.ceil(f10));
                        return;
                    } else if (i12 == 0) {
                        k0Var.b();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
