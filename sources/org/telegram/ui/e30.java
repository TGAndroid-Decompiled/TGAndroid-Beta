package org.telegram.ui;
public final class e30 extends f2.v {
    public final e60 f33599c;

    public e30(e60 e60Var) {
        this.f33599c = e60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        y50 y50Var;
        int i12;
        int i13;
        int i14;
        if (e60.C3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!e60.D3 && i10 >= (i12 = (y50Var = this.f33599c.M).D) && i10 < (i13 = y50Var.E)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (e60.C3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (e60.C3) {
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
