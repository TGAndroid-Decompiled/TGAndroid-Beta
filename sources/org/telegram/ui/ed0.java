package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ed0 extends s4.r0 {
    public final nd0 f35520a;

    public ed0(nd0 nd0Var) {
        this.f35520a = nd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nd0 nd0Var = this.f35520a;
        nd0Var.Q = z10;
        if (!z10 && nd0Var.L != null) {
            nd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nd0 nd0Var = this.f35520a;
        nd0Var.z0(false);
        if (nd0Var.L != null) {
            nd0Var.N += i11;
        }
    }
}
