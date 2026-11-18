package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f48828e;
    public final Object f48829f;
    public final Object f48830g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.l80 l80Var) {
        this.f48828e = g4Var;
        this.f48829f = z2Var;
        this.f48830g = l80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f48828e;
                g4Var.f50708c.n(g4Var.f50714w, true);
                View view = g4Var.f50713s;
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
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f48830g).f49896a, 10), 250L);
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
                org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) this.f48830g;
                g4 g4Var = (g4) this.f48828e;
                n2.o0 o0Var = g4Var.f50708c;
                z2 z2Var = (z2) this.f48829f;
                if (z2Var != null) {
                    view = z2Var.f54326b;
                } else {
                    view = null;
                }
                g4Var.f50713s = view;
                org.telegram.ui.Components.zy0 zy0Var = (org.telegram.ui.Components.zy0) l80Var.f37074i;
                o0Var.n(g4Var.f50714w, true);
                if (z2Var != null) {
                    g4Var.f50714w = n2.o0.k(z2Var.d, l80Var.f37074i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ce, false);
                    g4Var.f50714w.g(org.telegram.ui.ActionBar.n6.r1(0.8f, x02), org.telegram.ui.ActionBar.n6.r1(1.3f, x02), org.telegram.ui.ActionBar.n6.r1(1.0f, x02), org.telegram.ui.ActionBar.n6.r1(4.0f, x02));
                    g4Var.f50714w.f38032x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    o0Var.c(g4Var.f50714w, z2Var);
                }
                View view2 = g4Var.f50713s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                mm mmVar = (mm) this.f48830g;
                mmVar.f49896a.f45935ac = ((org.telegram.messenger.fj) this.f48828e).e1();
                bn bnVar = mmVar.f49896a;
                bnVar.f45950bc = 0;
                bnVar.f45964cc = null;
                ((org.telegram.ui.Cells.r1) this.f48829f).invalidate();
                return;
        }
    }

    public j0(mm mmVar, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48830g = mmVar;
        this.f48828e = fjVar;
        this.f48829f = r1Var;
    }
}
