package org.telegram.ui;
public final class m20 extends f2.x {
    public final o50 f40305c;

    public m20(o50 o50Var) {
        this.f40305c = o50Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        i50 i50Var;
        int i11;
        int i12;
        int i13;
        if (o50.B3) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (!o50.C3 && i9 >= (i11 = (i50Var = this.f40305c.L).C) && i9 < (i12 = i50Var.D)) {
            int i14 = i12 - i11;
            if (i9 == i12 - 1 && (o50.B3 || i14 % 2 != 0)) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if (o50.B3) {
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
