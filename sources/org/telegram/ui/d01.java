package org.telegram.ui;

import java.util.ArrayList;
public final class d01 extends g.p {
    public final int f46925c;
    public final q11 d;

    public d01(q11 q11Var, int i7) {
        this.f46925c = i7;
        this.d = q11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f46925c) {
            case 0:
                q11 q11Var = this.d;
                if (q11Var.f51279x0.indexOfKey(i7) < 0 && q11Var.A0.indexOfKey(i7) < 0 && i7 != q11Var.f51240f && i7 != q11Var.E && i7 != q11Var.f51255n && i7 != q11Var.h && i7 != q11Var.f51275w && i7 != q11Var.f51225a && i7 != q11Var.f51281y) {
                    if ((i7 >= q11Var.F && i7 < q11Var.G) || q11Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return q11Var.f51267s0.J;
            default:
                q11 q11Var2 = this.d;
                b11 b11Var = q11Var2.f51264r0;
                int d = b11Var.d(i7);
                if (d == 6) {
                    return q11Var2.f51267s0.J;
                }
                if (d != 5) {
                    q11 q11Var3 = b11Var.f45883s;
                    if (q11Var3.f51226a0 != 14 ? i7 <= (i10 = b11Var.f45878c) || (i7 - i10) - 1 >= q11Var3.E1.size() : (arrayList = q11Var3.D1) == null || i7 < (i11 = b11Var.f45878c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
