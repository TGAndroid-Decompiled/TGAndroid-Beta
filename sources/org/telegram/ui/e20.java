package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class e20 extends s4.s0 {
    public final b50 f36896a;

    public e20(b50 b50Var) {
        this.f36896a = b50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Components.ck0 ck0Var;
        b50 b50Var = this.f36896a;
        i40 i40Var = b50Var.H1;
        if (i10 == 0) {
            int L = org.telegram.messenger.i0.L(74.0f);
            i40Var.getChildAt(0);
            if ((b50Var.f36060p2 - L) + b50Var.f21614s0 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && i40Var.canScrollVertically(1) && (ck0Var = (org.telegram.ui.Components.ck0) i40Var.K(0)) != null) {
                View view = ck0Var.f47898a;
                if (view.getTop() > 0) {
                    i40Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.q30 q30Var = b50Var.f36006d2;
        if (q30Var != null) {
            q30Var.b(true);
        }
        org.telegram.ui.Components.q30 q30Var2 = b50Var.f36010e2;
        if (q30Var2 != null) {
            q30Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.messenger.u3 u3Var;
        b50 b50Var = this.f36896a;
        if (b50Var.H1.getChildCount() > 0 && (u3Var = b50Var.R2) != null) {
            if (!u3Var.f18244u && !u3Var.f18243t && b50Var.P1.N0() > b50Var.G1.F - 5) {
                b50Var.R2.k(false);
            }
            b50.P0(b50Var);
            q40 q40Var = b50Var.L2;
            if (q40Var != null) {
                q40Var.invalidate();
            }
            b50Var.f21586b.invalidate();
        }
    }
}
