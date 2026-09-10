package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ms0 extends s4.s0 {
    public final ds0 f25281a;
    public final es0 f25282b;
    public final iv0 f25283c;

    public ms0(iv0 iv0Var, ds0 ds0Var, es0 es0Var) {
        this.f25283c = iv0Var;
        this.f25281a = ds0Var;
        this.f25282b = es0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25283c.f24086b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        iv0 iv0Var = this.f25283c;
        xu0[] xu0VarArr = iv0Var.f24127t1;
        es0 es0Var = this.f25282b;
        ds0 ds0Var = this.f25281a;
        iv0Var.G(ds0Var, (vl0) recyclerView, es0Var);
        if (i11 != 0 && ((i13 = iv0Var.f24107k0[0].F) == 0 || i13 == 5)) {
            xu0VarArr[0].f29156a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ds0Var.F) == 0 || iv0.p0(i12))) {
            iv0.q(ds0Var, xu0VarArr, true);
        }
        ds0Var.h.K0(true);
        if (ds0Var.G != null) {
            ds0Var.invalidate();
        }
        iv0Var.o0();
    }
}
