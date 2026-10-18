package org.telegram.ui;
public final class q20 extends g.o {
    public final s50 f40301c;

    public q20(s50 s50Var) {
        this.f40301c = s50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m50 m50Var;
        int i12;
        int i13;
        int i14;
        if (s50.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!s50.G3 && i10 >= (i12 = (m50Var = this.f40301c.P).G) && i10 < (i13 = m50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (s50.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (s50.F3) {
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
