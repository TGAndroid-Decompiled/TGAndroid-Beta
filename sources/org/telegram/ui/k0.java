package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k0 extends af.f {
    public final int d = 1;
    public final Object e;
    public final Object f35535f;
    public final Object f35536g;

    public k0(l4 l4Var, d3 d3Var, org.telegram.ui.Components.f90 f90Var) {
        this.e = l4Var;
        this.f35535f = d3Var;
        this.f35536g = f90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.e;
                l4Var.f36477c.l(l4Var.v, true);
                View view = l4Var.f36481s;
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
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35536g).f35381a, 9), 250L);
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
                org.telegram.ui.Components.f90 f90Var = (org.telegram.ui.Components.f90) this.f35536g;
                l4 l4Var = (l4) this.e;
                org.telegram.ui.Components.b90 b90Var = l4Var.f36477c;
                d3 d3Var = (d3) this.f35535f;
                if (d3Var != null) {
                    view = d3Var.f33494b;
                } else {
                    view = null;
                }
                l4Var.f36481s = view;
                org.telegram.ui.Components.o01 o01Var = (org.telegram.ui.Components.o01) f90Var.f24815i;
                b90Var.l(l4Var.v, true);
                if (d3Var != null) {
                    l4Var.v = org.telegram.ui.Components.b90.i(d3Var.d, f90Var.f24815i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    l4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    l4Var.v.f25650w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    b90Var.b(l4Var.v, d3Var);
                }
                View view2 = l4Var.f36481s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                jn jnVar = (jn) this.f35536g;
                jnVar.f35381a.f40191tb = ((MessageObject) this.e).getId();
                xn xnVar = jnVar.f35381a;
                xnVar.f40204ub = 0;
                xnVar.f40217vb = null;
                ((org.telegram.ui.Cells.t1) this.f35535f).invalidate();
                return;
        }
    }

    public k0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f35536g = jnVar;
        this.e = messageObject;
        this.f35535f = t1Var;
    }
}
