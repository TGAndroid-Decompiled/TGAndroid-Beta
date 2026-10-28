package org.telegram.ui;

import java.util.ArrayList;
public final class q41 extends g.o {
    public final int f42614c;
    public final f61 d;

    public q41(f61 f61Var, int i10) {
        this.f42614c = i10;
        this.d = f61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f42614c) {
            case 0:
                f61 f61Var = this.d;
                if (f61Var.f39234w0.indexOfKey(i10) < 0 && f61Var.f39242z0.indexOfKey(i10) < 0 && i10 != f61Var.f39197f && i10 != f61Var.f39239y && i10 != f61Var.f39212n && i10 != f61Var.h && i10 != f61Var.v && i10 != f61Var.f39184a && i10 != f61Var.f39236x) {
                    if ((i10 >= f61Var.E && i10 < f61Var.F) || f61Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return f61Var.f39222r0.J;
            default:
                f61 f61Var2 = this.d;
                p51 p51Var = f61Var2.f39219q0;
                int j10 = p51Var.j(i10);
                if (j10 == 6) {
                    return f61Var2.f39222r0.J;
                }
                if (j10 != 5) {
                    f61 f61Var3 = p51Var.f42312s;
                    if (f61Var3.W != 14 ? i10 <= (i11 = p51Var.f42308c) || (i10 - i11) - 1 >= f61Var3.D1.size() : (arrayList = f61Var3.C1) == null || i10 < (i12 = p51Var.f42308c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
