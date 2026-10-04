package org.telegram.ui;

import android.graphics.Bitmap;
public final class ct implements Runnable {
    public final int f35544a;
    public final rt f35545b;

    public ct(rt rtVar, int i10) {
        this.f35544a = i10;
        this.f35545b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f35544a) {
            case 0:
                this.f35545b.f40262c0 = null;
                return;
            case 1:
                rt rtVar = this.f35545b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.sd0 sd0Var = rtVar.C;
                if (sd0Var != null) {
                    sd0Var.a();
                    rtVar.f40284z.removeView(rtVar.C);
                    rtVar.C = null;
                    return;
                }
                return;
            default:
                this.f35545b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.tr.h).start();
                return;
        }
    }
}
