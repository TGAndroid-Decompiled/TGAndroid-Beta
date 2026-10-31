package org.telegram.ui;

import android.view.View;
public final class k0 extends gf.e {
    public final int d = 1;
    public final Object e;
    public final Object f38647f;
    public final Object f38648g;

    public k0(h4 h4Var, z2 z2Var, org.telegram.ui.Components.q80 q80Var) {
        this.e = h4Var;
        this.f38647f = z2Var;
        this.f38648g = q80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.f39482c.n(h4Var.f39487w, true);
                View view = h4Var.f39486s;
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
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f38648g).f37301a, 10), 250L);
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
                org.telegram.ui.Components.q80 q80Var = (org.telegram.ui.Components.q80) this.f38648g;
                h4 h4Var = (h4) this.e;
                ji.a aVar = h4Var.f39482c;
                z2 z2Var = (z2) this.f38647f;
                if (z2Var != null) {
                    view = z2Var.f43985b;
                } else {
                    view = null;
                }
                h4Var.f39486s = view;
                org.telegram.ui.Components.uz0 uz0Var = (org.telegram.ui.Components.uz0) q80Var.f29568i;
                aVar.n(h4Var.f39487w, true);
                if (z2Var != null) {
                    h4Var.f39487w = ji.a.k(z2Var.d, q80Var.f29568i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21336ze, false);
                    h4Var.f39487w.g(org.telegram.ui.ActionBar.t6.r1(0.8f, x02), org.telegram.ui.ActionBar.t6.r1(1.3f, x02), org.telegram.ui.ActionBar.t6.r1(1.0f, x02), org.telegram.ui.ActionBar.t6.r1(4.0f, x02));
                    h4Var.f39487w.f30520x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
                    aVar.c(h4Var.f39487w, z2Var);
                }
                View view2 = h4Var.f39486s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                fn fnVar = (fn) this.f38648g;
                fnVar.f37301a.Rb = ((org.telegram.messenger.jj) this.e).f1();
                un unVar = fnVar.f37301a;
                unVar.Sb = 0;
                unVar.Tb = null;
                ((org.telegram.ui.Cells.q1) this.f38647f).invalidate();
                return;
        }
    }

    public k0(fn fnVar, org.telegram.messenger.jj jjVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f38648g = fnVar;
        this.e = jjVar;
        this.f38647f = q1Var;
    }
}
