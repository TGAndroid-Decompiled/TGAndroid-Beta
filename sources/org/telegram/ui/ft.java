package org.telegram.ui;

import android.graphics.Bitmap;
public final class ft implements Runnable {
    public final int f37843a;
    public final ut f37844b;

    public ft(ut utVar, int i10) {
        this.f37843a = i10;
        this.f37844b = utVar;
    }

    @Override
    public final void run() {
        switch (this.f37843a) {
            case 0:
                this.f37844b.f42569c0 = null;
                return;
            case 1:
                ut utVar = this.f37844b;
                utVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.le0 le0Var = utVar.C;
                if (le0Var != null) {
                    le0Var.a();
                    utVar.f42591z.removeView(utVar.C);
                    utVar.C = null;
                    return;
                }
                return;
            default:
                this.f37844b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.js.h).start();
                return;
        }
    }
}
