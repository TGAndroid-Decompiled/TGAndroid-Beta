package org.telegram.ui;

import java.util.ArrayList;
public final class k51 extends g.p {
    public final int f34573c;
    public final z61 d;

    public k51(z61 z61Var, int i10) {
        this.f34573c = i10;
        this.d = z61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f34573c) {
            case 0:
                z61 z61Var = this.d;
                if (z61Var.f40053w0.indexOfKey(i10) < 0 && z61Var.f40061z0.indexOfKey(i10) < 0 && i10 != z61Var.f40016f && i10 != z61Var.f40058y && i10 != z61Var.f40031n && i10 != z61Var.h && i10 != z61Var.v && i10 != z61Var.f40003a && i10 != z61Var.f40055x) {
                    if ((i10 >= z61Var.E && i10 < z61Var.F) || z61Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return z61Var.f40041r0.J;
            default:
                z61 z61Var2 = this.d;
                j61 j61Var = z61Var2.f40038q0;
                int j3 = j61Var.j(i10);
                if (j3 == 6) {
                    return z61Var2.f40041r0.J;
                }
                if (j3 != 5) {
                    z61 z61Var3 = j61Var.f34344s;
                    if (z61Var3.W != 14 ? i10 <= (i11 = j61Var.f34340c) || (i10 - i11) - 1 >= z61Var3.C1.size() : (arrayList = z61Var3.B1) == null || i10 < (i12 = j61Var.f34340c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
