package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l0 extends ve.d {
    public final int d = 1;
    public final Object f39956e;
    public final Object f39957f;
    public final Object f39958g;

    public l0(l4 l4Var, e3 e3Var, org.telegram.ui.Components.m80 m80Var) {
        this.f39956e = l4Var;
        this.f39957f = e3Var;
        this.f39958g = m80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.f39956e;
                l4Var.f36375c.l(l4Var.v, true);
                View view = l4Var.f36380s;
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
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f39958g).f37236a, 9), 250L);
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
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.f39958g;
                l4 l4Var = (l4) this.f39956e;
                org.telegram.ui.Components.i80 i80Var = l4Var.f36375c;
                e3 e3Var = (e3) this.f39957f;
                if (e3Var != null) {
                    view = e3Var.f37799b;
                } else {
                    view = null;
                }
                l4Var.f36380s = view;
                org.telegram.ui.Components.rz0 rz0Var = (org.telegram.ui.Components.rz0) m80Var.f30768i;
                i80Var.l(l4Var.v, true);
                if (e3Var != null) {
                    l4Var.v = org.telegram.ui.Components.i80.i(e3Var.d, m80Var.f30768i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ld, false);
                    l4Var.v.f(org.telegram.ui.ActionBar.f6.l1(0.8f, w02), org.telegram.ui.ActionBar.f6.l1(1.3f, w02), org.telegram.ui.ActionBar.f6.l1(1.0f, w02), org.telegram.ui.ActionBar.f6.l1(4.0f, w02));
                    l4Var.v.f31590w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    i80Var.b(l4Var.v, e3Var);
                }
                View view2 = l4Var.f36380s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                cn cnVar = (cn) this.f39958g;
                cnVar.f37236a.f42075sb = ((MessageObject) this.f39956e).getId();
                qn qnVar = cnVar.f37236a;
                qnVar.f42088tb = 0;
                qnVar.f42101ub = null;
                ((org.telegram.ui.Cells.t1) this.f39957f).invalidate();
                return;
        }
    }

    public l0(cn cnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f39958g = cnVar;
        this.f39956e = messageObject;
        this.f39957f = t1Var;
    }
}
