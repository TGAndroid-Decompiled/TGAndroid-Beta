package org.telegram.ui;
public final class e30 extends g.p {
    public final f60 f32783c;

    public e30(f60 f60Var) {
        this.f32783c = f60Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        z50 z50Var;
        int i12;
        int i13;
        int i14;
        if (f60.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!f60.G3 && i10 >= (i12 = (z50Var = this.f32783c.P).G) && i10 < (i13 = z50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (f60.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (f60.F3) {
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
