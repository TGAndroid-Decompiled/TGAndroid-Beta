package org.telegram.ui;
public final class c30 extends f2.v {
    public final c60 f33082c;

    public c30(c60 c60Var) {
        this.f33082c = c60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w50 w50Var;
        int i12;
        int i13;
        int i14;
        if (c60.C3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!c60.D3 && i10 >= (i12 = (w50Var = this.f33082c.M).D) && i10 < (i13 = w50Var.E)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (c60.C3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (c60.C3) {
                if (i15 == 1) {
                    return 6;
                }
                if (i15 != 2) {
                    return 2;
                }
                return 3;
            }
            return i14;
        }
        return i11;
    }
}
