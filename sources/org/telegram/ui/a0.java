package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;
public final class a0 implements Runnable {
    public final int f35492a;
    public final float f35493b;
    public final Object f35494c;

    public a0(Object obj, float f7, int i10) {
        this.f35492a = i10;
        this.f35494c = obj;
        this.f35493b = f7;
    }

    @Override
    public final void run() {
        switch (this.f35492a) {
            case 0:
                ((h4) this.f35494c).f37734h0.M.c(true, this.f35493b);
                return;
            case 1:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) this.f35494c;
                if (oaVar.f29011a.getTranslationX() == this.f35493b) {
                    oaVar.D.b();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.h0 h0Var = (org.telegram.ui.Components.voip.h0) this.f35494c;
                float f7 = this.f35493b;
                ud1 ud1Var = h0Var.f31460c;
                if (f7 > 0.0f) {
                    int i10 = ud1Var.f31520x;
                    if (i10 < 2) {
                        ud1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ud1Var.f31520x;
                    if (i11 > 0) {
                        ud1Var.c(i11 - 1, true);
                    }
                }
                h0Var.f31459b = false;
                return;
            case 3:
                HttpGetFileTask.b((HttpGetFileTask) this.f35494c, this.f35493b);
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.f35494c;
                float f10 = this.f35493b;
                if (!k0Var.f44385u) {
                    k0Var.f44368a.removeCallbacks(k0Var.P);
                    int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i12 > 0) {
                        k0Var.f44368a.postDelayed(k0Var.P, (long) Math.ceil(f10));
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
