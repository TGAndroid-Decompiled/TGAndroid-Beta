package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f48175e;
    public final Object f48176f;
    public final Object f48177g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.a80 a80Var) {
        this.f48175e = g4Var;
        this.f48176f = z2Var;
        this.f48177g = a80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f48175e;
                g4Var.f49450c.o(g4Var.f49456w, true);
                View view = g4Var.f49455s;
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
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f48177g).f49005a, 10), 250L);
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
                org.telegram.ui.Components.a80 a80Var = (org.telegram.ui.Components.a80) this.f48177g;
                g4 g4Var = (g4) this.f48175e;
                n2.o0 o0Var = g4Var.f49450c;
                z2 z2Var = (z2) this.f48176f;
                if (z2Var != null) {
                    view = z2Var.f53806b;
                } else {
                    view = null;
                }
                g4Var.f49455s = view;
                org.telegram.ui.Components.sy0 sy0Var = (org.telegram.ui.Components.sy0) a80Var.f32922i;
                o0Var.o(g4Var.f49456w, true);
                if (z2Var != null) {
                    g4Var.f49456w = n2.o0.k(z2Var.d, a80Var.f32922i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ce, false);
                    g4Var.f49456w.g(org.telegram.ui.ActionBar.j6.r1(0.8f, x02), org.telegram.ui.ActionBar.j6.r1(1.3f, x02), org.telegram.ui.ActionBar.j6.r1(1.0f, x02), org.telegram.ui.ActionBar.j6.r1(4.0f, x02));
                    g4Var.f49456w.f33884x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    o0Var.c(g4Var.f49456w, z2Var);
                }
                View view2 = g4Var.f49455s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                lm lmVar = (lm) this.f48177g;
                lmVar.f49005a.Zb = ((org.telegram.messenger.gj) this.f48175e).e1();
                an anVar = lmVar.f49005a;
                anVar.f45130ac = 0;
                anVar.f45145bc = null;
                ((org.telegram.ui.Cells.q1) this.f48176f).invalidate();
                return;
        }
    }

    public j0(lm lmVar, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f48177g = lmVar;
        this.f48175e = gjVar;
        this.f48176f = q1Var;
    }
}
