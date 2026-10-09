package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.y5 {
    public MessageObject f39944a;
    public int f39945b = 0;
    public boolean f39946c = true;
    public int d = 0;
    public int f39947e;
    public boolean f39948f;
    public int f39949g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39944a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f44954u6.indexOf(this.f39944a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f45012z0.i1(indexOf, (int) ((this.f39947e + this.f39949g) - znVar.f44932s9), this.f39948f);
            }
        } else {
            znVar.A0.T();
            znVar.f45012z0.i1(this.f39945b, this.d, this.f39946c);
        }
        this.f39944a = null;
        znVar.f44850m3 = true;
        znVar.ad(false);
        AndroidUtilities.runOnUIThread(new cj(this, 9));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Nc);
        xk xkVar = znVar.f44984wa;
        if (xkVar.f41203n) {
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
