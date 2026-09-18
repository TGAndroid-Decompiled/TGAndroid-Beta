package org.telegram.ui;

import android.graphics.Bitmap;
public final class gt implements Runnable {
    public final int f34044a;
    public final ut f34045b;

    public gt(ut utVar, int i10) {
        this.f34044a = i10;
        this.f34045b = utVar;
    }

    @Override
    public final void run() {
        switch (this.f34044a) {
            case 0:
                this.f34045b.f38205c0 = null;
                return;
            case 1:
                ut utVar = this.f34045b;
                utVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fd0 fd0Var = utVar.C;
                if (fd0Var != null) {
                    fd0Var.a();
                    utVar.f38226z.removeView(utVar.C);
                    utVar.C = null;
                    return;
                }
                return;
            default:
                this.f34045b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                return;
        }
    }
}
