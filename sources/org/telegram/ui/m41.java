package org.telegram.ui;

import java.util.ArrayList;
public final class m41 extends g.o {
    public final int f39374c;
    public final b61 d;

    public m41(b61 b61Var, int i10) {
        this.f39374c = i10;
        this.d = b61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f39374c) {
            case 0:
                b61 b61Var = this.d;
                if (b61Var.f35937w0.indexOfKey(i10) < 0 && b61Var.f35945z0.indexOfKey(i10) < 0 && i10 != b61Var.f35900f && i10 != b61Var.f35942y && i10 != b61Var.f35915n && i10 != b61Var.h && i10 != b61Var.v && i10 != b61Var.f35887a && i10 != b61Var.f35939x) {
                    if ((i10 >= b61Var.E && i10 < b61Var.F) || b61Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return b61Var.f35925r0.J;
            default:
                b61 b61Var2 = this.d;
                l51 l51Var = b61Var2.f35922q0;
                int j10 = l51Var.j(i10);
                if (j10 == 6) {
                    return b61Var2.f35925r0.J;
                }
                if (j10 != 5) {
                    b61 b61Var3 = l51Var.f39139s;
                    if (b61Var3.W != 14 ? i10 <= (i11 = l51Var.f39135c) || (i10 - i11) - 1 >= b61Var3.D1.size() : (arrayList = b61Var3.C1) == null || i10 < (i12 = l51Var.f39135c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
