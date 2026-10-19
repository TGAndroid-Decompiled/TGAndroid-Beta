package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l0 extends pf.c {
    public final int d = 1;
    public final Object e;
    public final Object f38699f;
    public final Object f38700g;

    public l0(l4 l4Var, d3 d3Var, org.telegram.ui.Components.y90 y90Var) {
        this.e = l4Var;
        this.f38699f = d3Var;
        this.f38700g = y90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.e;
                l4Var.f35517c.l(l4Var.v, true);
                View view = l4Var.f35521s;
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
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f38700g).f36004a, 10), 250L);
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
                org.telegram.ui.Components.y90 y90Var = (org.telegram.ui.Components.y90) this.f38700g;
                l4 l4Var = (l4) this.e;
                org.telegram.ui.Components.u90 u90Var = l4Var.f35517c;
                d3 d3Var = (d3) this.f38699f;
                if (d3Var != null) {
                    view = d3Var.f36230b;
                } else {
                    view = null;
                }
                l4Var.f35521s = view;
                org.telegram.ui.Components.i11 i11Var = (org.telegram.ui.Components.i11) y90Var.f32578i;
                u90Var.l(l4Var.v, true);
                if (d3Var != null) {
                    l4Var.v = org.telegram.ui.Components.u90.i(d3Var.d, y90Var.f32578i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    l4Var.v.g(org.telegram.ui.ActionBar.h6.m1(0.8f, x02), org.telegram.ui.ActionBar.h6.m1(1.3f, x02), org.telegram.ui.ActionBar.h6.m1(1.0f, x02), org.telegram.ui.ActionBar.h6.m1(4.0f, x02));
                    l4Var.v.f24891x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    u90Var.b(l4Var.v, d3Var);
                }
                View view2 = l4Var.f35521s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                cn cnVar = (cn) this.f38700g;
                cnVar.f36004a.f40892wb = ((MessageObject) this.e).getId();
                qn qnVar = cnVar.f36004a;
                qnVar.f40906xb = 0;
                qnVar.f40919yb = null;
                ((org.telegram.ui.Cells.u1) this.f38699f).invalidate();
                return;
        }
    }

    public l0(cn cnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f38700g = cnVar;
        this.e = messageObject;
        this.f38699f = u1Var;
    }
}
