package org.telegram.ui;

import java.util.ArrayList;
public final class p41 extends f2.v {
    public final int f41295c;
    public final d61 d;

    public p41(d61 d61Var, int i10) {
        this.f41295c = i10;
        this.d = d61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f41295c) {
            case 0:
                d61 d61Var = this.d;
                if (d61Var.f37359s0.indexOfKey(i10) < 0 && d61Var.f37365v0.indexOfKey(i10) < 0 && i10 != d61Var.f37331f && i10 != d61Var.f37373y && i10 != d61Var.f37346n && i10 != d61Var.h && i10 != d61Var.v && i10 != d61Var.f37317a && i10 != d61Var.f37370x) {
                    if ((i10 >= d61Var.A && i10 < d61Var.B) || d61Var.M) {
                        return 8;
                    }
                    return 5;
                }
                return d61Var.f37347n0.J;
            default:
                d61 d61Var2 = this.d;
                n51 n51Var = d61Var2.m0;
                int j10 = n51Var.j(i10);
                if (j10 == 6) {
                    return d61Var2.f37347n0.J;
                }
                if (j10 != 5) {
                    d61 d61Var3 = n51Var.f40723s;
                    if (d61Var3.S != 14 ? i10 <= (i11 = n51Var.f40718c) || (i10 - i11) - 1 >= d61Var3.f37375y1.size() : (arrayList = d61Var3.f37372x1) == null || i10 < (i12 = n51Var.f40718c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
