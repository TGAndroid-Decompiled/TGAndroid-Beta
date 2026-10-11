package org.telegram.ui;

import android.graphics.Bitmap;
public final class bt implements Runnable {
    public final int f36488a;
    public final qt f36489b;

    public bt(qt qtVar, int i10) {
        this.f36488a = i10;
        this.f36489b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f36488a) {
            case 0:
                this.f36489b.f41269c0 = null;
                return;
            case 1:
                qt qtVar = this.f36489b;
                qtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.he0 he0Var = qtVar.C;
                if (he0Var != null) {
                    he0Var.a();
                    qtVar.f41291z.removeView(qtVar.C);
                    qtVar.C = null;
                    return;
                }
                return;
            default:
                this.f36489b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.is.h).start();
                return;
        }
    }
}
