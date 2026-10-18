package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class fn extends w7.a6 {
    public MessageObject f36981a;
    public int f36982b = 0;
    public boolean f36983c = true;
    public int d = 0;
    public int e;
    public boolean f36984f;
    public int f36985g;
    public final sn h;

    public fn(sn snVar) {
        this.h = snVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36981a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.f41421u6.indexOf(this.f36981a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.f41479z0.i1(indexOf, (int) ((this.e + this.f36985g) - snVar.f41398s9), this.f36984f);
            }
        } else {
            snVar.A0.T();
            snVar.f41479z0.i1(this.f36982b, this.d, this.f36983c);
        }
        this.f36981a = null;
        snVar.f41316m3 = true;
        snVar.ad(false);
        AndroidUtilities.runOnUIThread(new vi(this, 9));
    }

    @Override
    public final void c() {
        sn snVar = this.h;
        snVar.I9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.I9, sn.Nc);
        qk qkVar = snVar.f41450wa;
        if (qkVar.f43290n) {
            qkVar.d();
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
