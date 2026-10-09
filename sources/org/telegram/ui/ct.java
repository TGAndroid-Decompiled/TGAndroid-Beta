package org.telegram.ui;

import android.graphics.Bitmap;
public final class ct implements Runnable {
    public final int f36733a;
    public final rt f36734b;

    public ct(rt rtVar, int i10) {
        this.f36733a = i10;
        this.f36734b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f36733a) {
            case 0:
                this.f36734b.f41487c0 = null;
                return;
            case 1:
                rt rtVar = this.f36734b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.he0 he0Var = rtVar.C;
                if (he0Var != null) {
                    he0Var.a();
                    rtVar.f41509z.removeView(rtVar.C);
                    rtVar.C = null;
                    return;
                }
                return;
            default:
                this.f36734b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.hs.h).start();
                return;
        }
    }
}
