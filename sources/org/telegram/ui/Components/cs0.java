package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class cs0 extends f2.z0 {
    public final tr0 f24025a;
    public final ur0 f24026b;
    public final yu0 f24027c;

    public cs0(yu0 yu0Var, tr0 tr0Var, ur0 ur0Var) {
        this.f24027c = yu0Var;
        this.f24025a = tr0Var;
        this.f24026b = ur0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f24027c.Y0 = z4;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        yu0 yu0Var = this.f24027c;
        nu0[] nu0VarArr = yu0Var.f31149q1;
        ur0 ur0Var = this.f24026b;
        tr0 tr0Var = this.f24025a;
        yu0Var.G(tr0Var, (rl0) recyclerView, ur0Var);
        if (i11 != 0 && ((i13 = yu0Var.f31131h0[0].C) == 0 || i13 == 5)) {
            nu0VarArr[0].f27368a.isEmpty();
        }
        if (i11 != 0 && ((i12 = tr0Var.C) == 0 || yu0.p0(i12))) {
            yu0.q(tr0Var, nu0VarArr, true);
        }
        tr0Var.h.K0(true);
        if (tr0Var.D != null) {
            tr0Var.invalidate();
        }
        yu0Var.o0();
    }
}
