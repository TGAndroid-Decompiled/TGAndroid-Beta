package org.telegram.ui;

import android.graphics.Bitmap;
public final class et implements Runnable {
    public final int f33423a;
    public final st f33424b;

    public et(st stVar, int i10) {
        this.f33423a = i10;
        this.f33424b = stVar;
    }

    @Override
    public final void run() {
        switch (this.f33423a) {
            case 0:
                this.f33424b.f37553c0 = null;
                return;
            case 1:
                st stVar = this.f33424b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.rd0 rd0Var = stVar.C;
                if (rd0Var != null) {
                    rd0Var.a();
                    stVar.f37574z.removeView(stVar.C);
                    stVar.C = null;
                    return;
                }
                return;
            default:
                this.f33424b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                return;
        }
    }
}
