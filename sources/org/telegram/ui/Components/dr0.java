package org.telegram.ui.Components;

public final class dr0 extends f2.w {

    public final br0 f27836c;
    public final hu0 d;

    public dr0(hu0 hu0Var, br0 br0Var) {
        this.d = hu0Var;
        this.f27836c = br0Var;
    }

    @Override
    public final int i(int i10) {
        hu0 hu0Var = this.d;
        int[] iArr = hu0Var.f29127i1;
        us0 us0Var = hu0Var.K;
        br0 br0Var = this.f27836c;
        int i11 = iArr[hu0.p0(br0Var.B) ? 1 : 0];
        f2.q0 adapter = br0Var.h.getAdapter();
        ls0 ls0Var = hu0Var.D;
        if (adapter == ls0Var) {
            if (ls0Var.j(i10) != 2) {
                i11 = 1;
            }
        } else if (hu0.u(hu0Var, br0Var.h.getAdapter()) != -1) {
            if (br0Var.h.getAdapter().j(i10) != 2) {
                i11 = 1;
            }
        } else if (br0Var.h.getAdapter() != us0Var) {
            i11 = br0Var.f35343x.J;
        } else if (br0Var.h.getAdapter() == us0Var && hu0Var.f29140p1[5].f34325a.isEmpty()) {
            i11 = br0Var.f35343x.J;
        } else {
            cr0 cr0Var = br0Var.f35343x;
            cr0Var.B1();
            i11 = cr0Var.R.get(i10);
        }
        return Math.min(i11, br0Var.f35343x.J);
    }
}
