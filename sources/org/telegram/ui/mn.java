package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.y5 {
    public MessageObject f39976a;
    public int f39977b = 0;
    public boolean f39978c = true;
    public int d = 0;
    public int f39979e;
    public boolean f39980f;
    public int f39981g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39976a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f44955u6.indexOf(this.f39976a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f45013z0.i1(indexOf, (int) ((this.f39979e + this.f39981g) - znVar.f44933s9), this.f39980f);
            }
        } else {
            znVar.A0.T();
            znVar.f45013z0.i1(this.f39977b, this.d, this.f39978c);
        }
        this.f39976a = null;
        znVar.f44851m3 = true;
        znVar.ad(false);
        AndroidUtilities.runOnUIThread(new cj(this, 9));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Nc);
        xk xkVar = znVar.f44985wa;
        if (xkVar.f40976n) {
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
