package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ai0 extends v4.t0 {
    public final v4.b0 f33494a;
    public final gi0 f33495b;

    public ai0(gi0 gi0Var, v4.b0 b0Var) {
        this.f33495b = gi0Var;
        this.f33494a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        gi0 gi0Var = this.f33495b;
        if (gi0Var.f35548x && gi0Var.f35549y && !gi0Var.f35547w) {
            int N0 = this.f33494a.N0();
            loadCount = gi0Var.getLoadCount();
            if (N0 >= (gi0Var.f35543f.b() - 1) - loadCount) {
                gi0Var.c();
            }
        }
    }
}
