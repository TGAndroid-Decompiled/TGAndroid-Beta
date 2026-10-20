package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class zs0 extends s4.r0 {
    public final qs0 f33036a;
    public final rs0 f33037b;
    public final uv0 f33038c;

    public zs0(uv0 uv0Var, qs0 qs0Var, rs0 rs0Var) {
        this.f33038c = uv0Var;
        this.f33036a = qs0Var;
        this.f33037b = rs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33038c.f31025b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        uv0 uv0Var = this.f33038c;
        jv0[] jv0VarArr = uv0Var.f31066t1;
        rs0 rs0Var = this.f33037b;
        qs0 qs0Var = this.f33036a;
        uv0Var.G(qs0Var, (jm0) recyclerView, rs0Var);
        if (i11 != 0 && ((i13 = uv0Var.f31046k0[0].F) == 0 || i13 == 5)) {
            jv0VarArr[0].f27641a.isEmpty();
        }
        if (i11 != 0 && ((i12 = qs0Var.F) == 0 || uv0.q0(i12))) {
            uv0.r(qs0Var, jv0VarArr, true);
        }
        qs0Var.h.L0(true);
        if (qs0Var.G != null) {
            qs0Var.invalidate();
        }
        uv0Var.p0();
    }
}
