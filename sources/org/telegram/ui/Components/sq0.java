package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class sq0 extends v4.u0 {
    public final iq0 f39826a;
    public final jq0 f39827b;
    public final gt0 f39828c;

    public sq0(gt0 gt0Var, iq0 iq0Var, jq0 jq0Var) {
        this.f39828c = gt0Var;
        this.f39826a = iq0Var;
        this.f39827b = jq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39828c.f35583e1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        gt0 gt0Var = this.f39828c;
        vs0[] vs0VarArr = gt0Var.f35636w1;
        jq0 jq0Var = this.f39827b;
        iq0 iq0Var = this.f39826a;
        gt0Var.O(iq0Var, (ck0) recyclerView, jq0Var);
        if (i10 != 0 && ((i12 = gt0Var.f35609n0[0].F) == 0 || i12 == 5)) {
            vs0VarArr[0].f41412a.isEmpty();
        }
        if (i10 != 0 && ((i11 = iq0Var.F) == 0 || gt0.z0(i11))) {
            gt0.s(iq0Var, vs0VarArr, true);
        }
        iq0Var.h.L0(true);
        if (iq0Var.G != null) {
            iq0Var.invalidate();
        }
    }
}
