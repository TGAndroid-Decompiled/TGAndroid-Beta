package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g10 extends v4.s0 {
    public final e40 f45840a;

    public g10(e40 e40Var) {
        this.f45840a = e40Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.yi0 yi0Var;
        e40 e40Var = this.f45840a;
        m30 m30Var = e40Var.H1;
        if (i7 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            m30Var.getChildAt(0);
            if ((e40Var.f45251p2 - L) + e40Var.f28653s0 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && m30Var.canScrollVertically(1) && (yi0Var = (org.telegram.ui.Components.yi0) m30Var.K(0)) != null) {
                View view = yi0Var.f57056a;
                if (view.getTop() > 0) {
                    m30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.z20 z20Var = e40Var.d2;
        if (z20Var != null) {
            z20Var.a();
        }
        org.telegram.ui.Components.z20 z20Var2 = e40Var.f45203e2;
        if (z20Var2 != null) {
            z20Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        e40 e40Var = this.f45840a;
        if (e40Var.H1.getChildCount() > 0 && (r3Var = e40Var.R2) != null) {
            if (!r3Var.f25239u && !r3Var.f25238t && e40Var.P1.N0() > e40Var.G1.F - 5) {
                e40Var.R2.k(false);
            }
            e40.P0(e40Var);
            t30 t30Var = e40Var.L2;
            if (t30Var != null) {
                t30Var.invalidate();
            }
            e40Var.f28624b.invalidate();
        }
    }
}
