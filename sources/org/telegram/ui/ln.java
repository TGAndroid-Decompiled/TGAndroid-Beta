package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ln extends w7.a6 {
    public MessageObject f38301a;
    public int f38302b = 0;
    public boolean f38303c = true;
    public int d = 0;
    public int f38304e;
    public boolean f38305f;
    public int f38306g;
    public final yn h;

    public ln(yn ynVar) {
        this.h = ynVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38301a;
        yn ynVar = this.h;
        if (messageObject != null) {
            ynVar.f43565y0.T();
            int indexOf = ynVar.f43494s6.indexOf(this.f38301a) + ynVar.f43565y0.J;
            if (indexOf >= 0) {
                ynVar.f43552x0.i1(indexOf, (int) ((this.f38304e + this.f38306g) - ynVar.f43469q9), this.f38305f);
            }
        } else {
            ynVar.f43565y0.T();
            ynVar.f43552x0.i1(this.f38302b, this.d, this.f38303c);
        }
        this.f38301a = null;
        ynVar.f43392k3 = true;
        ynVar.Vc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override
    public final void c() {
        yn ynVar = this.h;
        ynVar.G9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.G9, yn.Hc);
        sk skVar = ynVar.f43523ua;
        if (skVar.f38106n) {
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
