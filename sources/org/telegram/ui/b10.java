package org.telegram.ui;
public final class b10 extends g.p {
    public final x30 f43884c;

    public b10(x30 x30Var) {
        this.f43884c = x30Var;
    }

    @Override
    public final int i(int i3) {
        int i10;
        r30 r30Var;
        int i11;
        int i12;
        int i13;
        if (x30.f51713x5) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (!x30.f51714y5 && i3 >= (i11 = (r30Var = this.f43884c.H1).H) && i3 < (i12 = r30Var.I)) {
            int i14 = i12 - i11;
            if (i3 == i12 - 1 && (x30.f51713x5 || i14 % 2 != 0)) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if (x30.f51713x5) {
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
