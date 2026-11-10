package org.telegram.ui;

import java.util.ArrayList;
public final class g01 extends g.p {
    public final int f45901c;
    public final t11 d;

    public g01(t11 t11Var, int i7) {
        this.f45901c = i7;
        this.d = t11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f45901c) {
            case 0:
                t11 t11Var = this.d;
                if (t11Var.f50067w0.indexOfKey(i7) < 0 && t11Var.f50075z0.indexOfKey(i7) < 0 && i7 != t11Var.f50031f && i7 != t11Var.D && i7 != t11Var.f50046n && i7 != t11Var.h && i7 != t11Var.f50066w && i7 != t11Var.f50017a && i7 != t11Var.f50072y) {
                    if ((i7 >= t11Var.E && i7 < t11Var.F) || t11Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return t11Var.f50055r0.J;
            default:
                t11 t11Var2 = this.d;
                e11 e11Var = t11Var2.f50052q0;
                int d = e11Var.d(i7);
                if (d == 6) {
                    return t11Var2.f50055r0.J;
                }
                if (d != 5) {
                    t11 t11Var3 = e11Var.f45098s;
                    if (t11Var3.W != 14 ? i7 <= (i10 = e11Var.f45093c) || (i7 - i10) - 1 >= t11Var3.D1.size() : (arrayList = t11Var3.C1) == null || i7 < (i11 = e11Var.f45093c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
