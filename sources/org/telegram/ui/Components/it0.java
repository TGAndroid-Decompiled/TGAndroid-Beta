package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class it0 extends s4.t0 {
    public final zs0 f27464a;
    public final at0 f27465b;
    public final dw0 f27466c;

    public it0(dw0 dw0Var, zs0 zs0Var, at0 at0Var) {
        this.f27466c = dw0Var;
        this.f27464a = zs0Var;
        this.f27465b = at0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27466c.f25689b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        dw0 dw0Var = this.f27466c;
        sv0[] sv0VarArr = dw0Var.f25731t1;
        at0 at0Var = this.f27465b;
        zs0 zs0Var = this.f27464a;
        dw0Var.G(zs0Var, (sm0) recyclerView, at0Var);
        if (i11 != 0 && ((i13 = dw0Var.f25711k0[0].F) == 0 || i13 == 5)) {
            sv0VarArr[0].f30867a.isEmpty();
        }
        if (i11 != 0 && ((i12 = zs0Var.F) == 0 || dw0.p0(i12))) {
            dw0.q(zs0Var, sv0VarArr, true);
        }
        zs0Var.h.L0(true);
        if (zs0Var.G != null) {
            zs0Var.invalidate();
        }
        dw0Var.o0();
    }
}
