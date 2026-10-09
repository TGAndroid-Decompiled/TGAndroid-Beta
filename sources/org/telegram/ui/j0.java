package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends of.e {
    public final int d = 0;
    public final Object f38784e;
    public final Object f38785f;
    public final Object f38786g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.fa0 fa0Var) {
        this.f38784e = i4Var;
        this.f38785f = b3Var;
        this.f38786g = fa0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f38784e;
                i4Var.f41886c.l(i4Var.v, true);
                View view = i4Var.f41891s;
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
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f38786g).f39636a, 10), 250L);
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
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) this.f38786g;
                i4 i4Var = (i4) this.f38784e;
                org.telegram.ui.Components.ba0 ba0Var = i4Var.f41886c;
                b3 b3Var = (b3) this.f38785f;
                if (b3Var != null) {
                    view = b3Var.f36111b;
                } else {
                    view = null;
                }
                i4Var.f41891s = view;
                org.telegram.ui.Components.p11 p11Var = (org.telegram.ui.Components.p11) fa0Var.f26330i;
                ba0Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.ba0.i(b3Var.d, fa0Var.f26330i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ld, false);
                    i4Var.v.g(org.telegram.ui.ActionBar.i6.m1(0.8f, x02), org.telegram.ui.ActionBar.i6.m1(1.3f, x02), org.telegram.ui.ActionBar.i6.m1(1.0f, x02), org.telegram.ui.ActionBar.i6.m1(4.0f, x02));
                    i4Var.v.f27340x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    ba0Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f41891s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f38786g;
                lnVar.f39636a.f44987wb = ((MessageObject) this.f38784e).getId();
                zn znVar = lnVar.f39636a;
                znVar.f45001xb = 0;
                znVar.f45013yb = null;
                ((org.telegram.ui.Cells.u1) this.f38785f).invalidate();
                return;
        }
    }

    public j0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f38786g = lnVar;
        this.f38784e = messageObject;
        this.f38785f = u1Var;
    }
}
