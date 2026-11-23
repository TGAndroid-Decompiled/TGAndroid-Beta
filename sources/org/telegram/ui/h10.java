package org.telegram.ui;
public final class h10 extends g.p {
    public final e40 f48405c;

    public h10(e40 e40Var) {
        this.f48405c = e40Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        y30 y30Var;
        int i11;
        int i12;
        int i13;
        if (e40.E5) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (!e40.F5 && i7 >= (i11 = (y30Var = this.f48405c.K1).H) && i7 < (i12 = y30Var.I)) {
            int i14 = i12 - i11;
            if (i7 == i12 - 1 && (e40.E5 || i14 % 2 != 0)) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if (e40.E5) {
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
