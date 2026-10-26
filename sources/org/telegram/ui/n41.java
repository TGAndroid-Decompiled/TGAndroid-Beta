package org.telegram.ui;

import java.util.ArrayList;
public final class n41 extends g.o {
    public final int f41756c;
    public final c61 d;

    public n41(c61 c61Var, int i10) {
        this.f41756c = i10;
        this.d = c61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f41756c) {
            case 0:
                c61 c61Var = this.d;
                if (c61Var.f38331w0.indexOfKey(i10) < 0 && c61Var.f38339z0.indexOfKey(i10) < 0 && i10 != c61Var.f38294f && i10 != c61Var.f38336y && i10 != c61Var.f38309n && i10 != c61Var.h && i10 != c61Var.v && i10 != c61Var.f38281a && i10 != c61Var.f38333x) {
                    if ((i10 >= c61Var.E && i10 < c61Var.F) || c61Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return c61Var.f38319r0.J;
            default:
                c61 c61Var2 = this.d;
                m51 m51Var = c61Var2.f38316q0;
                int j10 = m51Var.j(i10);
                if (j10 == 6) {
                    return c61Var2.f38319r0.J;
                }
                if (j10 != 5) {
                    c61 c61Var3 = m51Var.f41472s;
                    if (c61Var3.W != 14 ? i10 <= (i11 = m51Var.f41468c) || (i10 - i11) - 1 >= c61Var3.D1.size() : (arrayList = c61Var3.C1) == null || i10 < (i12 = m51Var.f41468c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
