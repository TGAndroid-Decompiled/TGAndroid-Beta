package org.telegram.ui;
public final class h30 extends g.p {
    public final i60 f34028c;

    public h30(i60 i60Var) {
        this.f34028c = i60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        c60 c60Var;
        int i12;
        int i13;
        int i14;
        if (i60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!i60.G3 && i10 >= (i12 = (c60Var = this.f34028c.P).G) && i10 < (i13 = c60Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (i60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (i60.F3) {
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
