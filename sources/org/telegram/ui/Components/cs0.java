package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class cs0 extends s4.s0 {
    public final tr0 f25088a;
    public final ur0 f25089b;
    public final xu0 f25090c;

    public cs0(xu0 xu0Var, tr0 tr0Var, ur0 ur0Var) {
        this.f25090c = xu0Var;
        this.f25088a = tr0Var;
        this.f25089b = ur0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25090c.f32681b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        xu0 xu0Var = this.f25090c;
        mu0[] mu0VarArr = xu0Var.f32723t1;
        ur0 ur0Var = this.f25089b;
        tr0 tr0Var = this.f25088a;
        xu0Var.G(tr0Var, (ll0) recyclerView, ur0Var);
        if (i11 != 0 && ((i13 = xu0Var.f32703k0[0].F) == 0 || i13 == 5)) {
            mu0VarArr[0].f28517a.isEmpty();
        }
        if (i11 != 0 && ((i12 = tr0Var.F) == 0 || xu0.p0(i12))) {
            xu0.q(tr0Var, mu0VarArr, true);
        }
        tr0Var.h.K0(true);
        if (tr0Var.G != null) {
            tr0Var.invalidate();
        }
        xu0Var.o0();
    }
}
