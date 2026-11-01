package org.telegram.ui;
public final class e20 extends g.o {
    public final a50 f36719c;

    public e20(a50 a50Var) {
        this.f36719c = a50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        u40 u40Var;
        int i12;
        int i13;
        int i14;
        if (a50.f35575w5) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!a50.f35576x5 && i10 >= (i12 = (u40Var = this.f36719c.G1).G) && i10 < (i13 = u40Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (a50.f35575w5 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (a50.f35575w5) {
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
