package org.telegram.ui;

import android.graphics.Bitmap;
public final class jt implements Runnable {
    public final int f37428a;
    public final xt f37429b;

    public jt(xt xtVar, int i10) {
        this.f37428a = i10;
        this.f37429b = xtVar;
    }

    @Override
    public final void run() {
        switch (this.f37428a) {
            case 0:
                this.f37429b.f41935c0 = null;
                return;
            case 1:
                xt xtVar = this.f37429b;
                xtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fe0 fe0Var = xtVar.C;
                if (fe0Var != null) {
                    fe0Var.a();
                    xtVar.f41956z.removeView(xtVar.C);
                    xtVar.C = null;
                    return;
                }
                return;
            default:
                this.f37429b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.es.h).start();
                return;
        }
    }
}
