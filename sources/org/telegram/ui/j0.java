package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f46779e;
    public final Object f46780f;
    public final Object f46781g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.x70 x70Var) {
        this.f46779e = g4Var;
        this.f46780f = z2Var;
        this.f46781g = x70Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f46779e;
                g4Var.f49251c.n(g4Var.f49257w, true);
                View view = g4Var.f49256s;
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
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46781g).f48227a, 10), 250L);
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
                org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) this.f46781g;
                g4 g4Var = (g4) this.f46779e;
                n2.n0 n0Var = g4Var.f49251c;
                z2 z2Var = (z2) this.f46780f;
                if (z2Var != null) {
                    view = z2Var.f52177b;
                } else {
                    view = null;
                }
                g4Var.f49256s = view;
                org.telegram.ui.Components.qy0 qy0Var = (org.telegram.ui.Components.qy0) x70Var.f40221i;
                n0Var.n(g4Var.f49257w, true);
                if (z2Var != null) {
                    g4Var.f49257w = n2.n0.k(z2Var.d, x70Var.f40221i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28307ze, false);
                    g4Var.f49257w.g(org.telegram.ui.ActionBar.m6.r1(0.8f, x02), org.telegram.ui.ActionBar.m6.r1(1.3f, x02), org.telegram.ui.ActionBar.m6.r1(1.0f, x02), org.telegram.ui.ActionBar.m6.r1(4.0f, x02));
                    g4Var.f49257w.f31792x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    n0Var.c(g4Var.f49257w, z2Var);
                }
                View view2 = g4Var.f49256s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                nm nmVar = (nm) this.f46781g;
                nmVar.f48227a.Yb = ((org.telegram.messenger.ij) this.f46779e).e1();
                cn cnVar = nmVar.f48227a;
                cnVar.Zb = 0;
                cnVar.f44430ac = null;
                ((org.telegram.ui.Cells.q1) this.f46780f).invalidate();
                return;
        }
    }

    public j0(nm nmVar, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f46781g = nmVar;
        this.f46779e = ijVar;
        this.f46780f = q1Var;
    }
}
