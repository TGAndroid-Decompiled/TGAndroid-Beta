package org.telegram.ui;
public final class f10 extends g.p {
    public final c40 f46966c;

    public f10(c40 c40Var) {
        this.f46966c = c40Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        w30 w30Var;
        int i11;
        int i12;
        int i13;
        if (c40.E5) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (!c40.F5 && i7 >= (i11 = (w30Var = this.f46966c.K1).H) && i7 < (i12 = w30Var.I)) {
            int i14 = i12 - i11;
            if (i7 == i12 - 1 && (c40.E5 || i14 % 2 != 0)) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if (c40.E5) {
                if (i14 == 1) {
                    return 6;
                }
                if (i14 != 2) {
                    return 2;
                }
                return 3;
            }
            return i13;
        }
        return i10;
    }
}
