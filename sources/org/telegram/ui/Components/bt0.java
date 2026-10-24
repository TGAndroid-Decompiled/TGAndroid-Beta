package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class bt0 extends s4.r0 {
    public final ss0 f25090a;
    public final ts0 f25091b;
    public final wv0 f25092c;

    public bt0(wv0 wv0Var, ss0 ss0Var, ts0 ts0Var) {
        this.f25092c = wv0Var;
        this.f25090a = ss0Var;
        this.f25091b = ts0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25092c.f32362b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        wv0 wv0Var = this.f25092c;
        lv0[] lv0VarArr = wv0Var.f32406t1;
        ts0 ts0Var = this.f25091b;
        ss0 ss0Var = this.f25090a;
        wv0Var.H(ss0Var, (lm0) recyclerView, ts0Var);
        if (i11 != 0 && ((i13 = wv0Var.f32386k0[0].F) == 0 || i13 == 5)) {
            lv0VarArr[0].f28439a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ss0Var.F) == 0 || wv0.r0(i12))) {
            wv0.r(ss0Var, lv0VarArr, true);
        }
        ss0Var.h.L0(true);
        if (ss0Var.G != null) {
            ss0Var.invalidate();
        }
        wv0Var.q0();
    }
}
