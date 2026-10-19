package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ys0 extends s4.r0 {
    public final ps0 f32745a;
    public final qs0 f32746b;
    public final tv0 f32747c;

    public ys0(tv0 tv0Var, ps0 ps0Var, qs0 qs0Var) {
        this.f32747c = tv0Var;
        this.f32745a = ps0Var;
        this.f32746b = qs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32747c.f30689b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        tv0 tv0Var = this.f32747c;
        iv0[] iv0VarArr = tv0Var.f30730t1;
        qs0 qs0Var = this.f32746b;
        ps0 ps0Var = this.f32745a;
        tv0Var.G(ps0Var, (im0) recyclerView, qs0Var);
        if (i11 != 0 && ((i13 = tv0Var.f30710k0[0].F) == 0 || i13 == 5)) {
            iv0VarArr[0].f27363a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ps0Var.F) == 0 || tv0.q0(i12))) {
            tv0.r(ps0Var, iv0VarArr, true);
        }
        ps0Var.h.L0(true);
        if (ps0Var.G != null) {
            ps0Var.invalidate();
        }
        tv0Var.p0();
    }
}
