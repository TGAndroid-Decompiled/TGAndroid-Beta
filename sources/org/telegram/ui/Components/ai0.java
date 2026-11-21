package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ai0 extends v4.u0 {
    public final v4.c0 f33520a;
    public final gi0 f33521b;

    public ai0(gi0 gi0Var, v4.c0 c0Var) {
        this.f33521b = gi0Var;
        this.f33520a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        gi0 gi0Var = this.f33521b;
        if (gi0Var.f35570x && gi0Var.f35571y && !gi0Var.f35569w) {
            int N0 = this.f33520a.N0();
            loadCount = gi0Var.getLoadCount();
            if (N0 >= (gi0Var.f35565f.b() - 1) - loadCount) {
                gi0Var.c();
            }
        }
    }
}
