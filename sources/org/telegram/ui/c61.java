package org.telegram.ui;

import java.util.ArrayList;
public final class c61 extends g.o {
    public final int f34743c;
    public final r71 d;

    public c61(r71 r71Var, int i10) {
        this.f34743c = i10;
        this.d = r71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f34743c) {
            case 0:
                r71 r71Var = this.d;
                if (r71Var.f39669w0.indexOfKey(i10) < 0 && r71Var.f39677z0.indexOfKey(i10) < 0 && i10 != r71Var.f39632f && i10 != r71Var.f39674y && i10 != r71Var.f39647n && i10 != r71Var.h && i10 != r71Var.v && i10 != r71Var.f39619a && i10 != r71Var.f39671x) {
                    if ((i10 >= r71Var.E && i10 < r71Var.F) || r71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return r71Var.f39657r0.J;
            default:
                r71 r71Var2 = this.d;
                b71 b71Var = r71Var2.f39654q0;
                int j10 = b71Var.j(i10);
                if (j10 == 6) {
                    return r71Var2.f39657r0.J;
                }
                if (j10 != 5) {
                    r71 r71Var3 = b71Var.f34438s;
                    if (r71Var3.W != 14 ? i10 <= (i11 = b71Var.f34434c) || (i10 - i11) - 1 >= r71Var3.C1.size() : (arrayList = r71Var3.B1) == null || i10 < (i12 = b71Var.f34434c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
