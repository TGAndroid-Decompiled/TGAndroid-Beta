package org.telegram.ui;
public final class i10 extends g.p {
    public final f40 f48515c;

    public i10(f40 f40Var) {
        this.f48515c = f40Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        z30 z30Var;
        int i11;
        int i12;
        int i13;
        if (f40.E5) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (!f40.F5 && i7 >= (i11 = (z30Var = this.f48515c.K1).H) && i7 < (i12 = z30Var.I)) {
            int i14 = i12 - i11;
            if (i7 == i12 - 1 && (f40.E5 || i14 % 2 != 0)) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if (f40.E5) {
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
