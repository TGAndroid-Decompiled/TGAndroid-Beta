package org.telegram.ui;
public final class c30 extends g.p {
    public final d60 f32538c;

    public c30(d60 d60Var) {
        this.f32538c = d60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        x50 x50Var;
        int i12;
        int i13;
        int i14;
        if (d60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!d60.G3 && i10 >= (i12 = (x50Var = this.f32538c.P).G) && i10 < (i13 = x50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (d60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (d60.F3) {
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
