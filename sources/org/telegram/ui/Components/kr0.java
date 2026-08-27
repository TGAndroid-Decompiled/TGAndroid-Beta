package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

public final class kr0 extends f2.b1 {

    public final br0 f30171a;

    public final cr0 f30172b;

    public final hu0 f30173c;

    public kr0(hu0 hu0Var, br0 br0Var, cr0 cr0Var) {
        this.f30173c = hu0Var;
        this.f30171a = br0Var;
        this.f30172b = cr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        this.f30173c.X0 = i10 != 0;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        hu0 hu0Var = this.f30173c;
        wt0[] wt0VarArr = hu0Var.f29140p1;
        cr0 cr0Var = this.f30172b;
        br0 br0Var = this.f30171a;
        hu0Var.G(br0Var, (zk0) recyclerView, cr0Var);
        if (i11 != 0 && ((i13 = hu0Var.f29122g0[0].B) == 0 || i13 == 5)) {
            wt0VarArr[0].f34325a.isEmpty();
        }
        if (i11 != 0 && ((i12 = br0Var.B) == 0 || hu0.p0(i12))) {
            hu0.q(br0Var, wt0VarArr, true);
        }
        br0Var.h.K0(true);
        if (br0Var.C != null) {
            br0Var.invalidate();
        }
        hu0Var.o0();
    }
}
