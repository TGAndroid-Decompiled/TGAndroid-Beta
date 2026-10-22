package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class zs0 extends s4.r0 {
    public final qs0 f33040a;
    public final rs0 f33041b;
    public final uv0 f33042c;

    public zs0(uv0 uv0Var, qs0 qs0Var, rs0 rs0Var) {
        this.f33042c = uv0Var;
        this.f33040a = qs0Var;
        this.f33041b = rs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33042c.f31029b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        uv0 uv0Var = this.f33042c;
        jv0[] jv0VarArr = uv0Var.f31070t1;
        rs0 rs0Var = this.f33041b;
        qs0 qs0Var = this.f33040a;
        uv0Var.G(qs0Var, (jm0) recyclerView, rs0Var);
        if (i11 != 0 && ((i13 = uv0Var.f31050k0[0].F) == 0 || i13 == 5)) {
            jv0VarArr[0].f27644a.isEmpty();
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
