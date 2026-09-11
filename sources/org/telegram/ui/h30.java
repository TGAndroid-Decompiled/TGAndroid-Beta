package org.telegram.ui;
public final class h30 extends g.p {
    public final j60 f36872c;

    public h30(j60 j60Var) {
        this.f36872c = j60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        d60 d60Var;
        int i12;
        int i13;
        int i14;
        if (j60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!j60.G3 && i10 >= (i12 = (d60Var = this.f36872c.P).G) && i10 < (i13 = d60Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (j60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (j60.F3) {
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
