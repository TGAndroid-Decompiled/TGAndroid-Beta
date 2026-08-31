package org.telegram.ui;

import android.graphics.Bitmap;
public final class bt implements Runnable {
    public final int f35586a;
    public final qt f35587b;

    public bt(qt qtVar, int i10) {
        this.f35586a = i10;
        this.f35587b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f35586a) {
            case 0:
                this.f35587b.f40674c0 = null;
                return;
            case 1:
                qt qtVar = this.f35587b;
                qtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.jd0 jd0Var = qtVar.C;
                if (jd0Var != null) {
                    jd0Var.a();
                    qtVar.f40696z.removeView(qtVar.C);
                    qtVar.C = null;
                    return;
                }
                return;
            default:
                this.f35587b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                return;
        }
    }
}
