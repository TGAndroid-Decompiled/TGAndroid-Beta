package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k0 extends af.f {
    public final int d = 1;
    public final Object f38148e;
    public final Object f38149f;
    public final Object f38150g;

    public k0(l4 l4Var, d3 d3Var, org.telegram.ui.Components.h90 h90Var) {
        this.f38148e = l4Var;
        this.f38149f = d3Var;
        this.f38150g = h90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.f38148e;
                l4Var.f39555c.l(l4Var.v, true);
                View view = l4Var.f39560s;
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
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f38150g).f38085a, 9), 250L);
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
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) this.f38150g;
                l4 l4Var = (l4) this.f38148e;
                org.telegram.ui.Components.d90 d90Var = l4Var.f39555c;
                d3 d3Var = (d3) this.f38149f;
                if (d3Var != null) {
                    view = d3Var.f35958b;
                } else {
                    view = null;
                }
                l4Var.f39560s = view;
                org.telegram.ui.Components.o01 o01Var = (org.telegram.ui.Components.o01) h90Var.f27423i;
                d90Var.l(l4Var.v, true);
                if (d3Var != null) {
                    l4Var.v = org.telegram.ui.Components.d90.i(d3Var.d, h90Var.f27423i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ld, false);
                    l4Var.v.f(org.telegram.ui.ActionBar.k6.l1(0.8f, w02), org.telegram.ui.ActionBar.k6.l1(1.3f, w02), org.telegram.ui.ActionBar.k6.l1(1.0f, w02), org.telegram.ui.ActionBar.k6.l1(4.0f, w02));
                    l4Var.v.f28369w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    d90Var.b(l4Var.v, d3Var);
                }
                View view2 = l4Var.f39560s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                jn jnVar = (jn) this.f38150g;
                jnVar.f38085a.f43338tb = ((MessageObject) this.f38148e).getId();
                xn xnVar = jnVar.f38085a;
                xnVar.f43351ub = 0;
                xnVar.f43364vb = null;
                ((org.telegram.ui.Cells.t1) this.f38149f).invalidate();
                return;
        }
    }

    public k0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f38150g = jnVar;
        this.f38148e = messageObject;
        this.f38149f = t1Var;
    }
}
