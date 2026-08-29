package org.telegram.ui;
public final class q20 extends f2.v {
    public final r50 f41507c;

    public q20(r50 r50Var) {
        this.f41507c = r50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l50 l50Var;
        int i12;
        int i13;
        int i14;
        if (r50.B3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!r50.C3 && i10 >= (i12 = (l50Var = this.f41507c.L).C) && i10 < (i13 = l50Var.D)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (r50.B3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (r50.B3) {
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
