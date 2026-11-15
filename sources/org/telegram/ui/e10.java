package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class e10 extends v4.t0 {
    public final c40 f46511a;

    public e10(c40 c40Var) {
        this.f46511a = c40Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.cj0 cj0Var;
        c40 c40Var = this.f46511a;
        k30 k30Var = c40Var.L1;
        if (i7 == 0) {
            int L = org.telegram.messenger.g0.L(74.0f);
            k30Var.getChildAt(0);
            if ((c40Var.f45964t2 - L) + c40Var.f29716t0 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && k30Var.canScrollVertically(1) && (cj0Var = (org.telegram.ui.Components.cj0) k30Var.K(0)) != null) {
                View view = cj0Var.f58535a;
                if (view.getTop() > 0) {
                    k30Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.b30 b30Var = c40Var.f45912h2;
        if (b30Var != null) {
            b30Var.a();
        }
        org.telegram.ui.Components.b30 b30Var2 = c40Var.f45916i2;
        if (b30Var2 != null) {
            b30Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        c40 c40Var = this.f46511a;
        if (c40Var.L1.getChildCount() > 0 && (r3Var = c40Var.V2) != null) {
            if (!r3Var.f26233u && !r3Var.f26232t && c40Var.T1.N0() > c40Var.K1.G - 5) {
                c40Var.V2.k(false);
            }
            c40.P0(c40Var);
            r30 r30Var = c40Var.P2;
            if (r30Var != null) {
                r30Var.invalidate();
            }
            c40Var.f29682b.invalidate();
        }
    }
}
