package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class cs0 extends s4.s0 {
    public final tr0 f25115a;
    public final ur0 f25116b;
    public final xu0 f25117c;

    public cs0(xu0 xu0Var, tr0 tr0Var, ur0 ur0Var) {
        this.f25117c = xu0Var;
        this.f25115a = tr0Var;
        this.f25116b = ur0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25117c.f32708b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        xu0 xu0Var = this.f25117c;
        mu0[] mu0VarArr = xu0Var.f32750t1;
        ur0 ur0Var = this.f25116b;
        tr0 tr0Var = this.f25115a;
        xu0Var.G(tr0Var, (ll0) recyclerView, ur0Var);
        if (i11 != 0 && ((i13 = xu0Var.f32730k0[0].F) == 0 || i13 == 5)) {
            mu0VarArr[0].f28544a.isEmpty();
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
