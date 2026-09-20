package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.z5 {
    public MessageObject f35770a;
    public int f35771b = 0;
    public boolean f35772c = true;
    public int d = 0;
    public int e;
    public boolean f35773f;
    public int f35774g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f35770a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f40497u6.indexOf(this.f35770a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f40555z0.i1(indexOf, (int) ((this.e + this.f35774g) - znVar.f40475s9), this.f35773f);
            }
        } else {
            znVar.A0.T();
            znVar.f40555z0.i1(this.f35771b, this.d, this.f35772c);
        }
        this.f35770a = null;
        znVar.f40393m3 = true;
        znVar.Wc(false);
        AndroidUtilities.runOnUIThread(new cj(this, 8));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Mc);
        uk ukVar = znVar.f40527wa;
        if (ukVar.f36702n) {
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
