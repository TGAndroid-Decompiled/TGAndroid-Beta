package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class iq0 extends u4.t0 {
    public final zp0 f34797a;
    public final aq0 f34798b;
    public final ws0 f34799c;

    public iq0(ws0 ws0Var, zp0 zp0Var, aq0 aq0Var) {
        this.f34799c = ws0Var;
        this.f34797a = zp0Var;
        this.f34798b = aq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        boolean z10;
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34799c.f40083e1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int i11;
        int i12;
        ws0 ws0Var = this.f34799c;
        ls0[] ls0VarArr = ws0Var.f40136w1;
        aq0 aq0Var = this.f34798b;
        zp0 zp0Var = this.f34797a;
        ws0Var.O(zp0Var, (tj0) recyclerView, aq0Var);
        if (i10 != 0 && ((i12 = ws0Var.f40108n0[0].F) == 0 || i12 == 5)) {
            ls0VarArr[0].f35854a.isEmpty();
        }
        if (i10 != 0 && ((i11 = zp0Var.F) == 0 || ws0.z0(i11))) {
            ws0.s(zp0Var, ls0VarArr, true);
        }
        zp0Var.h.L0(true);
        if (zp0Var.G != null) {
            zp0Var.invalidate();
        }
    }
}
