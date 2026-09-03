package org.telegram.ui;

import android.graphics.Bitmap;
public final class ct implements Runnable {
    public final int f33217a;
    public final rt f33218b;

    public ct(rt rtVar, int i10) {
        this.f33217a = i10;
        this.f33218b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f33217a) {
            case 0:
                this.f33218b.f38032c0 = null;
                return;
            case 1:
                rt rtVar = this.f33218b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.id0 id0Var = rtVar.C;
                if (id0Var != null) {
                    id0Var.a();
                    rtVar.f38053z.removeView(rtVar.C);
                    rtVar.C = null;
                    return;
                }
                return;
            default:
                this.f33218b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.mr.h).start();
                return;
        }
    }
}
