package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class e01 extends j01 {
    public final int f44850n3;
    public final g11 f44851o3;

    public e01(g11 g11Var, Context context, int i3) {
        super(g11Var, context);
        this.f44851o3 = g11Var;
        this.f44850n3 = i3;
    }

    @Override
    public final void k0(int i3) {
        int i10;
        if (i3 == 0) {
            g11 g11Var = this.f44851o3;
            g11Var.f45492y1 = false;
            if (g11Var.f45434a != -1 && g11Var.f45452g0.getVisibility() == 0 && g11Var.f45452g0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (g11Var.f45452g0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                g11.a(g11Var, i10, 0);
            }
        }
    }

    @Override
    public final void l0(int i3) {
        int i10;
        org.telegram.ui.Components.sw swVar;
        int i11;
        int i12;
        g11 g11Var = this.f44851o3;
        g11Var.h();
        boolean z10 = false;
        if (!g11Var.f45492y1) {
            int I0 = g11Var.f45476s0.I0();
            ArrayList arrayList = g11Var.E0;
            SparseIntArray sparseIntArray = g11Var.f45488x0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || g11Var.D0) {
                    i13 = arrayList.size() + (g11Var.O0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > g11Var.J0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            swVar = (org.telegram.ui.Components.sw) g11Var.N0.get(valueAt);
                        } else {
                            swVar = null;
                        }
                        if (swVar != null) {
                            boolean z11 = swVar.h;
                            int size = swVar.f38126c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.zu zuVar = g11Var.f45447e0;
                                if (zuVar.E != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (zuVar.F != null && zuVar.f41116c0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                zuVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    g11Var.f45447e0.j(0, true);
                }
            }
        }
        g11Var.C();
        zz0 zz0Var = g11Var.f45450f0;
        if (g11Var.f45456i0.computeVerticalScrollOffset() != 0 || (i10 = this.f44850n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z10 = true;
        }
        org.telegram.messenger.g0.Z3(zz0Var, z10, 1.0f, true, true);
        g11Var.m();
    }
}
