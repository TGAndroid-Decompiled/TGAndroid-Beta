package org.telegram.ui;

import java.util.ArrayList;
public final class k41 extends g.o {
    public final int f38392c;
    public final z51 d;

    public k41(z51 z51Var, int i10) {
        this.f38392c = i10;
        this.d = z51Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f38392c) {
            case 0:
                z51 z51Var = this.d;
                if (z51Var.f43618w0.indexOfKey(i10) < 0 && z51Var.f43626z0.indexOfKey(i10) < 0 && i10 != z51Var.f43581f && i10 != z51Var.f43623y && i10 != z51Var.f43596n && i10 != z51Var.h && i10 != z51Var.v && i10 != z51Var.f43568a && i10 != z51Var.f43620x) {
                    if ((i10 >= z51Var.E && i10 < z51Var.F) || z51Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return z51Var.f43606r0.J;
            default:
                z51 z51Var2 = this.d;
                j51 j51Var = z51Var2.f43603q0;
                int j10 = j51Var.j(i10);
                if (j10 == 6) {
                    return z51Var2.f43606r0.J;
                }
                if (j10 != 5) {
                    z51 z51Var3 = j51Var.f38049s;
                    if (z51Var3.W != 14 ? i10 <= (i11 = j51Var.f38045c) || (i10 - i11) - 1 >= z51Var3.C1.size() : (arrayList = z51Var3.B1) == null || i10 < (i12 = j51Var.f38045c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
