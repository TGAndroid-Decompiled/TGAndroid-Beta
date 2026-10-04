package org.telegram.ui;

import android.graphics.Bitmap;
public final class ct implements Runnable {
    public final int f35545a;
    public final rt f35546b;

    public ct(rt rtVar, int i10) {
        this.f35545a = i10;
        this.f35546b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f35545a) {
            case 0:
                this.f35546b.f40263c0 = null;
                return;
            case 1:
                rt rtVar = this.f35546b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.sd0 sd0Var = rtVar.C;
                if (sd0Var != null) {
                    sd0Var.a();
                    rtVar.f40285z.removeView(rtVar.C);
                    rtVar.C = null;
                    return;
                }
                return;
            default:
                this.f35546b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.tr.h).start();
                return;
        }
    }
}
