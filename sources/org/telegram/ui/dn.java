package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class dn extends w7.a6 {
    public MessageObject f36415a;
    public int f36416b = 0;
    public boolean f36417c = true;
    public int d = 0;
    public int e;
    public boolean f36418f;
    public int f36419g;
    public final qn h;

    public dn(qn qnVar) {
        this.h = qnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36415a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.A0.T();
            int indexOf = qnVar.f40862u6.indexOf(this.f36415a) + qnVar.A0.J;
            if (indexOf >= 0) {
                qnVar.f40920z0.i1(indexOf, (int) ((this.e + this.f36419g) - qnVar.f40839s9), this.f36418f);
            }
        } else {
            qnVar.A0.T();
            qnVar.f40920z0.i1(this.f36416b, this.d, this.f36417c);
        }
        this.f36415a = null;
        qnVar.f40757m3 = true;
        qnVar.ad(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override
    public final void c() {
        qn qnVar = this.h;
        qnVar.I9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.I9, qn.Oc);
        ok okVar = qnVar.f40891wa;
        if (okVar.f42382n) {
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
