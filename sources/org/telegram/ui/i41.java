package org.telegram.ui;

import java.util.ArrayList;
public final class i41 extends g.o {
    public final int f37846c;
    public final x51 d;

    public i41(x51 x51Var, int i10) {
        this.f37846c = i10;
        this.d = x51Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f37846c) {
            case 0:
                x51 x51Var = this.d;
                if (x51Var.f43087w0.indexOfKey(i10) < 0 && x51Var.f43095z0.indexOfKey(i10) < 0 && i10 != x51Var.f43050f && i10 != x51Var.f43092y && i10 != x51Var.f43065n && i10 != x51Var.h && i10 != x51Var.v && i10 != x51Var.f43037a && i10 != x51Var.f43089x) {
                    if ((i10 >= x51Var.E && i10 < x51Var.F) || x51Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return x51Var.f43075r0.J;
            default:
                x51 x51Var2 = this.d;
                h51 h51Var = x51Var2.f43072q0;
                int j10 = h51Var.j(i10);
                if (j10 == 6) {
                    return x51Var2.f43075r0.J;
                }
                if (j10 != 5) {
                    x51 x51Var3 = h51Var.f37494s;
                    if (x51Var3.W != 14 ? i10 <= (i11 = h51Var.f37490c) || (i10 - i11) - 1 >= x51Var3.C1.size() : (arrayList = x51Var3.B1) == null || i10 < (i12 = h51Var.f37490c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
