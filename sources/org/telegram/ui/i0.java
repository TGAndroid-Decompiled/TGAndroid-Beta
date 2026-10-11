package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends of.e {
    public final int d = 0;
    public final Object f38535e;
    public final Object f38536f;
    public final Object f38537g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.ga0 ga0Var) {
        this.f38535e = h4Var;
        this.f38536f = a3Var;
        this.f38537g = ga0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.f38535e;
                h4Var.f42098c.l(h4Var.v, true);
                View view = h4Var.f42103s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                return;
            default:
                super.b();
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f38537g).f39701a, 10), 250L);
                    return;
                }
                return;
            default:
                super.c(z10);
                return;
        }
    }

    @Override
    public final void d() {
        View view;
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.ga0 ga0Var = (org.telegram.ui.Components.ga0) this.f38537g;
                h4 h4Var = (h4) this.f38535e;
                org.telegram.ui.Components.ca0 ca0Var = h4Var.f42098c;
                a3 a3Var = (a3) this.f38536f;
                if (a3Var != null) {
                    view = a3Var.f35856b;
                } else {
                    view = null;
                }
                h4Var.f42103s = view;
                org.telegram.ui.Components.r11 r11Var = (org.telegram.ui.Components.r11) ga0Var.f26662i;
                ca0Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.ca0.i(a3Var.d, ga0Var.f26662i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    h4Var.v.g(org.telegram.ui.ActionBar.h6.m1(0.8f, x02), org.telegram.ui.ActionBar.h6.m1(1.3f, x02), org.telegram.ui.ActionBar.h6.m1(1.0f, x02), org.telegram.ui.ActionBar.h6.m1(4.0f, x02));
                    h4Var.v.f27659x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    ca0Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f42103s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f38537g;
                lnVar.f39701a.f44986wb = ((MessageObject) this.f38535e).getId();
                zn znVar = lnVar.f39701a;
                znVar.f45000xb = 0;
                znVar.f45012yb = null;
                ((org.telegram.ui.Cells.u1) this.f38536f).invalidate();
                return;
        }
    }

    public i0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f38537g = lnVar;
        this.f38535e = messageObject;
        this.f38536f = u1Var;
    }
}
