package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k0 extends af.f {
    public final int d = 1;
    public final Object f38245e;
    public final Object f38246f;
    public final Object f38247g;

    public k0(l4 l4Var, d3 d3Var, org.telegram.ui.Components.h90 h90Var) {
        this.f38245e = l4Var;
        this.f38246f = d3Var;
        this.f38247g = h90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.f38245e;
                l4Var.f39610c.l(l4Var.v, true);
                View view = l4Var.f39615s;
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
    public void c(boolean z4) {
        switch (this.d) {
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f38247g).f38188a, 9), 250L);
                    return;
                }
                return;
            default:
                super.c(z4);
                return;
        }
    }

    @Override
    public final void d() {
        View view;
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) this.f38247g;
                l4 l4Var = (l4) this.f38245e;
                org.telegram.ui.Components.d90 d90Var = l4Var.f39610c;
                d3 d3Var = (d3) this.f38246f;
                if (d3Var != null) {
                    view = d3Var.f35980b;
                } else {
                    view = null;
                }
                l4Var.f39615s = view;
                org.telegram.ui.Components.p01 p01Var = (org.telegram.ui.Components.p01) h90Var.f27417i;
                d90Var.l(l4Var.v, true);
                if (d3Var != null) {
                    l4Var.v = org.telegram.ui.Components.d90.i(d3Var.d, h90Var.f27417i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ld, false);
                    l4Var.v.f(org.telegram.ui.ActionBar.k6.l1(0.8f, w02), org.telegram.ui.ActionBar.k6.l1(1.3f, w02), org.telegram.ui.ActionBar.k6.l1(1.0f, w02), org.telegram.ui.ActionBar.k6.l1(4.0f, w02));
                    l4Var.v.f28347w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    d90Var.b(l4Var.v, d3Var);
                }
                View view2 = l4Var.f39615s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                jn jnVar = (jn) this.f38247g;
                jnVar.f38188a.f43360tb = ((MessageObject) this.f38245e).getId();
                xn xnVar = jnVar.f38188a;
                xnVar.f43373ub = 0;
                xnVar.f43386vb = null;
                ((org.telegram.ui.Cells.t1) this.f38246f).invalidate();
                return;
        }
    }

    public k0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f38247g = jnVar;
        this.f38245e = messageObject;
        this.f38246f = t1Var;
    }
}
