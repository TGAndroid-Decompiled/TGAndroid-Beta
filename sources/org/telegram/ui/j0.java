package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f48850e;
    public final Object f48851f;
    public final Object f48852g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.n80 n80Var) {
        this.f48850e = g4Var;
        this.f48851f = z2Var;
        this.f48852g = n80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f48850e;
                g4Var.f50749c.n(g4Var.f50755w, true);
                View view = g4Var.f50754s;
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
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f48852g).f49937a, 10), 250L);
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
                org.telegram.ui.Components.n80 n80Var = (org.telegram.ui.Components.n80) this.f48852g;
                g4 g4Var = (g4) this.f48850e;
                n2.o0 o0Var = g4Var.f50749c;
                z2 z2Var = (z2) this.f48851f;
                if (z2Var != null) {
                    view = z2Var.f54368b;
                } else {
                    view = null;
                }
                g4Var.f50754s = view;
                org.telegram.ui.Components.bz0 bz0Var = (org.telegram.ui.Components.bz0) n80Var.f37834i;
                o0Var.n(g4Var.f50755w, true);
                if (z2Var != null) {
                    g4Var.f50755w = n2.o0.k(z2Var.d, n80Var.f37834i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ce, false);
                    g4Var.f50755w.g(org.telegram.ui.ActionBar.m6.r1(0.8f, x02), org.telegram.ui.ActionBar.m6.r1(1.3f, x02), org.telegram.ui.ActionBar.m6.r1(1.0f, x02), org.telegram.ui.ActionBar.m6.r1(4.0f, x02));
                    g4Var.f50755w.f38839x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    o0Var.c(g4Var.f50755w, z2Var);
                }
                View view2 = g4Var.f50754s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                mm mmVar = (mm) this.f48852g;
                mmVar.f49937a.f45958ac = ((org.telegram.messenger.fj) this.f48850e).e1();
                bn bnVar = mmVar.f49937a;
                bnVar.f45973bc = 0;
                bnVar.f45987cc = null;
                ((org.telegram.ui.Cells.r1) this.f48851f).invalidate();
                return;
        }
    }

    public j0(mm mmVar, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48852g = mmVar;
        this.f48850e = fjVar;
        this.f48851f = r1Var;
    }
}
