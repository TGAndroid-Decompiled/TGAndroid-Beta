package org.telegram.ui;

import android.graphics.Bitmap;
public final class ft implements Runnable {
    public final int f37840a;
    public final ut f37841b;

    public ft(ut utVar, int i10) {
        this.f37840a = i10;
        this.f37841b = utVar;
    }

    @Override
    public final void run() {
        switch (this.f37840a) {
            case 0:
                this.f37841b.f42571c0 = null;
                return;
            case 1:
                ut utVar = this.f37841b;
                utVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.le0 le0Var = utVar.C;
                if (le0Var != null) {
                    le0Var.a();
                    utVar.f42593z.removeView(utVar.C);
                    utVar.C = null;
                    return;
                }
                return;
            default:
                this.f37841b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.js.h).start();
                return;
        }
    }
}
