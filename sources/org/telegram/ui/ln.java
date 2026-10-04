package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ln extends w7.a6 {
    public MessageObject f38300a;
    public int f38301b = 0;
    public boolean f38302c = true;
    public int d = 0;
    public int f38303e;
    public boolean f38304f;
    public int f38305g;
    public final yn h;

    public ln(yn ynVar) {
        this.h = ynVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38300a;
        yn ynVar = this.h;
        if (messageObject != null) {
            ynVar.f43564y0.T();
            int indexOf = ynVar.f43493s6.indexOf(this.f38300a) + ynVar.f43564y0.J;
            if (indexOf >= 0) {
                ynVar.f43551x0.i1(indexOf, (int) ((this.f38303e + this.f38305g) - ynVar.f43468q9), this.f38304f);
            }
        } else {
            ynVar.f43564y0.T();
            ynVar.f43551x0.i1(this.f38301b, this.d, this.f38302c);
        }
        this.f38300a = null;
        ynVar.f43391k3 = true;
        ynVar.Vc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override
    public final void c() {
        yn ynVar = this.h;
        ynVar.G9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.G9, yn.Hc);
        sk skVar = ynVar.f43522ua;
        if (skVar.f38105n) {
            skVar.d();
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
