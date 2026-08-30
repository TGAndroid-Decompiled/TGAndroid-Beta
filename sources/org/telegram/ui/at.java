package org.telegram.ui;

import android.graphics.Bitmap;
public final class at implements Runnable {
    public final int f32697a;
    public final pt f32698b;

    public at(pt ptVar, int i10) {
        this.f32697a = i10;
        this.f32698b = ptVar;
    }

    @Override
    public final void run() {
        switch (this.f32697a) {
            case 0:
                this.f32698b.f37516c0 = null;
                return;
            case 1:
                pt ptVar = this.f32698b;
                ptVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.hd0 hd0Var = ptVar.C;
                if (hd0Var != null) {
                    hd0Var.a();
                    ptVar.f37537z.removeView(ptVar.C);
                    ptVar.C = null;
                    return;
                }
                return;
            default:
                this.f32698b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                return;
        }
    }
}
