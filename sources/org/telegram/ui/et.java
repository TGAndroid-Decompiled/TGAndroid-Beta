package org.telegram.ui;

import android.graphics.Bitmap;
public final class et implements Runnable {
    public final int f36168a;
    public final st f36169b;

    public et(st stVar, int i10) {
        this.f36168a = i10;
        this.f36169b = stVar;
    }

    @Override
    public final void run() {
        switch (this.f36168a) {
            case 0:
                this.f36169b.f40529c0 = null;
                return;
            case 1:
                st stVar = this.f36169b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.gd0 gd0Var = stVar.C;
                if (gd0Var != null) {
                    gd0Var.a();
                    stVar.f40551z.removeView(stVar.C);
                    stVar.C = null;
                    return;
                }
                return;
            default:
                this.f36169b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                return;
        }
    }
}
