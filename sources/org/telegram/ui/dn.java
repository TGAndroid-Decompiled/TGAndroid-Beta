package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class dn extends w7.a6 {
    public MessageObject f36425a;
    public int f36426b = 0;
    public boolean f36427c = true;
    public int d = 0;
    public int e;
    public boolean f36428f;
    public int f36429g;
    public final qn h;

    public dn(qn qnVar) {
        this.h = qnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36425a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.A0.T();
            int indexOf = qnVar.f40871u6.indexOf(this.f36425a) + qnVar.A0.J;
            if (indexOf >= 0) {
                qnVar.f40929z0.i1(indexOf, (int) ((this.e + this.f36429g) - qnVar.f40848s9), this.f36428f);
            }
        } else {
            qnVar.A0.T();
            qnVar.f40929z0.i1(this.f36426b, this.d, this.f36427c);
        }
        this.f36425a = null;
        qnVar.f40766m3 = true;
        qnVar.bd(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override
    public final void c() {
        qn qnVar = this.h;
        qnVar.I9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.I9, qn.Oc);
        ok okVar = qnVar.f40900wa;
        if (okVar.f42391n) {
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
