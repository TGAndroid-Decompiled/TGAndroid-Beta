package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class dn extends w7.a6 {
    public MessageObject f36424a;
    public int f36425b = 0;
    public boolean f36426c = true;
    public int d = 0;
    public int e;
    public boolean f36427f;
    public int f36428g;
    public final qn h;

    public dn(qn qnVar) {
        this.h = qnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36424a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.A0.T();
            int indexOf = qnVar.f40870u6.indexOf(this.f36424a) + qnVar.A0.J;
            if (indexOf >= 0) {
                qnVar.f40928z0.i1(indexOf, (int) ((this.e + this.f36428g) - qnVar.f40847s9), this.f36427f);
            }
        } else {
            qnVar.A0.T();
            qnVar.f40928z0.i1(this.f36425b, this.d, this.f36426c);
        }
        this.f36424a = null;
        qnVar.f40765m3 = true;
        qnVar.ad(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override
    public final void c() {
        qn qnVar = this.h;
        qnVar.I9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.I9, qn.Oc);
        ok okVar = qnVar.f40899wa;
        if (okVar.f42381n) {
            okVar.d();
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
