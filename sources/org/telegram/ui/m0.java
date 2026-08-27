package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class m0 extends we.d {
    public final int d = 1;

    public final Object f40279e;

    public final Object f40280f;

    public final Object f40281g;

    public m0(m4 m4Var, f3 f3Var, org.telegram.ui.Components.q80 q80Var) {
        this.f40279e = m4Var;
        this.f40280f = f3Var;
        this.f40281g = q80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                m4 m4Var = (m4) this.f40279e;
                m4Var.f37286c.l(m4Var.v, true);
                View view = m4Var.f37291s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                break;
            default:
                super.b();
                break;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f40281g).f37446a, 9), 250L);
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.q80 q80Var = (org.telegram.ui.Components.q80) this.f40281g;
                m4 m4Var = (m4) this.f40279e;
                org.telegram.ui.Components.m80 m80Var = m4Var.f37286c;
                f3 f3Var = (f3) this.f40280f;
                m4Var.f37291s = f3Var != null ? f3Var.f37917b : null;
                m80Var.l(m4Var.v, true);
                if (f3Var != null) {
                    m4Var.v = org.telegram.ui.Components.m80.i(f3Var.d, q80Var.f31841i, 0.0f);
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ld, false);
                    m4Var.v.f(org.telegram.ui.ActionBar.g6.l1(0.8f, iW0), org.telegram.ui.ActionBar.g6.l1(1.3f, iW0), org.telegram.ui.ActionBar.g6.l1(1.0f, iW0), org.telegram.ui.ActionBar.g6.l1(4.0f, iW0));
                    m4Var.v.f32710w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    m80Var.b(m4Var.v, f3Var);
                }
                View view = m4Var.f37291s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                dn dnVar = (dn) this.f40281g;
                dnVar.f37446a.f42211sb = ((MessageObject) this.f40279e).getId();
                rn rnVar = dnVar.f37446a;
                rnVar.f42224tb = 0;
                rnVar.f42237ub = null;
                ((org.telegram.ui.Cells.s1) this.f40280f).invalidate();
                break;
        }
    }

    public m0(dn dnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.f40281g = dnVar;
        this.f40279e = messageObject;
        this.f40280f = s1Var;
    }
}
