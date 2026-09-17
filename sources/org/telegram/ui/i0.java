package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends of.e {
    public final int d = 0;
    public final Object f37144e;
    public final Object f37145f;
    public final Object f37146g;

    public i0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.e90 e90Var) {
        this.f37144e = i4Var;
        this.f37145f = b3Var;
        this.f37146g = e90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f37144e;
                i4Var.f41436c.l(i4Var.v, true);
                View view = i4Var.f41441s;
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
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37146g).f39284a, 9), 250L);
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
                org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) this.f37146g;
                i4 i4Var = (i4) this.f37144e;
                org.telegram.ui.Components.a90 a90Var = i4Var.f41436c;
                b3 b3Var = (b3) this.f37145f;
                if (b3Var != null) {
                    view = b3Var.f34612b;
                } else {
                    view = null;
                }
                i4Var.f41441s = view;
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) e90Var.f25624i;
                a90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.a90.i(b3Var.d, e90Var.f25624i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    i4Var.v.f26691w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    a90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f41441s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                on onVar = (on) this.f37146g;
                onVar.f39284a.f35472wb = ((MessageObject) this.f37144e).getId();
                co coVar = onVar.f39284a;
                coVar.f35485xb = 0;
                coVar.f35497yb = null;
                ((org.telegram.ui.Cells.t1) this.f37145f).invalidate();
                return;
        }
    }

    public i0(on onVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f37146g = onVar;
        this.f37144e = messageObject;
        this.f37145f = t1Var;
    }
}
