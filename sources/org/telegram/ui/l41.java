package org.telegram.ui;

import java.util.ArrayList;
public final class l41 extends g.o {
    public final int f39115c;
    public final a61 d;

    public l41(a61 a61Var, int i10) {
        this.f39115c = i10;
        this.d = a61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f39115c) {
            case 0:
                a61 a61Var = this.d;
                if (a61Var.f35654w0.indexOfKey(i10) < 0 && a61Var.f35662z0.indexOfKey(i10) < 0 && i10 != a61Var.f35617f && i10 != a61Var.f35659y && i10 != a61Var.f35632n && i10 != a61Var.h && i10 != a61Var.v && i10 != a61Var.f35604a && i10 != a61Var.f35656x) {
                    if ((i10 >= a61Var.E && i10 < a61Var.F) || a61Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return a61Var.f35642r0.J;
            default:
                a61 a61Var2 = this.d;
                k51 k51Var = a61Var2.f35639q0;
                int j10 = k51Var.j(i10);
                if (j10 == 6) {
                    return a61Var2.f35642r0.J;
                }
                if (j10 != 5) {
                    a61 a61Var3 = k51Var.f38799s;
                    if (a61Var3.W != 14 ? i10 <= (i11 = k51Var.f38795c) || (i10 - i11) - 1 >= a61Var3.D1.size() : (arrayList = a61Var3.C1) == null || i10 < (i12 = k51Var.f38795c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
