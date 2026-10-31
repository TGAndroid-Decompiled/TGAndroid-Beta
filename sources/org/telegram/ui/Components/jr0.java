package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jr0 extends s4.s0 {
    public final ar0 f27478a;
    public final br0 f27479b;
    public final zt0 f27480c;

    public jr0(zt0 zt0Var, ar0 ar0Var, br0 br0Var) {
        this.f27480c = zt0Var;
        this.f27478a = ar0Var;
        this.f27479b = br0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27480c.f33181d1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        zt0 zt0Var = this.f27480c;
        ot0[] ot0VarArr = zt0Var.f33234v1;
        br0 br0Var = this.f27479b;
        ar0 ar0Var = this.f27478a;
        zt0Var.N(ar0Var, (tk0) recyclerView, br0Var);
        if (i11 != 0 && ((i13 = zt0Var.m0[0].E) == 0 || i13 == 5)) {
            ot0VarArr[0].f29177a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ar0Var.E) == 0 || zt0.x0(i12))) {
            zt0.p(ar0Var, ot0VarArr, true);
        }
        ar0Var.h.L0(true);
        if (ar0Var.F != null) {
            ar0Var.invalidate();
        }
    }
}
