package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.z5 {
    public MessageObject f35695a;
    public int f35696b = 0;
    public boolean f35697c = true;
    public int d = 0;
    public int e;
    public boolean f35698f;
    public int f35699g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f35695a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f40455u6.indexOf(this.f35695a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f40513z0.i1(indexOf, (int) ((this.e + this.f35699g) - znVar.f40433s9), this.f35698f);
            }
        } else {
            znVar.A0.T();
            znVar.f40513z0.i1(this.f35696b, this.d, this.f35697c);
        }
        this.f35695a = null;
        znVar.f40351m3 = true;
        znVar.Wc(false);
        AndroidUtilities.runOnUIThread(new cj(this, 8));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Mc);
        uk ukVar = znVar.f40485wa;
        if (ukVar.f36622n) {
            ukVar.d();
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
