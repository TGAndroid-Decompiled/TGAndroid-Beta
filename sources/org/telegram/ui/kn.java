package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kn extends w7.y5 {
    public MessageObject f34765a;
    public int f34766b = 0;
    public boolean f34767c = true;
    public int d = 0;
    public int e;
    public boolean f34768f;
    public int f34769g;
    public final xn h;

    public kn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f34765a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.A0.T();
            int indexOf = xnVar.f39563u6.indexOf(this.f34765a) + xnVar.A0.J;
            if (indexOf >= 0) {
                xnVar.f39621z0.i1(indexOf, (int) ((this.e + this.f34769g) - xnVar.f39541s9), this.f34768f);
            }
        } else {
            xnVar.A0.T();
            xnVar.f39621z0.i1(this.f34766b, this.d, this.f34767c);
        }
        this.f34765a = null;
        xnVar.f39459m3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new aj(this, 8));
    }

    @Override
    public final void c() {
        xn xnVar = this.h;
        xnVar.I9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.I9, xn.Mc);
        sk skVar = xnVar.f39593wa;
        if (skVar.f34262n) {
            skVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
