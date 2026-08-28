package org.telegram.ui;

import java.util.ArrayList;
public final class n41 extends f2.x {
    public final int f40590c;
    public final b61 d;

    public n41(b61 b61Var, int i9) {
        this.f40590c = i9;
        this.d = b61Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f40590c) {
            case 0:
                b61 b61Var = this.d;
                if (b61Var.f36702s0.indexOfKey(i9) < 0 && b61Var.f36708v0.indexOfKey(i9) < 0 && i9 != b61Var.f36674f && i9 != b61Var.f36716y && i9 != b61Var.f36689n && i9 != b61Var.h && i9 != b61Var.v && i9 != b61Var.f36660a && i9 != b61Var.f36713x) {
                    if ((i9 >= b61Var.A && i9 < b61Var.B) || b61Var.M) {
                        return 8;
                    }
                    return 5;
                }
                return b61Var.f36690n0.J;
            default:
                b61 b61Var2 = this.d;
                l51 l51Var = b61Var2.m0;
                int j10 = l51Var.j(i9);
                if (j10 == 6) {
                    return b61Var2.f36690n0.J;
                }
                if (j10 != 5) {
                    b61 b61Var3 = l51Var.f40058s;
                    if (b61Var3.S != 14 ? i9 <= (i10 = l51Var.f40053c) || (i9 - i10) - 1 >= b61Var3.f36718y1.size() : (arrayList = b61Var3.f36715x1) == null || i9 < (i11 = l51Var.f40053c) || i9 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
