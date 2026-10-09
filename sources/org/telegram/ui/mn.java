package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.y5 {
    public MessageObject f39946a;
    public int f39947b = 0;
    public boolean f39948c = true;
    public int d = 0;
    public int f39949e;
    public boolean f39950f;
    public int f39951g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39946a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f44956u6.indexOf(this.f39946a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f45014z0.i1(indexOf, (int) ((this.f39949e + this.f39951g) - znVar.f44934s9), this.f39950f);
            }
        } else {
            znVar.A0.T();
            znVar.f45014z0.i1(this.f39947b, this.d, this.f39948c);
        }
        this.f39946a = null;
        znVar.f44852m3 = true;
        znVar.ad(false);
        AndroidUtilities.runOnUIThread(new cj(this, 9));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Nc);
        xk xkVar = znVar.f44986wa;
        if (xkVar.f41205n) {
            xkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
