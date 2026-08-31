package org.telegram.ui;

import java.util.ArrayList;
public final class b51 extends f2.v {
    public final int f35337c;
    public final r61 d;

    public b51(r61 r61Var, int i10) {
        this.f35337c = i10;
        this.d = r61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f35337c) {
            case 0:
                r61 r61Var = this.d;
                if (r61Var.f40823t0.indexOfKey(i10) < 0 && r61Var.f40830w0.indexOfKey(i10) < 0 && i10 != r61Var.f40793f && i10 != r61Var.f40835y && i10 != r61Var.f40808n && i10 != r61Var.h && i10 != r61Var.v && i10 != r61Var.f40779a && i10 != r61Var.f40832x) {
                    if ((i10 >= r61Var.B && i10 < r61Var.C) || r61Var.N) {
                        return 8;
                    }
                    return 5;
                }
                return r61Var.f40811o0.J;
            default:
                r61 r61Var2 = this.d;
                b61 b61Var = r61Var2.f40809n0;
                int j10 = b61Var.j(i10);
                if (j10 == 6) {
                    return r61Var2.f40811o0.J;
                }
                if (j10 != 5) {
                    r61 r61Var3 = b61Var.f35346s;
                    if (r61Var3.T != 14 ? i10 <= (i11 = b61Var.f35341c) || (i10 - i11) - 1 >= r61Var3.f40839z1.size() : (arrayList = r61Var3.f40837y1) == null || i10 < (i12 = b61Var.f35341c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
