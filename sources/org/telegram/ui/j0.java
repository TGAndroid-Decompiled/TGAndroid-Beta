package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends of.e {
    public final int d = 0;
    public final Object f39045e;
    public final Object f39046f;
    public final Object f39047g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.ja0 ja0Var) {
        this.f39045e = i4Var;
        this.f39046f = b3Var;
        this.f39047g = ja0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f39045e;
                i4Var.f43068c.l(i4Var.v, true);
                View view = i4Var.f43073s;
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
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f39047g).f40998a, 10), 250L);
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
                org.telegram.ui.Components.ja0 ja0Var = (org.telegram.ui.Components.ja0) this.f39047g;
                i4 i4Var = (i4) this.f39045e;
                org.telegram.ui.Components.fa0 fa0Var = i4Var.f43068c;
                b3 b3Var = (b3) this.f39046f;
                if (b3Var != null) {
                    view = b3Var.f36038b;
                } else {
                    view = null;
                }
                i4Var.f43073s = view;
                org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) ja0Var.f27435i;
                fa0Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.fa0.i(b3Var.d, ja0Var.f27435i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.g(org.telegram.ui.ActionBar.h6.m1(0.8f, x02), org.telegram.ui.ActionBar.h6.m1(1.3f, x02), org.telegram.ui.ActionBar.h6.m1(1.0f, x02), org.telegram.ui.ActionBar.h6.m1(4.0f, x02));
                    i4Var.v.f28486x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    fa0Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f43073s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                pn pnVar = (pn) this.f39047g;
                pnVar.f40998a.f37475wb = ((MessageObject) this.f39045e).getId();
                eo eoVar = pnVar.f40998a;
                eoVar.f37489xb = 0;
                eoVar.f37501yb = null;
                ((org.telegram.ui.Cells.u1) this.f39046f).invalidate();
                return;
        }
    }

    public j0(pn pnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f39047g = pnVar;
        this.f39045e = messageObject;
        this.f39046f = u1Var;
    }
}
