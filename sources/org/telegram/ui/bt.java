package org.telegram.ui;

import android.graphics.Bitmap;
public final class bt implements Runnable {
    public final int f32435a;
    public final qt f32436b;

    public bt(qt qtVar, int i10) {
        this.f32435a = i10;
        this.f32436b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f32435a) {
            case 0:
                this.f32436b.f36888c0 = null;
                return;
            case 1:
                qt qtVar = this.f32436b;
                qtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.qd0 qd0Var = qtVar.C;
                if (qd0Var != null) {
                    qd0Var.a();
                    qtVar.f36909z.removeView(qtVar.C);
                    qtVar.C = null;
                    return;
                }
                return;
            default:
                this.f32436b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.sr.h).start();
                return;
        }
    }
}
