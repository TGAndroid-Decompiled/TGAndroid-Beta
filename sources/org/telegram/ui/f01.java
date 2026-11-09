package org.telegram.ui;

import java.util.ArrayList;
public final class f01 extends g.p {
    public final int f45552c;
    public final s11 d;

    public f01(s11 s11Var, int i7) {
        this.f45552c = i7;
        this.d = s11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f45552c) {
            case 0:
                s11 s11Var = this.d;
                if (s11Var.f49711w0.indexOfKey(i7) < 0 && s11Var.f49719z0.indexOfKey(i7) < 0 && i7 != s11Var.f49675f && i7 != s11Var.D && i7 != s11Var.f49690n && i7 != s11Var.h && i7 != s11Var.f49710w && i7 != s11Var.f49661a && i7 != s11Var.f49716y) {
                    if ((i7 >= s11Var.E && i7 < s11Var.F) || s11Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return s11Var.f49699r0.J;
            default:
                s11 s11Var2 = this.d;
                d11 d11Var = s11Var2.f49696q0;
                int d = d11Var.d(i7);
                if (d == 6) {
                    return s11Var2.f49699r0.J;
                }
                if (d != 5) {
                    s11 s11Var3 = d11Var.f44800s;
                    if (s11Var3.W != 14 ? i7 <= (i10 = d11Var.f44795c) || (i7 - i10) - 1 >= s11Var3.D1.size() : (arrayList = s11Var3.C1) == null || i7 < (i11 = d11Var.f44795c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
