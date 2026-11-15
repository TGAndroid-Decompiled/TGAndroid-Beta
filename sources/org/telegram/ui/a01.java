package org.telegram.ui;

import java.util.ArrayList;
public final class a01 extends g.p {
    public final int f44896c;
    public final n11 d;

    public a01(n11 n11Var, int i7) {
        this.f44896c = i7;
        this.d = n11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f44896c) {
            case 0:
                n11 n11Var = this.d;
                if (n11Var.f49418x0.indexOfKey(i7) < 0 && n11Var.A0.indexOfKey(i7) < 0 && i7 != n11Var.f49379f && i7 != n11Var.E && i7 != n11Var.f49394n && i7 != n11Var.h && i7 != n11Var.f49414w && i7 != n11Var.f49364a && i7 != n11Var.f49420y) {
                    if ((i7 >= n11Var.F && i7 < n11Var.G) || n11Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return n11Var.f49406s0.J;
            default:
                n11 n11Var2 = this.d;
                y01 y01Var = n11Var2.f49403r0;
                int d = y01Var.d(i7);
                if (d == 6) {
                    return n11Var2.f49406s0.J;
                }
                if (d != 5) {
                    n11 n11Var3 = y01Var.f53371s;
                    if (n11Var3.f49365a0 != 14 ? i7 <= (i10 = y01Var.f53366c) || (i7 - i10) - 1 >= n11Var3.E1.size() : (arrayList = n11Var3.D1) == null || i7 < (i11 = y01Var.f53366c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
