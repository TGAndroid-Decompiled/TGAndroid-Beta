package org.telegram.ui;

import java.util.ArrayList;
public final class f01 extends g.p {
    public final int f47448c;
    public final s11 d;

    public f01(s11 s11Var, int i7) {
        this.f47448c = i7;
        this.d = s11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f47448c) {
            case 0:
                s11 s11Var = this.d;
                if (s11Var.f51876x0.indexOfKey(i7) < 0 && s11Var.A0.indexOfKey(i7) < 0 && i7 != s11Var.f51837f && i7 != s11Var.E && i7 != s11Var.f51852n && i7 != s11Var.h && i7 != s11Var.f51872w && i7 != s11Var.f51822a && i7 != s11Var.f51878y) {
                    if ((i7 >= s11Var.F && i7 < s11Var.G) || s11Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return s11Var.f51864s0.J;
            default:
                s11 s11Var2 = this.d;
                d11 d11Var = s11Var2.f51861r0;
                int d = d11Var.d(i7);
                if (d == 6) {
                    return s11Var2.f51864s0.J;
                }
                if (d != 5) {
                    s11 s11Var3 = d11Var.f46860s;
                    if (s11Var3.f51823a0 != 14 ? i7 <= (i10 = d11Var.f46855c) || (i7 - i10) - 1 >= s11Var3.E1.size() : (arrayList = s11Var3.D1) == null || i7 < (i11 = d11Var.f46855c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
