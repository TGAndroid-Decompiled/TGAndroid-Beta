package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class e10 extends v4.s0 {
    public final c40 f45173a;

    public e10(c40 c40Var) {
        this.f45173a = c40Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.xi0 xi0Var;
        c40 c40Var = this.f45173a;
        k30 k30Var = c40Var.H1;
        if (i7 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            k30Var.getChildAt(0);
            if ((c40Var.f44608p2 - L) + c40Var.f28645s0 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && k30Var.canScrollVertically(1) && (xi0Var = (org.telegram.ui.Components.xi0) k30Var.K(0)) != null) {
                View view = xi0Var.f56951a;
                if (view.getTop() > 0) {
                    k30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.y20 y20Var = c40Var.d2;
        if (y20Var != null) {
            y20Var.a();
        }
        org.telegram.ui.Components.y20 y20Var2 = c40Var.f44560e2;
        if (y20Var2 != null) {
            y20Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        c40 c40Var = this.f45173a;
        if (c40Var.H1.getChildCount() > 0 && (r3Var = c40Var.R2) != null) {
            if (!r3Var.f25226u && !r3Var.f25225t && c40Var.P1.N0() > c40Var.G1.F - 5) {
                c40Var.R2.k(false);
            }
            c40.P0(c40Var);
            r30 r30Var = c40Var.L2;
            if (r30Var != null) {
                r30Var.invalidate();
            }
            c40Var.f28616b.invalidate();
        }
    }
}
