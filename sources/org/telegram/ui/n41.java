package org.telegram.ui;

import java.util.ArrayList;
public final class n41 extends g.o {
    public final int f41753c;
    public final c61 d;

    public n41(c61 c61Var, int i10) {
        this.f41753c = i10;
        this.d = c61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f41753c) {
            case 0:
                c61 c61Var = this.d;
                if (c61Var.f38328w0.indexOfKey(i10) < 0 && c61Var.f38336z0.indexOfKey(i10) < 0 && i10 != c61Var.f38291f && i10 != c61Var.f38333y && i10 != c61Var.f38306n && i10 != c61Var.h && i10 != c61Var.v && i10 != c61Var.f38278a && i10 != c61Var.f38330x) {
                    if ((i10 >= c61Var.E && i10 < c61Var.F) || c61Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return c61Var.f38316r0.J;
            default:
                c61 c61Var2 = this.d;
                m51 m51Var = c61Var2.f38313q0;
                int j10 = m51Var.j(i10);
                if (j10 == 6) {
                    return c61Var2.f38316r0.J;
                }
                if (j10 != 5) {
                    c61 c61Var3 = m51Var.f41469s;
                    if (c61Var3.W != 14 ? i10 <= (i11 = m51Var.f41465c) || (i10 - i11) - 1 >= c61Var3.D1.size() : (arrayList = c61Var3.C1) == null || i10 < (i12 = m51Var.f41465c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
