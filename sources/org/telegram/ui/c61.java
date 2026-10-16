package org.telegram.ui;

import java.util.ArrayList;
public final class c61 extends g.o {
    public final int f34465c;
    public final r71 d;

    public c61(r71 r71Var, int i10) {
        this.f34465c = i10;
        this.d = r71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f34465c) {
            case 0:
                r71 r71Var = this.d;
                if (r71Var.f39362w0.indexOfKey(i10) < 0 && r71Var.f39370z0.indexOfKey(i10) < 0 && i10 != r71Var.f39325f && i10 != r71Var.f39367y && i10 != r71Var.f39340n && i10 != r71Var.h && i10 != r71Var.v && i10 != r71Var.f39312a && i10 != r71Var.f39364x) {
                    if ((i10 >= r71Var.E && i10 < r71Var.F) || r71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return r71Var.f39350r0.J;
            default:
                r71 r71Var2 = this.d;
                b71 b71Var = r71Var2.f39347q0;
                int j10 = b71Var.j(i10);
                if (j10 == 6) {
                    return r71Var2.f39350r0.J;
                }
                if (j10 != 5) {
                    r71 r71Var3 = b71Var.f34222s;
                    if (r71Var3.W != 14 ? i10 <= (i11 = b71Var.f34218c) || (i10 - i11) - 1 >= r71Var3.C1.size() : (arrayList = r71Var3.B1) == null || i10 < (i12 = b71Var.f34218c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
