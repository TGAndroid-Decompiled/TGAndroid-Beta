package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kn extends w7.z5 {
    public MessageObject f35116a;
    public int f35117b = 0;
    public boolean f35118c = true;
    public int d = 0;
    public int e;
    public boolean f35119f;
    public int f35120g;
    public final xn h;

    public kn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f35116a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.A0.T();
            int indexOf = xnVar.f39944u6.indexOf(this.f35116a) + xnVar.A0.J;
            if (indexOf >= 0) {
                xnVar.f40002z0.i1(indexOf, (int) ((this.e + this.f35120g) - xnVar.f39922s9), this.f35119f);
            }
        } else {
            xnVar.A0.T();
            xnVar.f40002z0.i1(this.f35117b, this.d, this.f35118c);
        }
        this.f35116a = null;
        xnVar.f39840m3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new cj(this, 8));
    }

    @Override
    public final void c() {
        xn xnVar = this.h;
        xnVar.I9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.I9, xn.Mc);
        uk ukVar = xnVar.f39974wa;
        if (ukVar.f35174n) {
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
