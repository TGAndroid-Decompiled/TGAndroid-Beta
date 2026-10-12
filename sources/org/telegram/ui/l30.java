package org.telegram.ui;
public final class l30 extends g.o {
    public final n60 f37825c;

    public l30(n60 n60Var) {
        this.f37825c = n60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        h60 h60Var;
        int i12;
        int i13;
        int i14;
        if (n60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!n60.G3 && i10 >= (i12 = (h60Var = this.f37825c.P).G) && i10 < (i13 = h60Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (n60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (n60.F3) {
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
