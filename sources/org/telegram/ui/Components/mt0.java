package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class mt0 extends s4.t0 {
    public final dt0 f28660a;
    public final et0 f28661b;
    public final hw0 f28662c;

    public mt0(hw0 hw0Var, dt0 dt0Var, et0 et0Var) {
        this.f28662c = hw0Var;
        this.f28660a = dt0Var;
        this.f28661b = et0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28662c.f26926b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        hw0 hw0Var = this.f28662c;
        wv0[] wv0VarArr = hw0Var.f26968t1;
        et0 et0Var = this.f28661b;
        dt0 dt0Var = this.f28660a;
        hw0Var.G(dt0Var, (wm0) recyclerView, et0Var);
        if (i11 != 0 && ((i13 = hw0Var.f26948k0[0].F) == 0 || i13 == 5)) {
            wv0VarArr[0].f32553a.isEmpty();
        }
        if (i11 != 0 && ((i12 = dt0Var.F) == 0 || hw0.p0(i12))) {
            hw0.q(dt0Var, wv0VarArr, true);
        }
        dt0Var.h.L0(true);
        if (dt0Var.G != null) {
            dt0Var.invalidate();
        }
        hw0Var.o0();
    }
}
