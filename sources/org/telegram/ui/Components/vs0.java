package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class vs0 extends s4.s0 {
    public final ms0 f32421a;
    public final ns0 f32422b;
    public final qv0 f32423c;

    public vs0(qv0 qv0Var, ms0 ms0Var, ns0 ns0Var) {
        this.f32423c = qv0Var;
        this.f32421a = ms0Var;
        this.f32422b = ns0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32423c.f30217b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        qv0 qv0Var = this.f32423c;
        fv0[] fv0VarArr = qv0Var.f30259t1;
        ns0 ns0Var = this.f32422b;
        ms0 ms0Var = this.f32421a;
        qv0Var.G(ms0Var, (zl0) recyclerView, ns0Var);
        if (i11 != 0 && ((i13 = qv0Var.f30239k0[0].F) == 0 || i13 == 5)) {
            fv0VarArr[0].f26591a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ms0Var.F) == 0 || qv0.p0(i12))) {
            qv0.q(ms0Var, fv0VarArr, true);
        }
        ms0Var.h.M0(true);
        if (ms0Var.G != null) {
            ms0Var.invalidate();
        }
        qv0Var.o0();
    }
}
