package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class gt0 extends s4.t0 {
    public final xs0 f26879a;
    public final ys0 f26880b;
    public final bw0 f26881c;

    public gt0(bw0 bw0Var, xs0 xs0Var, ys0 ys0Var) {
        this.f26881c = bw0Var;
        this.f26879a = xs0Var;
        this.f26880b = ys0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26881c.f25120b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        bw0 bw0Var = this.f26881c;
        qv0[] qv0VarArr = bw0Var.f25162t1;
        ys0 ys0Var = this.f26880b;
        xs0 xs0Var = this.f26879a;
        bw0Var.G(xs0Var, (qm0) recyclerView, ys0Var);
        if (i11 != 0 && ((i13 = bw0Var.f25142k0[0].F) == 0 || i13 == 5)) {
            qv0VarArr[0].f30274a.isEmpty();
        }
        if (i11 != 0 && ((i12 = xs0Var.F) == 0 || bw0.p0(i12))) {
            bw0.q(xs0Var, qv0VarArr, true);
        }
        xs0Var.h.L0(true);
        if (xs0Var.G != null) {
            xs0Var.invalidate();
        }
        bw0Var.o0();
    }
}
