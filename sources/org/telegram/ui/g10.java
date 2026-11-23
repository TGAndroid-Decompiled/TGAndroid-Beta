package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g10 extends v4.u0 {
    public final e40 f48021a;

    public g10(e40 e40Var) {
        this.f48021a = e40Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.mj0 mj0Var;
        e40 e40Var = this.f48021a;
        m30 m30Var = e40Var.L1;
        if (i7 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            m30Var.getChildAt(0);
            if ((e40Var.f47400t2 - L) + e40Var.f30260t0 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && m30Var.canScrollVertically(1) && (mj0Var = (org.telegram.ui.Components.mj0) m30Var.K(0)) != null) {
                View view = mj0Var.f59245a;
                if (view.getTop() > 0) {
                    m30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.j30 j30Var = e40Var.f47348h2;
        if (j30Var != null) {
            j30Var.a();
        }
        org.telegram.ui.Components.j30 j30Var2 = e40Var.f47352i2;
        if (j30Var2 != null) {
            j30Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.t3 t3Var;
        e40 e40Var = this.f48021a;
        if (e40Var.L1.getChildCount() > 0 && (t3Var = e40Var.V2) != null) {
            if (!t3Var.f27051u && !t3Var.f27050t && e40Var.T1.N0() > e40Var.K1.G - 5) {
                e40Var.V2.k(false);
            }
            e40.Q0(e40Var);
            t30 t30Var = e40Var.P2;
            if (t30Var != null) {
                t30Var.invalidate();
            }
            e40Var.f30226b.invalidate();
        }
    }
}
