package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class a10 extends u4.t0 {
    public final x30 f43558a;

    public a10(x30 x30Var) {
        this.f43558a = x30Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        org.telegram.ui.Components.bj0 bj0Var;
        x30 x30Var = this.f43558a;
        f30 f30Var = x30Var.I1;
        if (i3 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            f30Var.getChildAt(0);
            if ((x30Var.f51783q2 - L) + x30Var.f28617t0 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && f30Var.canScrollVertically(1) && (bj0Var = (org.telegram.ui.Components.bj0) f30Var.K(0)) != null) {
                View view = bj0Var.f55540a;
                if (view.getTop() > 0) {
                    f30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.u20 u20Var = x30Var.f51731e2;
        if (u20Var != null) {
            u20Var.a();
        }
        org.telegram.ui.Components.u20 u20Var2 = x30Var.f51735f2;
        if (u20Var2 != null) {
            u20Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.messenger.r3 r3Var;
        x30 x30Var = this.f43558a;
        if (x30Var.I1.getChildCount() > 0 && (r3Var = x30Var.S2) != null) {
            if (!r3Var.f25066u && !r3Var.f25065t && x30Var.Q1.N0() > x30Var.H1.G - 5) {
                x30Var.S2.k(false);
            }
            x30.P0(x30Var);
            m30 m30Var = x30Var.M2;
            if (m30Var != null) {
                m30Var.invalidate();
            }
            x30Var.f28586b.invalidate();
        }
    }
}
