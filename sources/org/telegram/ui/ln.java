package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ln extends w7.a6 {
    public MessageObject f38306a;
    public int f38307b = 0;
    public boolean f38308c = true;
    public int d = 0;
    public int f38309e;
    public boolean f38310f;
    public int f38311g;
    public final yn h;

    public ln(yn ynVar) {
        this.h = ynVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38306a;
        yn ynVar = this.h;
        if (messageObject != null) {
            ynVar.f43572y0.T();
            int indexOf = ynVar.f43501s6.indexOf(this.f38306a) + ynVar.f43572y0.J;
            if (indexOf >= 0) {
                ynVar.f43559x0.i1(indexOf, (int) ((this.f38309e + this.f38311g) - ynVar.f43476q9), this.f38310f);
            }
        } else {
            ynVar.f43572y0.T();
            ynVar.f43559x0.i1(this.f38307b, this.d, this.f38308c);
        }
        this.f38306a = null;
        ynVar.f43399k3 = true;
        ynVar.Vc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override
    public final void c() {
        yn ynVar = this.h;
        ynVar.G9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.G9, yn.Hc);
        sk skVar = ynVar.f43530ua;
        if (skVar.f38111n) {
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
