package org.telegram.ui;
public final class j10 extends g.p {
    public final f40 f46791c;

    public j10(f40 f40Var) {
        this.f46791c = f40Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        z30 z30Var;
        int i11;
        int i12;
        int i13;
        if (f40.f45503z5) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (!f40.A5 && i7 >= (i11 = (z30Var = this.f46791c.J1).G) && i7 < (i12 = z30Var.H)) {
            int i14 = i12 - i11;
            if (i7 == i12 - 1 && (f40.f45503z5 || i14 % 2 != 0)) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if (f40.f45503z5) {
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
