package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f46802e;
    public final Object f46803f;
    public final Object f46804g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.y70 y70Var) {
        this.f46802e = g4Var;
        this.f46803f = z2Var;
        this.f46804g = y70Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f46802e;
                g4Var.f48919c.n(g4Var.f48925w, true);
                View view = g4Var.f48924s;
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
    public void c(boolean z9) {
        switch (this.d) {
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46804g).f48207a, 10), 250L);
                    return;
                }
                return;
            default:
                super.c(z9);
                return;
        }
    }

    @Override
    public final void d() {
        View view;
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.y70 y70Var = (org.telegram.ui.Components.y70) this.f46804g;
                g4 g4Var = (g4) this.f46802e;
                n2.n0 n0Var = g4Var.f48919c;
                z2 z2Var = (z2) this.f46803f;
                if (z2Var != null) {
                    view = z2Var.f52391b;
                } else {
                    view = null;
                }
                g4Var.f48924s = view;
                org.telegram.ui.Components.ry0 ry0Var = (org.telegram.ui.Components.ry0) y70Var.f40634i;
                n0Var.n(g4Var.f48925w, true);
                if (z2Var != null) {
                    g4Var.f48925w = n2.n0.k(z2Var.d, y70Var.f40634i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28282ze, false);
                    g4Var.f48925w.g(org.telegram.ui.ActionBar.l6.r1(0.8f, x02), org.telegram.ui.ActionBar.l6.r1(1.3f, x02), org.telegram.ui.ActionBar.l6.r1(1.0f, x02), org.telegram.ui.ActionBar.l6.r1(4.0f, x02));
                    g4Var.f48925w.f32186x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    n0Var.c(g4Var.f48925w, z2Var);
                }
                View view2 = g4Var.f48924s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                nm nmVar = (nm) this.f46804g;
                nmVar.f48207a.Yb = ((org.telegram.messenger.ij) this.f46802e).e1();
                cn cnVar = nmVar.f48207a;
                cnVar.Zb = 0;
                cnVar.f44389ac = null;
                ((org.telegram.ui.Cells.q1) this.f46803f).invalidate();
                return;
        }
    }

    public j0(nm nmVar, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f46804g = nmVar;
        this.f46802e = ijVar;
        this.f46803f = q1Var;
    }
}
