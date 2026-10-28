package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends qf.c {
    public final int d = 1;
    public final Object e;
    public final Object f40298f;
    public final Object f40299g;

    public j0(j4 j4Var, a3 a3Var, org.telegram.ui.Components.ba0 ba0Var) {
        this.e = j4Var;
        this.f40298f = a3Var;
        this.f40299g = ba0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                j4 j4Var = (j4) this.e;
                j4Var.f40450c.l(j4Var.v, true);
                View view = j4Var.f40454s;
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
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f40299g).f39938a, 12), 250L);
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
                org.telegram.ui.Components.ba0 ba0Var = (org.telegram.ui.Components.ba0) this.f40299g;
                j4 j4Var = (j4) this.e;
                org.telegram.ui.Components.x90 x90Var = j4Var.f40450c;
                a3 a3Var = (a3) this.f40298f;
                if (a3Var != null) {
                    view = a3Var.f37661b;
                } else {
                    view = null;
                }
                j4Var.f40454s = view;
                org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) ba0Var.f26780i;
                x90Var.l(j4Var.v, true);
                if (a3Var != null) {
                    j4Var.v = org.telegram.ui.Components.x90.i(a3Var.d, ba0Var.f26780i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ld, false);
                    j4Var.v.g(org.telegram.ui.ActionBar.y6.o1(0.8f, x02), org.telegram.ui.ActionBar.y6.o1(1.3f, x02), org.telegram.ui.ActionBar.y6.o1(1.0f, x02), org.telegram.ui.ActionBar.y6.o1(4.0f, x02));
                    j4Var.v.f27805x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    x90Var.b(j4Var.v, a3Var);
                }
                View view2 = j4Var.f40454s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                hn hnVar = (hn) this.f40299g;
                hnVar.f39938a.Wb = ((MessageObject) this.e).getId();
                wn wnVar = hnVar.f39938a;
                wnVar.Xb = 0;
                wnVar.Yb = null;
                ((org.telegram.ui.Cells.s1) this.f40298f).invalidate();
                return;
        }
    }

    public j0(hn hnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.f40299g = hnVar;
        this.e = messageObject;
        this.f40298f = s1Var;
    }
}
