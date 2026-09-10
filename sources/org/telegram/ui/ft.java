package org.telegram.ui;

import android.graphics.Bitmap;
public final class ft implements Runnable {
    public final int f32910a;
    public final tt f32911b;

    public ft(tt ttVar, int i10) {
        this.f32910a = i10;
        this.f32911b = ttVar;
    }

    @Override
    public final void run() {
        switch (this.f32910a) {
            case 0:
                this.f32911b.f37018c0 = null;
                return;
            case 1:
                tt ttVar = this.f32911b;
                ttVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.pd0 pd0Var = ttVar.C;
                if (pd0Var != null) {
                    pd0Var.a();
                    ttVar.f37039z.removeView(ttVar.C);
                    ttVar.C = null;
                    return;
                }
                return;
            default:
                this.f32911b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wr.h).start();
                return;
        }
    }
}
