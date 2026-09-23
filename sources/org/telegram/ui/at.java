package org.telegram.ui;

import android.graphics.Bitmap;
public final class at implements Runnable {
    public final int f31880a;
    public final pt f31881b;

    public at(pt ptVar, int i10) {
        this.f31880a = i10;
        this.f31881b = ptVar;
    }

    @Override
    public final void run() {
        switch (this.f31880a) {
            case 0:
                this.f31881b.f36185c0 = null;
                return;
            case 1:
                pt ptVar = this.f31881b;
                ptVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fd0 fd0Var = ptVar.C;
                if (fd0Var != null) {
                    fd0Var.a();
                    ptVar.f36206z.removeView(ptVar.C);
                    ptVar.C = null;
                    return;
                }
                return;
            default:
                this.f31881b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                return;
        }
    }
}
