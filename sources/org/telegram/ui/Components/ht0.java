package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ht0 extends s4.t0 {
    public final ys0 f27147a;
    public final zs0 f27148b;
    public final cw0 f27149c;

    public ht0(cw0 cw0Var, ys0 ys0Var, zs0 zs0Var) {
        this.f27149c = cw0Var;
        this.f27147a = ys0Var;
        this.f27148b = zs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27149c.f25428b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        cw0 cw0Var = this.f27149c;
        rv0[] rv0VarArr = cw0Var.f25470t1;
        zs0 zs0Var = this.f27148b;
        ys0 ys0Var = this.f27147a;
        cw0Var.G(ys0Var, (rm0) recyclerView, zs0Var);
        if (i11 != 0 && ((i13 = cw0Var.f25450k0[0].F) == 0 || i13 == 5)) {
            rv0VarArr[0].f30578a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ys0Var.F) == 0 || cw0.p0(i12))) {
            cw0.q(ys0Var, rv0VarArr, true);
        }
        ys0Var.h.L0(true);
        if (ys0Var.G != null) {
            ys0Var.invalidate();
        }
        cw0Var.o0();
    }
}
