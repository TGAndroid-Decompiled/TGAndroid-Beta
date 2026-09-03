package org.telegram.ui;

import java.util.ArrayList;
public final class g51 extends f2.v {
    public final int f36988c;
    public final w61 d;

    public g51(w61 w61Var, int i10) {
        this.f36988c = i10;
        this.d = w61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f36988c) {
            case 0:
                w61 w61Var = this.d;
                if (w61Var.f42346t0.indexOfKey(i10) < 0 && w61Var.f42353w0.indexOfKey(i10) < 0 && i10 != w61Var.f42316f && i10 != w61Var.f42358y && i10 != w61Var.f42331n && i10 != w61Var.h && i10 != w61Var.v && i10 != w61Var.f42302a && i10 != w61Var.f42355x) {
                    if ((i10 >= w61Var.B && i10 < w61Var.C) || w61Var.N) {
                        return 8;
                    }
                    return 5;
                }
                return w61Var.f42334o0.J;
            default:
                w61 w61Var2 = this.d;
                g61 g61Var = w61Var2.f42332n0;
                int j10 = g61Var.j(i10);
                if (j10 == 6) {
                    return w61Var2.f42334o0.J;
                }
                if (j10 != 5) {
                    w61 w61Var3 = g61Var.f36999s;
                    if (w61Var3.T != 14 ? i10 <= (i11 = g61Var.f36994c) || (i10 - i11) - 1 >= w61Var3.f42362z1.size() : (arrayList = w61Var3.f42360y1) == null || i10 < (i12 = g61Var.f36994c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
