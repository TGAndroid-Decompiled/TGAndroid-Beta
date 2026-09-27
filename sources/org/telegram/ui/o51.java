package org.telegram.ui;

import java.util.ArrayList;
public final class o51 extends g.p {
    public final int f36140c;
    public final c71 d;

    public o51(c71 c71Var, int i10) {
        this.f36140c = i10;
        this.d = c71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f36140c) {
            case 0:
                c71 c71Var = this.d;
                if (c71Var.f32617w0.indexOfKey(i10) < 0 && c71Var.f32625z0.indexOfKey(i10) < 0 && i10 != c71Var.f32580f && i10 != c71Var.f32622y && i10 != c71Var.f32595n && i10 != c71Var.h && i10 != c71Var.v && i10 != c71Var.f32567a && i10 != c71Var.f32619x) {
                    if ((i10 >= c71Var.E && i10 < c71Var.F) || c71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return c71Var.f32605r0.J;
            default:
                c71 c71Var2 = this.d;
                m61 m61Var = c71Var2.f32602q0;
                int j3 = m61Var.j(i10);
                if (j3 == 6) {
                    return c71Var2.f32605r0.J;
                }
                if (j3 != 5) {
                    c71 c71Var3 = m61Var.f35532s;
                    if (c71Var3.W != 14 ? i10 <= (i11 = m61Var.f35528c) || (i10 - i11) - 1 >= c71Var3.C1.size() : (arrayList = c71Var3.B1) == null || i10 < (i12 = m61Var.f35528c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
