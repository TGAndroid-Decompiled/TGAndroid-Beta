package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends qf.c {
    public final int d = 1;
    public final Object e;
    public final Object f40376f;
    public final Object f40377g;

    public j0(j4 j4Var, a3 a3Var, org.telegram.ui.Components.aa0 aa0Var) {
        this.e = j4Var;
        this.f40376f = a3Var;
        this.f40377g = aa0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                j4 j4Var = (j4) this.e;
                j4Var.f39921c.l(j4Var.v, true);
                View view = j4Var.f39925s;
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
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f40377g).f39423a, 11), 250L);
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
                org.telegram.ui.Components.aa0 aa0Var = (org.telegram.ui.Components.aa0) this.f40377g;
                j4 j4Var = (j4) this.e;
                org.telegram.ui.Components.w90 w90Var = j4Var.f39921c;
                a3 a3Var = (a3) this.f40376f;
                if (a3Var != null) {
                    view = a3Var.f37629b;
                } else {
                    view = null;
                }
                j4Var.f39925s = view;
                org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) aa0Var.f26447i;
                w90Var.l(j4Var.v, true);
                if (a3Var != null) {
                    j4Var.v = org.telegram.ui.Components.w90.i(a3Var.d, aa0Var.f26447i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ld, false);
                    j4Var.v.g(org.telegram.ui.ActionBar.y6.o1(0.8f, x02), org.telegram.ui.ActionBar.y6.o1(1.3f, x02), org.telegram.ui.ActionBar.y6.o1(1.0f, x02), org.telegram.ui.ActionBar.y6.o1(4.0f, x02));
                    j4Var.v.f27480x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    w90Var.b(j4Var.v, a3Var);
                }
                View view2 = j4Var.f39925s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                fn fnVar = (fn) this.f40377g;
                fnVar.f39423a.Sb = ((MessageObject) this.e).getId();
                un unVar = fnVar.f39423a;
                unVar.Tb = 0;
                unVar.Ub = null;
                ((org.telegram.ui.Cells.s1) this.f40376f).invalidate();
                return;
        }
    }

    public j0(fn fnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.f40377g = fnVar;
        this.e = messageObject;
        this.f40376f = s1Var;
    }
}
