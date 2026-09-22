package org.telegram.ui;

import android.graphics.Bitmap;
public final class et implements Runnable {
    public final int f33402a;
    public final st f33403b;

    public et(st stVar, int i10) {
        this.f33402a = i10;
        this.f33403b = stVar;
    }

    @Override
    public final void run() {
        switch (this.f33402a) {
            case 0:
                this.f33403b.f37465c0 = null;
                return;
            case 1:
                st stVar = this.f33403b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fd0 fd0Var = stVar.C;
                if (fd0Var != null) {
                    fd0Var.a();
                    stVar.f37486z.removeView(stVar.C);
                    stVar.C = null;
                    return;
                }
                return;
            default:
                this.f33403b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                return;
        }
    }
}
