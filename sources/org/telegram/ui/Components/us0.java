package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class us0 extends s4.s0 {
    public final ls0 f31445a;
    public final ms0 f31446b;
    public final pv0 f31447c;

    public us0(pv0 pv0Var, ls0 ls0Var, ms0 ms0Var) {
        this.f31447c = pv0Var;
        this.f31445a = ls0Var;
        this.f31446b = ms0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31447c.f29760b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        pv0 pv0Var = this.f31447c;
        ev0[] ev0VarArr = pv0Var.f29802t1;
        ms0 ms0Var = this.f31446b;
        ls0 ls0Var = this.f31445a;
        pv0Var.G(ls0Var, (zl0) recyclerView, ms0Var);
        if (i11 != 0 && ((i13 = pv0Var.f29782k0[0].F) == 0 || i13 == 5)) {
            ev0VarArr[0].f26144a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ls0Var.F) == 0 || pv0.p0(i12))) {
            pv0.q(ls0Var, ev0VarArr, true);
        }
        ls0Var.h.M0(true);
        if (ls0Var.G != null) {
            ls0Var.invalidate();
        }
        pv0Var.o0();
    }
}
