package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class xs0 extends s4.r0 {
    public final os0 f32445a;
    public final ps0 f32446b;
    public final sv0 f32447c;

    public xs0(sv0 sv0Var, os0 os0Var, ps0 ps0Var) {
        this.f32447c = sv0Var;
        this.f32445a = os0Var;
        this.f32446b = ps0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32447c.f30343b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        sv0 sv0Var = this.f32447c;
        hv0[] hv0VarArr = sv0Var.f30384t1;
        ps0 ps0Var = this.f32446b;
        os0 os0Var = this.f32445a;
        sv0Var.G(os0Var, (im0) recyclerView, ps0Var);
        if (i11 != 0 && ((i13 = sv0Var.f30364k0[0].F) == 0 || i13 == 5)) {
            hv0VarArr[0].f26942a.isEmpty();
        }
        if (i11 != 0 && ((i12 = os0Var.F) == 0 || sv0.q0(i12))) {
            sv0.r(os0Var, hv0VarArr, true);
        }
        os0Var.h.L0(true);
        if (os0Var.G != null) {
            os0Var.invalidate();
        }
        sv0Var.p0();
    }
}
