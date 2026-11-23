package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f48954e;
    public final Object f48955f;
    public final Object f48956g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.k80 k80Var) {
        this.f48954e = g4Var;
        this.f48955f = z2Var;
        this.f48956g = k80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f48954e;
                g4Var.f50840c.n(g4Var.f50846w, true);
                View view = g4Var.f50845s;
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
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f48956g).f50079a, 10), 250L);
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
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) this.f48956g;
                g4 g4Var = (g4) this.f48954e;
                n2.p0 p0Var = g4Var.f50840c;
                z2 z2Var = (z2) this.f48955f;
                if (z2Var != null) {
                    view = z2Var.f54490b;
                } else {
                    view = null;
                }
                g4Var.f50845s = view;
                org.telegram.ui.Components.az0 az0Var = (org.telegram.ui.Components.az0) k80Var.f36682i;
                p0Var.n(g4Var.f50846w, true);
                if (z2Var != null) {
                    g4Var.f50846w = n2.p0.k(z2Var.d, k80Var.f36682i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ce, false);
                    g4Var.f50846w.g(org.telegram.ui.ActionBar.n6.r1(0.8f, x02), org.telegram.ui.ActionBar.n6.r1(1.3f, x02), org.telegram.ui.ActionBar.n6.r1(1.0f, x02), org.telegram.ui.ActionBar.n6.r1(4.0f, x02));
                    g4Var.f50846w.f37729x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    p0Var.c(g4Var.f50846w, z2Var);
                }
                View view2 = g4Var.f50845s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                mm mmVar = (mm) this.f48956g;
                mmVar.f50079a.f46130ac = ((org.telegram.messenger.fj) this.f48954e).e1();
                bn bnVar = mmVar.f50079a;
                bnVar.f46145bc = 0;
                bnVar.f46159cc = null;
                ((org.telegram.ui.Cells.r1) this.f48955f).invalidate();
                return;
        }
    }

    public j0(mm mmVar, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48956g = mmVar;
        this.f48954e = fjVar;
        this.f48955f = r1Var;
    }
}
