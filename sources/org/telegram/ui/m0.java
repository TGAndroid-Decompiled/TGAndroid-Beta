package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class m0 extends ze.c {
    public final int d = 1;
    public final Object e;
    public final Object f35948f;
    public final Object f35949g;

    public m0(n4 n4Var, f3 f3Var, org.telegram.ui.Components.g90 g90Var) {
        this.e = n4Var;
        this.f35948f = f3Var;
        this.f35949g = g90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                n4 n4Var = (n4) this.e;
                n4Var.f36982c.l(n4Var.v, true);
                View view = n4Var.f36986s;
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
    public void c(boolean z4) {
        switch (this.d) {
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f35949g).f35808a, 9), 250L);
                    return;
                }
                return;
            default:
                super.c(z4);
                return;
        }
    }

    @Override
    public final void d() {
        View view;
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) this.f35949g;
                n4 n4Var = (n4) this.e;
                org.telegram.ui.Components.c90 c90Var = n4Var.f36982c;
                f3 f3Var = (f3) this.f35948f;
                if (f3Var != null) {
                    view = f3Var.f33928b;
                } else {
                    view = null;
                }
                n4Var.f36986s = view;
                org.telegram.ui.Components.o01 o01Var = (org.telegram.ui.Components.o01) g90Var.f25098i;
                c90Var.l(n4Var.v, true);
                if (f3Var != null) {
                    n4Var.v = org.telegram.ui.Components.c90.i(f3Var.d, g90Var.f25098i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    n4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    n4Var.v.f25922w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    c90Var.b(n4Var.v, f3Var);
                }
                View view2 = n4Var.f36986s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f35949g;
                lnVar.f35808a.f40757tb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.f35808a;
                znVar.f40770ub = 0;
                znVar.f40783vb = null;
                ((org.telegram.ui.Cells.s1) this.f35948f).invalidate();
                return;
        }
    }

    public m0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.f35949g = lnVar;
        this.e = messageObject;
        this.f35948f = s1Var;
    }
}
