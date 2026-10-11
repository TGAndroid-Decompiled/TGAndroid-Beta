package org.telegram.ui;

import android.graphics.Bitmap;
public final class bt implements Runnable {
    public final int f36454a;
    public final qt f36455b;

    public bt(qt qtVar, int i10) {
        this.f36454a = i10;
        this.f36455b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f36454a) {
            case 0:
                this.f36455b.f41235c0 = null;
                return;
            case 1:
                qt qtVar = this.f36455b;
                qtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.ie0 ie0Var = qtVar.C;
                if (ie0Var != null) {
                    ie0Var.a();
                    qtVar.f41257z.removeView(qtVar.C);
                    qtVar.C = null;
                    return;
                }
                return;
            default:
                this.f36455b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.is.h).start();
                return;
        }
    }
}
