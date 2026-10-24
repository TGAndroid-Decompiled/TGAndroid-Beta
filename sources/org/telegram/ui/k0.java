package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k0 extends pf.c {
    public final int d = 1;
    public final Object e;
    public final Object f38710f;
    public final Object f38711g;

    public k0(k4 k4Var, c3 c3Var, org.telegram.ui.Components.x90 x90Var) {
        this.e = k4Var;
        this.f38710f = c3Var;
        this.f38711g = x90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                k4 k4Var = (k4) this.e;
                k4Var.f37216c.l(k4Var.v, true);
                View view = k4Var.f37220s;
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
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f38711g).f36651a, 10), 250L);
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
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) this.f38711g;
                k4 k4Var = (k4) this.e;
                org.telegram.ui.Components.t90 t90Var = k4Var.f37216c;
                c3 c3Var = (c3) this.f38710f;
                if (c3Var != null) {
                    view = c3Var.f36203b;
                } else {
                    view = null;
                }
                k4Var.f37220s = view;
                org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) x90Var.f32544i;
                t90Var.l(k4Var.v, true);
                if (c3Var != null) {
                    k4Var.v = org.telegram.ui.Components.t90.i(c3Var.d, x90Var.f32544i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ld, false);
                    k4Var.v.g(org.telegram.ui.ActionBar.k6.o1(0.8f, x02), org.telegram.ui.ActionBar.k6.o1(1.3f, x02), org.telegram.ui.ActionBar.k6.o1(1.0f, x02), org.telegram.ui.ActionBar.k6.o1(4.0f, x02));
                    k4Var.v.f24703x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    t90Var.b(k4Var.v, c3Var);
                }
                View view2 = k4Var.f37220s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                dn dnVar = (dn) this.f38711g;
                dnVar.f36651a.Jb = ((MessageObject) this.e).getId();
                sn snVar = dnVar.f36651a;
                snVar.Kb = 0;
                snVar.Lb = null;
                ((org.telegram.ui.Cells.t1) this.f38710f).invalidate();
                return;
        }
    }

    public k0(dn dnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f38711g = dnVar;
        this.e = messageObject;
        this.f38710f = t1Var;
    }
}
