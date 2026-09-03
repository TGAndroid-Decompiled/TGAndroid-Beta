package org.telegram.ui;

import android.graphics.Bitmap;
public final class bt implements Runnable {
    public final int f35594a;
    public final qt f35595b;

    public bt(qt qtVar, int i10) {
        this.f35594a = i10;
        this.f35595b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f35594a) {
            case 0:
                this.f35595b.f40648c0 = null;
                return;
            case 1:
                qt qtVar = this.f35595b;
                qtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.jd0 jd0Var = qtVar.C;
                if (jd0Var != null) {
                    jd0Var.a();
                    qtVar.f40670z.removeView(qtVar.C);
                    qtVar.C = null;
                    return;
                }
                return;
            default:
                this.f35595b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                return;
        }
    }
}
