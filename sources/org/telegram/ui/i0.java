package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34275f;
    public final Object f34276g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.m90 m90Var) {
        this.e = h4Var;
        this.f34275f = a3Var;
        this.f34276g = m90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.f37897c.l(h4Var.v, true);
                View view = h4Var.f37901s;
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
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f34276g).f35408a, 9), 250L);
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
                org.telegram.ui.Components.m90 m90Var = (org.telegram.ui.Components.m90) this.f34276g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.i90 i90Var = h4Var.f37897c;
                a3 a3Var = (a3) this.f34275f;
                if (a3Var != null) {
                    view = a3Var.f31930b;
                } else {
                    view = null;
                }
                h4Var.f37901s = view;
                org.telegram.ui.Components.z01 z01Var = (org.telegram.ui.Components.z01) m90Var.f26369i;
                i90Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.i90.i(a3Var.d, m90Var.f26369i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    h4Var.v.f27157w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    i90Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f37901s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f34276g;
                lnVar.f35408a.f40472vb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.f35408a;
                znVar.f40486wb = 0;
                znVar.f40499xb = null;
                ((org.telegram.ui.Cells.u1) this.f34275f).invalidate();
                return;
        }
    }

    public i0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34276g = lnVar;
        this.e = messageObject;
        this.f34275f = u1Var;
    }
}
