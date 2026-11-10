package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class i10 extends v4.s0 {
    public final f40 f46467a;

    public i10(f40 f40Var) {
        this.f46467a = f40Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.xi0 xi0Var;
        f40 f40Var = this.f46467a;
        n30 n30Var = f40Var.K1;
        if (i7 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            n30Var.getChildAt(0);
            if ((f40Var.f45579s2 - L) + f40Var.f28704s0 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && n30Var.canScrollVertically(1) && (xi0Var = (org.telegram.ui.Components.xi0) n30Var.K(0)) != null) {
                View view = xi0Var.f57052a;
                if (view.getTop() > 0) {
                    n30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.y20 y20Var = f40Var.f45527g2;
        if (y20Var != null) {
            y20Var.a();
        }
        org.telegram.ui.Components.y20 y20Var2 = f40Var.f45531h2;
        if (y20Var2 != null) {
            y20Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        f40 f40Var = this.f46467a;
        if (f40Var.K1.getChildCount() > 0 && (r3Var = f40Var.U2) != null) {
            if (!r3Var.f25243u && !r3Var.f25242t && f40Var.S1.N0() > f40Var.J1.F - 5) {
                f40Var.U2.k(false);
            }
            f40.P0(f40Var);
            u30 u30Var = f40Var.O2;
            if (u30Var != null) {
                u30Var.invalidate();
            }
            f40Var.f28672b.invalidate();
        }
    }
}
