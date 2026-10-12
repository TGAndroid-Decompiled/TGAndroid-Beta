package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k0 extends pf.c {
    public final int d = 0;
    public final Object e;
    public final Object f37478f;
    public final Object f37479g;

    public k0(k4 k4Var, d3 d3Var, org.telegram.ui.Components.ea0 ea0Var) {
        this.e = k4Var;
        this.f37478f = d3Var;
        this.f37479g = ea0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                k4 k4Var = (k4) this.e;
                k4Var.f42502c.l(k4Var.v, true);
                View view = k4Var.f42506s;
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
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37479g).f39497a, 10), 250L);
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
                org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) this.f37479g;
                k4 k4Var = (k4) this.e;
                org.telegram.ui.Components.aa0 aa0Var = k4Var.f42502c;
                d3 d3Var = (d3) this.f37478f;
                if (d3Var != null) {
                    view = d3Var.f35127b;
                } else {
                    view = null;
                }
                k4Var.f42506s = view;
                org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) ea0Var.f24658i;
                aa0Var.l(k4Var.v, true);
                if (d3Var != null) {
                    k4Var.v = org.telegram.ui.Components.aa0.i(d3Var.d, ea0Var.f24658i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ld, false);
                    k4Var.v.g(org.telegram.ui.ActionBar.g6.m1(0.8f, x02), org.telegram.ui.ActionBar.g6.m1(1.3f, x02), org.telegram.ui.ActionBar.g6.m1(1.0f, x02), org.telegram.ui.ActionBar.g6.m1(4.0f, x02));
                    k4Var.v.f25624x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    aa0Var.b(k4Var.v, d3Var);
                }
                View view2 = k4Var.f42506s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                qn qnVar = (qn) this.f37479g;
                qnVar.f39497a.f36157wb = ((MessageObject) this.e).getId();
                fo foVar = qnVar.f39497a;
                foVar.f36171xb = 0;
                foVar.f36184yb = null;
                ((org.telegram.ui.Cells.u1) this.f37478f).invalidate();
                return;
        }
    }

    public k0(qn qnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f37479g = qnVar;
        this.e = messageObject;
        this.f37478f = u1Var;
    }
}
