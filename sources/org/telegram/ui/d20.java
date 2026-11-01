package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class d20 extends s4.s0 {
    public final a50 f36468a;

    public d20(a50 a50Var) {
        this.f36468a = a50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Components.dk0 dk0Var;
        a50 a50Var = this.f36468a;
        h40 h40Var = a50Var.H1;
        if (i10 == 0) {
            int L = org.telegram.messenger.i0.L(74.0f);
            h40Var.getChildAt(0);
            if ((a50Var.f35644p2 - L) + a50Var.f21615s0 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && h40Var.canScrollVertically(1) && (dk0Var = (org.telegram.ui.Components.dk0) h40Var.K(0)) != null) {
                View view = dk0Var.f47909a;
                if (view.getTop() > 0) {
                    h40Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.q30 q30Var = a50Var.f35590d2;
        if (q30Var != null) {
            q30Var.b(true);
        }
        org.telegram.ui.Components.q30 q30Var2 = a50Var.f35594e2;
        if (q30Var2 != null) {
            q30Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.messenger.u3 u3Var;
        a50 a50Var = this.f36468a;
        if (a50Var.H1.getChildCount() > 0 && (u3Var = a50Var.R2) != null) {
            if (!u3Var.f18377u && !u3Var.f18376t && a50Var.P1.N0() > a50Var.G1.F - 5) {
                a50Var.R2.k(false);
            }
            a50.P0(a50Var);
            p40 p40Var = a50Var.L2;
            if (p40Var != null) {
                p40Var.invalidate();
            }
            a50Var.f21587b.invalidate();
        }
    }
}
