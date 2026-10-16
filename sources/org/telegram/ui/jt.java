package org.telegram.ui;

import android.graphics.Bitmap;
public final class jt implements Runnable {
    public final int f37130a;
    public final xt f37131b;

    public jt(xt xtVar, int i10) {
        this.f37130a = i10;
        this.f37131b = xtVar;
    }

    @Override
    public final void run() {
        switch (this.f37130a) {
            case 0:
                this.f37131b.f41639c0 = null;
                return;
            case 1:
                xt xtVar = this.f37131b;
                xtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fe0 fe0Var = xtVar.C;
                if (fe0Var != null) {
                    fe0Var.a();
                    xtVar.f41660z.removeView(xtVar.C);
                    xtVar.C = null;
                    return;
                }
                return;
            default:
                this.f37131b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.es.h).start();
                return;
        }
    }
}
