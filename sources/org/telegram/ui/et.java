package org.telegram.ui;

import android.graphics.Bitmap;
public final class et implements Runnable {
    public final int f36169a;
    public final st f36170b;

    public et(st stVar, int i10) {
        this.f36169a = i10;
        this.f36170b = stVar;
    }

    @Override
    public final void run() {
        switch (this.f36169a) {
            case 0:
                this.f36170b.f40530c0 = null;
                return;
            case 1:
                st stVar = this.f36170b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.gd0 gd0Var = stVar.C;
                if (gd0Var != null) {
                    gd0Var.a();
                    stVar.f40552z.removeView(stVar.C);
                    stVar.C = null;
                    return;
                }
                return;
            default:
                this.f36170b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                return;
        }
    }
}
