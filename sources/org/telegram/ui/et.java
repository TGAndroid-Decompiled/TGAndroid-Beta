package org.telegram.ui;

import android.graphics.Bitmap;
public final class et implements Runnable {
    public final int f33354a;
    public final st f33355b;

    public et(st stVar, int i10) {
        this.f33354a = i10;
        this.f33355b = stVar;
    }

    @Override
    public final void run() {
        switch (this.f33354a) {
            case 0:
                this.f33355b.f37474c0 = null;
                return;
            case 1:
                st stVar = this.f33355b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.pd0 pd0Var = stVar.C;
                if (pd0Var != null) {
                    pd0Var.a();
                    stVar.f37495z.removeView(stVar.C);
                    stVar.C = null;
                    return;
                }
                return;
            default:
                this.f33355b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                return;
        }
    }
}
