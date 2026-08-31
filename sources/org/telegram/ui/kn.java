package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kn extends k7.d6 {
    public MessageObject f38440a;
    public int f38441b = 0;
    public boolean f38442c = true;
    public int d = 0;
    public int f38443e;
    public boolean f38444f;
    public int f38445g;
    public final xn h;

    public kn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38440a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.f43403x0.T();
            int indexOf = xnVar.f43333r6.indexOf(this.f38440a) + xnVar.f43403x0.G;
            if (indexOf >= 0) {
                xnVar.f43389w0.i1(indexOf, (int) ((this.f38443e + this.f38445g) - xnVar.f43310p9), this.f38444f);
            }
        } else {
            xnVar.f43403x0.T();
            xnVar.f43389w0.i1(this.f38441b, this.d, this.f38442c);
        }
        this.f38440a = null;
        xnVar.f43231j3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new zi(this, 8));
    }

    @Override
    public final void c() {
        xn xnVar = this.h;
        xnVar.F9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.F9, xn.Kc);
        sk skVar = xnVar.f43359ta;
        if (skVar.f43471n) {
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
