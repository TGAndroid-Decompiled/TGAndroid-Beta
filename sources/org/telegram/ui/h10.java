package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h10 extends v4.u0 {
    public final f40 f48205a;

    public h10(f40 f40Var) {
        this.f48205a = f40Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.mj0 mj0Var;
        f40 f40Var = this.f48205a;
        n30 n30Var = f40Var.L1;
        if (i7 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            n30Var.getChildAt(0);
            if ((f40Var.f47550t2 - L) + f40Var.f30210t0 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n30Var.canScrollVertically(1) && (mj0Var = (org.telegram.ui.Components.mj0) n30Var.K(0)) != null) {
                View view = mj0Var.f59165a;
                if (view.getTop() > 0) {
                    n30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.m30 m30Var = f40Var.f47498h2;
        if (m30Var != null) {
            m30Var.a();
        }
        org.telegram.ui.Components.m30 m30Var2 = f40Var.f47502i2;
        if (m30Var2 != null) {
            m30Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.t3 t3Var;
        f40 f40Var = this.f48205a;
        if (f40Var.L1.getChildCount() > 0 && (t3Var = f40Var.V2) != null) {
            if (!t3Var.f26967u && !t3Var.f26966t && f40Var.T1.N0() > f40Var.K1.G - 5) {
                f40Var.V2.k(false);
            }
            f40.Q0(f40Var);
            u30 u30Var = f40Var.P2;
            if (u30Var != null) {
                u30Var.invalidate();
            }
            f40Var.f30176b.invalidate();
        }
    }
}
