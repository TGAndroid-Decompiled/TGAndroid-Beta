package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.y5 {
    public MessageObject f39990a;
    public int f39991b = 0;
    public boolean f39992c = true;
    public int d = 0;
    public int f39993e;
    public boolean f39994f;
    public int f39995g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39990a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f45000u6.indexOf(this.f39990a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f45058z0.i1(indexOf, (int) ((this.f39993e + this.f39995g) - znVar.f44978s9), this.f39994f);
            }
        } else {
            znVar.A0.T();
            znVar.f45058z0.i1(this.f39991b, this.d, this.f39992c);
        }
        this.f39990a = null;
        znVar.f44896m3 = true;
        znVar.ad(false);
        AndroidUtilities.runOnUIThread(new cj(this, 9));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Nc);
        xk xkVar = znVar.f45030wa;
        if (xkVar.f41249n) {
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
