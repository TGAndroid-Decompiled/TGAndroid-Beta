package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kn extends k7.d6 {
    public MessageObject f38344a;
    public int f38345b = 0;
    public boolean f38346c = true;
    public int d = 0;
    public int f38347e;
    public boolean f38348f;
    public int f38349g;
    public final xn h;

    public kn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38344a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.f43381x0.T();
            int indexOf = xnVar.f43311r6.indexOf(this.f38344a) + xnVar.f43381x0.G;
            if (indexOf >= 0) {
                xnVar.f43367w0.i1(indexOf, (int) ((this.f38347e + this.f38349g) - xnVar.f43288p9), this.f38348f);
            }
        } else {
            xnVar.f43381x0.T();
            xnVar.f43367w0.i1(this.f38345b, this.d, this.f38346c);
        }
        this.f38344a = null;
        xnVar.f43209j3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new zi(this, 8));
    }

    @Override
    public final void c() {
        xn xnVar = this.h;
        xnVar.F9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.F9, xn.Kc);
        sk skVar = xnVar.f43337ta;
        if (skVar.f35874n) {
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
