package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kq0 extends v4.t0 {
    public final aq0 f36587a;
    public final bq0 f36588b;
    public final ys0 f36589c;

    public kq0(ys0 ys0Var, aq0 aq0Var, bq0 bq0Var) {
        this.f36589c = ys0Var;
        this.f36587a = aq0Var;
        this.f36588b = bq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36589c.f42091e1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        ys0 ys0Var = this.f36589c;
        ns0[] ns0VarArr = ys0Var.f42144w1;
        bq0 bq0Var = this.f36588b;
        aq0 aq0Var = this.f36587a;
        ys0Var.O(aq0Var, (uj0) recyclerView, bq0Var);
        if (i10 != 0 && ((i12 = ys0Var.f42117n0[0].F) == 0 || i12 == 5)) {
            ns0VarArr[0].f37692a.isEmpty();
        }
        if (i10 != 0 && ((i11 = aq0Var.F) == 0 || ys0.z0(i11))) {
            ys0.s(aq0Var, ns0VarArr, true);
        }
        aq0Var.h.L0(true);
        if (aq0Var.G != null) {
            aq0Var.invalidate();
        }
    }
}
