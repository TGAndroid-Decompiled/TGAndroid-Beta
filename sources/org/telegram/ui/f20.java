package org.telegram.ui;
public final class f20 extends g.o {
    public final b50 f37160c;

    public f20(b50 b50Var) {
        this.f37160c = b50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        v40 v40Var;
        int i12;
        int i13;
        int i14;
        if (b50.f35991w5) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!b50.f35992x5 && i10 >= (i12 = (v40Var = this.f37160c.G1).G) && i10 < (i13 = v40Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (b50.f35991w5 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (b50.f35991w5) {
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
