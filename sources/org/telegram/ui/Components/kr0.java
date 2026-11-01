package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kr0 extends s4.s0 {
    public final br0 f27947a;
    public final cr0 f27948b;
    public final au0 f27949c;

    public kr0(au0 au0Var, br0 br0Var, cr0 cr0Var) {
        this.f27949c = au0Var;
        this.f27947a = br0Var;
        this.f27948b = cr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27949c.f24509d1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        au0 au0Var = this.f27949c;
        pt0[] pt0VarArr = au0Var.f24562v1;
        cr0 cr0Var = this.f27948b;
        br0 br0Var = this.f27947a;
        au0Var.N(br0Var, (uk0) recyclerView, cr0Var);
        if (i11 != 0 && ((i13 = au0Var.m0[0].E) == 0 || i13 == 5)) {
            pt0VarArr[0].f29532a.isEmpty();
        }
        if (i11 != 0 && ((i12 = br0Var.E) == 0 || au0.y0(i12))) {
            au0.p(br0Var, pt0VarArr, true);
        }
        br0Var.h.L0(true);
        if (br0Var.F != null) {
            br0Var.invalidate();
        }
    }
}
