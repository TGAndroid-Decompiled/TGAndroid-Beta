package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class dn extends w7.a6 {
    public MessageObject f36422a;
    public int f36423b = 0;
    public boolean f36424c = true;
    public int d = 0;
    public int e;
    public boolean f36425f;
    public int f36426g;
    public final qn h;

    public dn(qn qnVar) {
        this.h = qnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36422a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.A0.T();
            int indexOf = qnVar.f40868u6.indexOf(this.f36422a) + qnVar.A0.J;
            if (indexOf >= 0) {
                qnVar.f40926z0.i1(indexOf, (int) ((this.e + this.f36426g) - qnVar.f40845s9), this.f36425f);
            }
        } else {
            qnVar.A0.T();
            qnVar.f40926z0.i1(this.f36423b, this.d, this.f36424c);
        }
        this.f36422a = null;
        qnVar.f40763m3 = true;
        qnVar.bd(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override
    public final void c() {
        qn qnVar = this.h;
        qnVar.I9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.I9, qn.Oc);
        ok okVar = qnVar.f40897wa;
        if (okVar.f42388n) {
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
