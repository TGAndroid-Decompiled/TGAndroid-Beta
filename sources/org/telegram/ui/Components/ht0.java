package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ht0 extends s4.t0 {
    public final ys0 f27237a;
    public final zs0 f27238b;
    public final cw0 f27239c;

    public ht0(cw0 cw0Var, ys0 ys0Var, zs0 zs0Var) {
        this.f27239c = cw0Var;
        this.f27237a = ys0Var;
        this.f27238b = zs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27239c.f25490b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        cw0 cw0Var = this.f27239c;
        rv0[] rv0VarArr = cw0Var.f25532t1;
        zs0 zs0Var = this.f27238b;
        ys0 ys0Var = this.f27237a;
        cw0Var.G(ys0Var, (rm0) recyclerView, zs0Var);
        if (i11 != 0 && ((i13 = cw0Var.f25512k0[0].F) == 0 || i13 == 5)) {
            rv0VarArr[0].f30637a.isEmpty();
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
