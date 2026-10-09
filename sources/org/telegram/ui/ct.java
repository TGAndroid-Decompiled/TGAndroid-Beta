package org.telegram.ui;

import android.graphics.Bitmap;
public final class ct implements Runnable {
    public final int f36735a;
    public final rt f36736b;

    public ct(rt rtVar, int i10) {
        this.f36735a = i10;
        this.f36736b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f36735a) {
            case 0:
                this.f36736b.f41489c0 = null;
                return;
            case 1:
                rt rtVar = this.f36736b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.he0 he0Var = rtVar.C;
                if (he0Var != null) {
                    he0Var.a();
                    rtVar.f41511z.removeView(rtVar.C);
                    rtVar.C = null;
                    return;
                }
                return;
            default:
                this.f36736b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.hs.h).start();
                return;
        }
    }
}
