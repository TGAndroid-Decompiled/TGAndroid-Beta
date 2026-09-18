package org.telegram.ui;
public final class j30 extends g.p {
    public final k60 f34772c;

    public j30(k60 k60Var) {
        this.f34772c = k60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        e60 e60Var;
        int i12;
        int i13;
        int i14;
        if (k60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!k60.G3 && i10 >= (i12 = (e60Var = this.f34772c.P).G) && i10 < (i13 = e60Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (k60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (k60.F3) {
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
