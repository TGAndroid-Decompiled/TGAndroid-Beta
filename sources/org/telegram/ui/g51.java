package org.telegram.ui;

import java.util.ArrayList;
public final class g51 extends f2.v {
    public final int f34328c;
    public final x61 d;

    public g51(x61 x61Var, int i10) {
        this.f34328c = i10;
        this.d = x61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f34328c) {
            case 0:
                x61 x61Var = this.d;
                if (x61Var.f39894t0.indexOfKey(i10) < 0 && x61Var.f39901w0.indexOfKey(i10) < 0 && i10 != x61Var.f39864f && i10 != x61Var.f39906y && i10 != x61Var.f39879n && i10 != x61Var.h && i10 != x61Var.v && i10 != x61Var.f39851a && i10 != x61Var.f39903x) {
                    if ((i10 >= x61Var.B && i10 < x61Var.C) || x61Var.N) {
                        return 8;
                    }
                    return 5;
                }
                return x61Var.f39882o0.J;
            default:
                x61 x61Var2 = this.d;
                g61 g61Var = x61Var2.f39880n0;
                int j10 = g61Var.j(i10);
                if (j10 == 6) {
                    return x61Var2.f39882o0.J;
                }
                if (j10 != 5) {
                    x61 x61Var3 = g61Var.f34336s;
                    if (x61Var3.T != 14 ? i10 <= (i11 = g61Var.f34332c) || (i10 - i11) - 1 >= x61Var3.f39910z1.size() : (arrayList = x61Var3.f39908y1) == null || i10 < (i12 = g61Var.f34332c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
