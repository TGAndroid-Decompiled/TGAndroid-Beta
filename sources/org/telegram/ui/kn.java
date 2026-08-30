package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kn extends k7.c6 {
    public MessageObject f35769a;
    public int f35770b = 0;
    public boolean f35771c = true;
    public int d = 0;
    public int e;
    public boolean f35772f;
    public int f35773g;
    public final xn h;

    public kn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f35769a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.f40234x0.T();
            int indexOf = xnVar.f40164r6.indexOf(this.f35769a) + xnVar.f40234x0.G;
            if (indexOf >= 0) {
                xnVar.f40220w0.i1(indexOf, (int) ((this.e + this.f35773g) - xnVar.f40141p9), this.f35772f);
            }
        } else {
            xnVar.f40234x0.T();
            xnVar.f40220w0.i1(this.f35770b, this.d, this.f35771c);
        }
        this.f35769a = null;
        xnVar.f40062j3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new zi(this, 8));
    }

    @Override
    public final void c() {
        xn xnVar = this.h;
        xnVar.F9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.F9, xn.Kc);
        sk skVar = xnVar.f40190ta;
        if (skVar.f39259n) {
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
