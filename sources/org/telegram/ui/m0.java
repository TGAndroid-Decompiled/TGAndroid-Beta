package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class m0 extends ye.c {
    public final int d = 1;
    public final Object f40333e;
    public final Object f40334f;
    public final Object f40335g;

    public m0(m4 m4Var, f3 f3Var, org.telegram.ui.Components.z80 z80Var) {
        this.f40333e = m4Var;
        this.f40334f = f3Var;
        this.f40335g = z80Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                m4 m4Var = (m4) this.f40333e;
                m4Var.f37381c.l(m4Var.v, true);
                View view = m4Var.f37386s;
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
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f40335g).f38212a, 9), 250L);
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
                org.telegram.ui.Components.z80 z80Var = (org.telegram.ui.Components.z80) this.f40335g;
                m4 m4Var = (m4) this.f40333e;
                org.telegram.ui.Components.v80 v80Var = m4Var.f37381c;
                f3 f3Var = (f3) this.f40334f;
                if (f3Var != null) {
                    view = f3Var.f37968b;
                } else {
                    view = null;
                }
                m4Var.f37386s = view;
                org.telegram.ui.Components.d01 d01Var = (org.telegram.ui.Components.d01) z80Var.f35285i;
                v80Var.l(m4Var.v, true);
                if (f3Var != null) {
                    m4Var.v = org.telegram.ui.Components.v80.i(f3Var.d, z80Var.f35285i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ld, false);
                    m4Var.v.f(org.telegram.ui.ActionBar.g6.l1(0.8f, w02), org.telegram.ui.ActionBar.g6.l1(1.3f, w02), org.telegram.ui.ActionBar.g6.l1(1.0f, w02), org.telegram.ui.ActionBar.g6.l1(4.0f, w02));
                    m4Var.v.f27399w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    v80Var.b(m4Var.v, f3Var);
                }
                View view2 = m4Var.f37386s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                fn fnVar = (fn) this.f40335g;
                fnVar.f38212a.f42971sb = ((MessageObject) this.f40333e).getId();
                tn tnVar = fnVar.f38212a;
                tnVar.f42984tb = 0;
                tnVar.f42997ub = null;
                ((org.telegram.ui.Cells.s1) this.f40334f).invalidate();
                return;
        }
    }

    public m0(fn fnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.f40335g = fnVar;
        this.f40333e = messageObject;
        this.f40334f = s1Var;
    }
}
