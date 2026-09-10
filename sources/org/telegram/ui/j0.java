package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f33827f;
    public final Object f33828g;

    public j0(j4 j4Var, c3 c3Var, org.telegram.ui.Components.n90 n90Var) {
        this.e = j4Var;
        this.f33827f = c3Var;
        this.f33828g = n90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                j4 j4Var = (j4) this.e;
                j4Var.f36856c.l(j4Var.v, true);
                View view = j4Var.f36860s;
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
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33828g).f35881a, 9), 250L);
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
                org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) this.f33828g;
                j4 j4Var = (j4) this.e;
                org.telegram.ui.Components.j90 j90Var = j4Var.f36856c;
                c3 c3Var = (c3) this.f33827f;
                if (c3Var != null) {
                    view = c3Var.f31510b;
                } else {
                    view = null;
                }
                j4Var.f36860s = view;
                org.telegram.ui.Components.x01 x01Var = (org.telegram.ui.Components.x01) n90Var.f25465i;
                j90Var.l(j4Var.v, true);
                if (c3Var != null) {
                    j4Var.v = org.telegram.ui.Components.j90.i(c3Var.d, n90Var.f25465i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    j4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    j4Var.v.f26363w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    j90Var.b(j4Var.v, c3Var);
                }
                View view2 = j4Var.f36860s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                pn pnVar = (pn) this.f33828g;
                pnVar.f35881a.f32540wb = ((MessageObject) this.e).getId();
                eo eoVar = pnVar.f35881a;
                eoVar.f32553xb = 0;
                eoVar.f32565yb = null;
                ((org.telegram.ui.Cells.t1) this.f33827f).invalidate();
                return;
        }
    }

    public j0(pn pnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f33828g = pnVar;
        this.e = messageObject;
        this.f33827f = t1Var;
    }
}
