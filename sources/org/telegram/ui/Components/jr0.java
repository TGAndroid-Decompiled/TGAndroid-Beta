package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jr0 extends f2.d1 {
    public final ar0 f29832a;
    public final br0 f29833b;
    public final eu0 f29834c;

    public jr0(eu0 eu0Var, ar0 ar0Var, br0 br0Var) {
        this.f29834c = eu0Var;
        this.f29832a = ar0Var;
        this.f29833b = br0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29834c.X0 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        int i12;
        eu0 eu0Var = this.f29834c;
        tt0[] tt0VarArr = eu0Var.f28155p1;
        br0 br0Var = this.f29833b;
        ar0 ar0Var = this.f29832a;
        eu0Var.G(ar0Var, (wk0) recyclerView, br0Var);
        if (i10 != 0 && ((i12 = eu0Var.f28137g0[0].B) == 0 || i12 == 5)) {
            tt0VarArr[0].f32788a.isEmpty();
        }
        if (i10 != 0 && ((i11 = ar0Var.B) == 0 || eu0.p0(i11))) {
            eu0.q(ar0Var, tt0VarArr, true);
        }
        ar0Var.h.K0(true);
        if (ar0Var.C != null) {
            ar0Var.invalidate();
        }
        eu0Var.o0();
    }
}
