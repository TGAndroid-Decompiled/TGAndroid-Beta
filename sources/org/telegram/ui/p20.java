package org.telegram.ui;

public final class p20 extends f2.w {

    public final s50 f41250c;

    public p20(s50 s50Var) {
        this.f41250c = s50Var;
    }

    @Override
    public final int i(int i10) {
        m50 m50Var;
        int i11;
        int i12;
        int i13 = s50.B3 ? 6 : 2;
        if (s50.C3 || i10 < (i11 = (m50Var = this.f41250c.L).C) || i10 >= (i12 = m50Var.D)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!s50.B3 && i14 % 2 == 0)) ? 1 : 2;
        if (!s50.B3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
