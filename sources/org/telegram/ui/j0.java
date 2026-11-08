package org.telegram.ui;

import android.view.View;
public final class j0 extends vf.b {
    public final int d = 0;
    public final Object f46803e;
    public final Object f46804f;
    public final Object f46805g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.x70 x70Var) {
        this.f46803e = g4Var;
        this.f46804f = z2Var;
        this.f46805g = x70Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.f46803e;
                g4Var.f48268c.n(g4Var.f48274w, true);
                View view = g4Var.f48273s;
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
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46805g).f47557a, 10), 250L);
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
                org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) this.f46805g;
                g4 g4Var = (g4) this.f46803e;
                n2.n0 n0Var = g4Var.f48268c;
                z2 z2Var = (z2) this.f46804f;
                if (z2Var != null) {
                    view = z2Var.f52415b;
                } else {
                    view = null;
                }
                g4Var.f48273s = view;
                org.telegram.ui.Components.qy0 qy0Var = (org.telegram.ui.Components.qy0) x70Var.f40246i;
                n0Var.n(g4Var.f48274w, true);
                if (z2Var != null) {
                    g4Var.f48274w = n2.n0.k(z2Var.d, x70Var.f40246i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28269ze, false);
                    g4Var.f48274w.g(org.telegram.ui.ActionBar.k6.r1(0.8f, x02), org.telegram.ui.ActionBar.k6.r1(1.3f, x02), org.telegram.ui.ActionBar.k6.r1(1.0f, x02), org.telegram.ui.ActionBar.k6.r1(4.0f, x02));
                    g4Var.f48274w.f31751x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    n0Var.c(g4Var.f48274w, z2Var);
                }
                View view2 = g4Var.f48273s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                lm lmVar = (lm) this.f46805g;
                lmVar.f47557a.Wb = ((org.telegram.messenger.ij) this.f46803e).f1();
                an anVar = lmVar.f47557a;
                anVar.Xb = 0;
                anVar.Yb = null;
                ((org.telegram.ui.Cells.q1) this.f46804f).invalidate();
                return;
        }
    }

    public j0(lm lmVar, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f46805g = lmVar;
        this.f46803e = ijVar;
        this.f46804f = q1Var;
    }
}
