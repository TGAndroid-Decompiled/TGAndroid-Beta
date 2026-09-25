package org.telegram.ui;

import java.util.ArrayList;
public final class l51 extends g.p {
    public final int f35226c;
    public final a71 d;

    public l51(a71 a71Var, int i10) {
        this.f35226c = i10;
        this.d = a71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f35226c) {
            case 0:
                a71 a71Var = this.d;
                if (a71Var.f32060w0.indexOfKey(i10) < 0 && a71Var.f32068z0.indexOfKey(i10) < 0 && i10 != a71Var.f32023f && i10 != a71Var.f32065y && i10 != a71Var.f32038n && i10 != a71Var.h && i10 != a71Var.v && i10 != a71Var.f32010a && i10 != a71Var.f32062x) {
                    if ((i10 >= a71Var.E && i10 < a71Var.F) || a71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return a71Var.f32048r0.J;
            default:
                a71 a71Var2 = this.d;
                k61 k61Var = a71Var2.f32045q0;
                int j3 = k61Var.j(i10);
                if (j3 == 6) {
                    return a71Var2.f32048r0.J;
                }
                if (j3 != 5) {
                    a71 a71Var3 = k61Var.f34955s;
                    if (a71Var3.W != 14 ? i10 <= (i11 = k61Var.f34951c) || (i10 - i11) - 1 >= a71Var3.C1.size() : (arrayList = a71Var3.B1) == null || i10 < (i12 = k61Var.f34951c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
