package org.telegram.ui;

import android.graphics.Bitmap;
public final class ct implements Runnable {
    public final int f36779a;
    public final rt f36780b;

    public ct(rt rtVar, int i10) {
        this.f36779a = i10;
        this.f36780b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f36779a) {
            case 0:
                this.f36780b.f41533c0 = null;
                return;
            case 1:
                rt rtVar = this.f36780b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.ie0 ie0Var = rtVar.C;
                if (ie0Var != null) {
                    ie0Var.a();
                    rtVar.f41555z.removeView(rtVar.C);
                    rtVar.C = null;
                    return;
                }
                return;
            default:
                this.f36780b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.is.h).start();
                return;
        }
    }
}
