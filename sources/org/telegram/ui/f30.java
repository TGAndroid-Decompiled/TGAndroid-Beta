package org.telegram.ui;
public final class f30 extends g.o {
    public final g60 f37439c;

    public f30(g60 g60Var) {
        this.f37439c = g60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        a60 a60Var;
        int i12;
        int i13;
        int i14;
        if (g60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!g60.G3 && i10 >= (i12 = (a60Var = this.f37439c.P).G) && i10 < (i13 = a60Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (g60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (g60.F3) {
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
