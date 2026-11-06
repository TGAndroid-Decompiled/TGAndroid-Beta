package org.telegram.ui;

import java.util.ArrayList;
public final class d01 extends g.p {
    public final int f44928c;
    public final q11 d;

    public d01(q11 q11Var, int i7) {
        this.f44928c = i7;
        this.d = q11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f44928c) {
            case 0:
                q11 q11Var = this.d;
                if (q11Var.f49066w0.indexOfKey(i7) < 0 && q11Var.f49074z0.indexOfKey(i7) < 0 && i7 != q11Var.f49030f && i7 != q11Var.D && i7 != q11Var.f49045n && i7 != q11Var.h && i7 != q11Var.f49065w && i7 != q11Var.f49016a && i7 != q11Var.f49071y) {
                    if ((i7 >= q11Var.E && i7 < q11Var.F) || q11Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return q11Var.f49054r0.J;
            default:
                q11 q11Var2 = this.d;
                b11 b11Var = q11Var2.f49051q0;
                int d = b11Var.d(i7);
                if (d == 6) {
                    return q11Var2.f49054r0.J;
                }
                if (d != 5) {
                    q11 q11Var3 = b11Var.f44157s;
                    if (q11Var3.W != 14 ? i7 <= (i10 = b11Var.f44152c) || (i7 - i10) - 1 >= q11Var3.D1.size() : (arrayList = q11Var3.C1) == null || i7 < (i11 = b11Var.f44152c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
