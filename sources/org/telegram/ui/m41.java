package org.telegram.ui;

import java.util.ArrayList;

public final class m41 extends f2.w {

    public final int f40357c;
    public final a61 d;

    public m41(a61 a61Var, int i10) {
        this.f40357c = i10;
        this.d = a61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f40357c) {
            case 0:
                a61 a61Var = this.d;
                if (a61Var.f36425s0.indexOfKey(i10) >= 0 || a61Var.f36431v0.indexOfKey(i10) >= 0 || i10 == a61Var.f36397f || i10 == a61Var.f36439y || i10 == a61Var.f36412n || i10 == a61Var.h || i10 == a61Var.v || i10 == a61Var.f36383a || i10 == a61Var.f36436x) {
                    return a61Var.f36413n0.J;
                }
                return ((i10 < a61Var.A || i10 >= a61Var.B) && !a61Var.M) ? 5 : 8;
            default:
                a61 a61Var2 = this.d;
                k51 k51Var = a61Var2.m0;
                int iJ = k51Var.j(i10);
                if (iJ == 6) {
                    return a61Var2.f36413n0.J;
                }
                if (iJ != 5) {
                    a61 a61Var3 = k51Var.f39610s;
                    if (a61Var3.S != 14 ? i10 <= (i11 = k51Var.f39605c) || (i10 - i11) - 1 >= a61Var3.f36441y1.size() : (arrayList = a61Var3.f36438x1) == null || i10 < (i12 = k51Var.f39605c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
