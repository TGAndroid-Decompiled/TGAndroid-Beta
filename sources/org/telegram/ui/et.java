package org.telegram.ui;

import android.graphics.Bitmap;
public final class et implements Runnable {
    public final int f33398a;
    public final st f33399b;

    public et(st stVar, int i10) {
        this.f33398a = i10;
        this.f33399b = stVar;
    }

    @Override
    public final void run() {
        switch (this.f33398a) {
            case 0:
                this.f33399b.f37529c0 = null;
                return;
            case 1:
                st stVar = this.f33399b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.od0 od0Var = stVar.C;
                if (od0Var != null) {
                    od0Var.a();
                    stVar.f37550z.removeView(stVar.C);
                    stVar.C = null;
                    return;
                }
                return;
            default:
                this.f33399b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                return;
        }
    }
}
