package org.telegram.ui;

import java.util.ArrayList;
public final class e01 extends g.p {
    public final int f47101c;
    public final r11 d;

    public e01(r11 r11Var, int i7) {
        this.f47101c = i7;
        this.d = r11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f47101c) {
            case 0:
                r11 r11Var = this.d;
                if (r11Var.f51470x0.indexOfKey(i7) < 0 && r11Var.A0.indexOfKey(i7) < 0 && i7 != r11Var.f51431f && i7 != r11Var.E && i7 != r11Var.f51446n && i7 != r11Var.h && i7 != r11Var.f51466w && i7 != r11Var.f51416a && i7 != r11Var.f51472y) {
                    if ((i7 >= r11Var.F && i7 < r11Var.G) || r11Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return r11Var.f51458s0.J;
            default:
                r11 r11Var2 = this.d;
                c11 c11Var = r11Var2.f51455r0;
                int d = c11Var.d(i7);
                if (d == 6) {
                    return r11Var2.f51458s0.J;
                }
                if (d != 5) {
                    r11 r11Var3 = c11Var.f46368s;
                    if (r11Var3.f51417a0 != 14 ? i7 <= (i10 = c11Var.f46363c) || (i7 - i10) - 1 >= r11Var3.E1.size() : (arrayList = r11Var3.D1) == null || i7 < (i11 = c11Var.f46363c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
