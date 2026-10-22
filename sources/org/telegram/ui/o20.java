package org.telegram.ui;
public final class o20 extends g.o {
    public final q50 f39748c;

    public o20(q50 q50Var) {
        this.f39748c = q50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k50 k50Var;
        int i12;
        int i13;
        int i14;
        if (q50.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!q50.G3 && i10 >= (i12 = (k50Var = this.f39748c.P).G) && i10 < (i13 = k50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (q50.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (q50.F3) {
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
