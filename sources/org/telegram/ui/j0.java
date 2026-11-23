package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f48854e;
    public final Object f48855f;
    public final Object f48856g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.n80 n80Var) {
        this.f48854e = g4Var;
        this.f48855f = z2Var;
        this.f48856g = n80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f48854e;
                g4Var.f50753c.n(g4Var.f50759w, true);
                View view = g4Var.f50758s;
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
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f48856g).f49941a, 10), 250L);
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
                org.telegram.ui.Components.n80 n80Var = (org.telegram.ui.Components.n80) this.f48856g;
                g4 g4Var = (g4) this.f48854e;
                n2.o0 o0Var = g4Var.f50753c;
                z2 z2Var = (z2) this.f48855f;
                if (z2Var != null) {
                    view = z2Var.f54372b;
                } else {
                    view = null;
                }
                g4Var.f50758s = view;
                org.telegram.ui.Components.bz0 bz0Var = (org.telegram.ui.Components.bz0) n80Var.f37838i;
                o0Var.n(g4Var.f50759w, true);
                if (z2Var != null) {
                    g4Var.f50759w = n2.o0.k(z2Var.d, n80Var.f37838i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ce, false);
                    g4Var.f50759w.g(org.telegram.ui.ActionBar.m6.r1(0.8f, x02), org.telegram.ui.ActionBar.m6.r1(1.3f, x02), org.telegram.ui.ActionBar.m6.r1(1.0f, x02), org.telegram.ui.ActionBar.m6.r1(4.0f, x02));
                    g4Var.f50759w.f38832x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    o0Var.c(g4Var.f50759w, z2Var);
                }
                View view2 = g4Var.f50758s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                mm mmVar = (mm) this.f48856g;
                mmVar.f49941a.f45962ac = ((org.telegram.messenger.gj) this.f48854e).e1();
                bn bnVar = mmVar.f49941a;
                bnVar.f45977bc = 0;
                bnVar.f45991cc = null;
                ((org.telegram.ui.Cells.r1) this.f48855f).invalidate();
                return;
        }
    }

    public j0(mm mmVar, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48856g = mmVar;
        this.f48854e = gjVar;
        this.f48855f = r1Var;
    }
}
