package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kq0 extends v4.s0 {
    public final aq0 f35453a;
    public final bq0 f35454b;
    public final zs0 f35455c;

    public kq0(zs0 zs0Var, aq0 aq0Var, bq0 bq0Var) {
        this.f35455c = zs0Var;
        this.f35453a = aq0Var;
        this.f35454b = bq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f35455c.f41069d1 = z9;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        zs0 zs0Var = this.f35455c;
        os0[] os0VarArr = zs0Var.f41121v1;
        bq0 bq0Var = this.f35454b;
        aq0 aq0Var = this.f35453a;
        zs0Var.O(aq0Var, (qj0) recyclerView, bq0Var);
        if (i10 != 0 && ((i12 = zs0Var.m0[0].E) == 0 || i12 == 5)) {
            os0VarArr[0].f36778a.isEmpty();
        }
        if (i10 != 0 && ((i11 = aq0Var.E) == 0 || zs0.z0(i11))) {
            zs0.s(aq0Var, os0VarArr, true);
        }
        aq0Var.h.L0(true);
        if (aq0Var.F != null) {
            aq0Var.invalidate();
        }
    }
}
