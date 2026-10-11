package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends of.e {
    public final int d = 0;
    public final Object f38569e;
    public final Object f38570f;
    public final Object f38571g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.fa0 fa0Var) {
        this.f38569e = h4Var;
        this.f38570f = a3Var;
        this.f38571g = fa0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.f38569e;
                h4Var.f42132c.l(h4Var.v, true);
                View view = h4Var.f42137s;
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
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f38571g).f39735a, 10), 250L);
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
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) this.f38571g;
                h4 h4Var = (h4) this.f38569e;
                org.telegram.ui.Components.ba0 ba0Var = h4Var.f42132c;
                a3 a3Var = (a3) this.f38570f;
                if (a3Var != null) {
                    view = a3Var.f35890b;
                } else {
                    view = null;
                }
                h4Var.f42137s = view;
                org.telegram.ui.Components.q11 q11Var = (org.telegram.ui.Components.q11) fa0Var.f26421i;
                ba0Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.ba0.i(a3Var.d, fa0Var.f26421i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    h4Var.v.g(org.telegram.ui.ActionBar.h6.m1(0.8f, x02), org.telegram.ui.ActionBar.h6.m1(1.3f, x02), org.telegram.ui.ActionBar.h6.m1(1.0f, x02), org.telegram.ui.ActionBar.h6.m1(4.0f, x02));
                    h4Var.v.f27404x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    ba0Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f42137s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f38571g;
                lnVar.f39735a.f45020wb = ((MessageObject) this.f38569e).getId();
                zn znVar = lnVar.f39735a;
                znVar.f45034xb = 0;
                znVar.f45046yb = null;
                ((org.telegram.ui.Cells.u1) this.f38570f).invalidate();
                return;
        }
    }

    public i0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f38571g = lnVar;
        this.f38569e = messageObject;
        this.f38570f = u1Var;
    }
}
