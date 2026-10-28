package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kt0 extends s4.u0 {
    public final bt0 f30027a;
    public final ct0 f30028b;
    public final bw0 f30029c;

    public kt0(bw0 bw0Var, bt0 bt0Var, ct0 ct0Var) {
        this.f30029c = bw0Var;
        this.f30027a = bt0Var;
        this.f30028b = ct0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30029c.f26936d1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        bw0 bw0Var = this.f30029c;
        qv0[] qv0VarArr = bw0Var.f26986v1;
        ct0 ct0Var = this.f30028b;
        bt0 bt0Var = this.f30027a;
        bw0Var.M(bt0Var, (nm0) recyclerView, ct0Var);
        if (i11 != 0 && ((i13 = bw0Var.m0[0].E) == 0 || i13 == 5)) {
            qv0VarArr[0].f32033a.isEmpty();
        }
        if (i11 != 0 && ((i12 = bt0Var.E) == 0 || bw0.w0(i12))) {
            bw0.t(bt0Var, qv0VarArr, true);
        }
        bt0Var.h.L0(true);
        if (bt0Var.F != null) {
            bt0Var.invalidate();
        }
    }
}
