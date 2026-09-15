package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ds0 extends s4.s0 {
    public final ur0 f23392a;
    public final vr0 f23393b;
    public final yu0 f23394c;

    public ds0(yu0 yu0Var, ur0 ur0Var, vr0 vr0Var) {
        this.f23394c = yu0Var;
        this.f23392a = ur0Var;
        this.f23393b = vr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23394c.f30347b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        yu0 yu0Var = this.f23394c;
        nu0[] nu0VarArr = yu0Var.f30388t1;
        vr0 vr0Var = this.f23393b;
        ur0 ur0Var = this.f23392a;
        yu0Var.G(ur0Var, (ll0) recyclerView, vr0Var);
        if (i11 != 0 && ((i13 = yu0Var.f30368k0[0].F) == 0 || i13 == 5)) {
            nu0VarArr[0].f26576a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ur0Var.F) == 0 || yu0.p0(i12))) {
            yu0.q(ur0Var, nu0VarArr, true);
        }
        ur0Var.h.L0(true);
        if (ur0Var.G != null) {
            ur0Var.invalidate();
        }
        yu0Var.o0();
    }
}
