package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.y5 {
    public MessageObject f40010a;
    public int f40011b = 0;
    public boolean f40012c = true;
    public int d = 0;
    public int f40013e;
    public boolean f40014f;
    public int f40015g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40010a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f44989u6.indexOf(this.f40010a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f45047z0.i1(indexOf, (int) ((this.f40013e + this.f40015g) - znVar.f44967s9), this.f40014f);
            }
        } else {
            znVar.A0.T();
            znVar.f45047z0.i1(this.f40011b, this.d, this.f40012c);
        }
        this.f40010a = null;
        znVar.f44885m3 = true;
        znVar.ad(false);
        AndroidUtilities.runOnUIThread(new cj(this, 9));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Nc);
        xk xkVar = znVar.f45019wa;
        if (xkVar.f41010n) {
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
