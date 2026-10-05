package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ln extends w7.a6 {
    public MessageObject f38360a;
    public int f38361b = 0;
    public boolean f38362c = true;
    public int d = 0;
    public int f38363e;
    public boolean f38364f;
    public int f38365g;
    public final yn h;

    public ln(yn ynVar) {
        this.h = ynVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38360a;
        yn ynVar = this.h;
        if (messageObject != null) {
            ynVar.f43565y0.T();
            int indexOf = ynVar.f43494s6.indexOf(this.f38360a) + ynVar.f43565y0.J;
            if (indexOf >= 0) {
                ynVar.f43552x0.i1(indexOf, (int) ((this.f38363e + this.f38365g) - ynVar.f43469q9), this.f38364f);
            }
        } else {
            ynVar.f43565y0.T();
            ynVar.f43552x0.i1(this.f38361b, this.d, this.f38362c);
        }
        this.f38360a = null;
        ynVar.f43392k3 = true;
        ynVar.Vc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override
    public final void c() {
        yn ynVar = this.h;
        ynVar.G9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.G9, yn.Hc);
        sk skVar = ynVar.f43523ua;
        if (skVar.f38179n) {
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
