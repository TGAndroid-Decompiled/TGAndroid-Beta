package org.telegram.ui;

import android.view.View;
public final class k0 extends sf.b {
    public final int d = 1;
    public final Object f46721e;
    public final Object f46722f;
    public final Object f46723g;

    public k0(i4 i4Var, a3 a3Var, org.telegram.ui.Components.t70 t70Var) {
        this.f46721e = i4Var;
        this.f46722f = a3Var;
        this.f46723g = t70Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f46721e;
                i4Var.f46112c.n(i4Var.f46118w, true);
                View view = i4Var.f46117s;
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
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f46723g).f45934a, 10), 250L);
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
                org.telegram.ui.Components.t70 t70Var = (org.telegram.ui.Components.t70) this.f46723g;
                i4 i4Var = (i4) this.f46721e;
                m2.p0 p0Var = i4Var.f46112c;
                a3 a3Var = (a3) this.f46722f;
                if (a3Var != null) {
                    view = a3Var.f43573b;
                } else {
                    view = null;
                }
                i4Var.f46117s = view;
                org.telegram.ui.Components.py0 py0Var = (org.telegram.ui.Components.py0) t70Var.f38328i;
                p0Var.n(i4Var.f46118w, true);
                if (a3Var != null) {
                    i4Var.f46118w = m2.p0.k(a3Var.d, t70Var.f38328i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28298ze, false);
                    i4Var.f46118w.g(org.telegram.ui.ActionBar.k6.r1(0.8f, x02), org.telegram.ui.ActionBar.k6.r1(1.3f, x02), org.telegram.ui.ActionBar.k6.r1(1.0f, x02), org.telegram.ui.ActionBar.k6.r1(4.0f, x02));
                    i4Var.f46118w.f39944x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    p0Var.c(i4Var.f46118w, a3Var);
                }
                View view2 = i4Var.f46117s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                hm hmVar = (hm) this.f46723g;
                hmVar.f45934a.Xb = ((org.telegram.messenger.zi) this.f46721e).f1();
                wm wmVar = hmVar.f45934a;
                wmVar.Yb = 0;
                wmVar.Zb = null;
                ((org.telegram.ui.Cells.q1) this.f46722f).invalidate();
                return;
        }
    }

    public k0(hm hmVar, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f46723g = hmVar;
        this.f46721e = ziVar;
        this.f46722f = q1Var;
    }
}
