package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ai0 extends v4.u0 {
    public final v4.c0 f33480a;
    public final gi0 f33481b;

    public ai0(gi0 gi0Var, v4.c0 c0Var) {
        this.f33481b = gi0Var;
        this.f33480a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        gi0 gi0Var = this.f33481b;
        if (gi0Var.f35449x && gi0Var.f35450y && !gi0Var.f35448w) {
            int N0 = this.f33480a.N0();
            loadCount = gi0Var.getLoadCount();
            if (N0 >= (gi0Var.f35444f.b() - 1) - loadCount) {
                gi0Var.c();
            }
        }
    }
}
