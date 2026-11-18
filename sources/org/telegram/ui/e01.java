package org.telegram.ui;

import java.util.ArrayList;
public final class e01 extends g.p {
    public final int f47024c;
    public final r11 d;

    public e01(r11 r11Var, int i7) {
        this.f47024c = i7;
        this.d = r11Var;
    }

    @Override
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f47024c) {
            case 0:
                r11 r11Var = this.d;
                if (r11Var.f51430x0.indexOfKey(i7) < 0 && r11Var.A0.indexOfKey(i7) < 0 && i7 != r11Var.f51391f && i7 != r11Var.E && i7 != r11Var.f51406n && i7 != r11Var.h && i7 != r11Var.f51426w && i7 != r11Var.f51376a && i7 != r11Var.f51432y) {
                    if ((i7 >= r11Var.F && i7 < r11Var.G) || r11Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return r11Var.f51418s0.J;
            default:
                r11 r11Var2 = this.d;
                c11 c11Var = r11Var2.f51415r0;
                int d = c11Var.d(i7);
                if (d == 6) {
                    return r11Var2.f51418s0.J;
                }
                if (d != 5) {
                    r11 r11Var3 = c11Var.f46359s;
                    if (r11Var3.f51377a0 != 14 ? i7 <= (i10 = c11Var.f46354c) || (i7 - i10) - 1 >= r11Var3.E1.size() : (arrayList = r11Var3.D1) == null || i7 < (i11 = c11Var.f46354c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
