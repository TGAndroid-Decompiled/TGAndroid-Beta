package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class us0 extends s4.s0 {
    public final ls0 f31438a;
    public final ms0 f31439b;
    public final pv0 f31440c;

    public us0(pv0 pv0Var, ls0 ls0Var, ms0 ms0Var) {
        this.f31440c = pv0Var;
        this.f31438a = ls0Var;
        this.f31439b = ms0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31440c.f29754b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        pv0 pv0Var = this.f31440c;
        ev0[] ev0VarArr = pv0Var.f29796t1;
        ms0 ms0Var = this.f31439b;
        ls0 ls0Var = this.f31438a;
        pv0Var.G(ls0Var, (zl0) recyclerView, ms0Var);
        if (i11 != 0 && ((i13 = pv0Var.f29776k0[0].F) == 0 || i13 == 5)) {
            ev0VarArr[0].f26138a.isEmpty();
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
