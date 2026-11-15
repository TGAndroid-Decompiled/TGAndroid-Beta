package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class l01 extends q01 {
    public final int f48808n3;
    public final n11 f48809o3;

    public l01(n11 n11Var, Context context, int i7) {
        super(n11Var, context);
        this.f48809o3 = n11Var;
        this.f48808n3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            n11 n11Var = this.f48809o3;
            n11Var.f49422y1 = false;
            if (n11Var.f49364a != -1 && n11Var.f49382g0.getVisibility() == 0 && n11Var.f49382g0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (n11Var.f49382g0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                n11.a(n11Var, i10, 0);
            }
        }
    }

    @Override
    public final void l0(int i7) {
        int i10;
        org.telegram.ui.Components.zw zwVar;
        int i11;
        int i12;
        n11 n11Var = this.f48809o3;
        n11Var.h();
        boolean z10 = false;
        if (!n11Var.f49422y1) {
            int I0 = n11Var.f49406s0.I0();
            ArrayList arrayList = n11Var.E0;
            SparseIntArray sparseIntArray = n11Var.f49418x0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || n11Var.D0) {
                    i13 = arrayList.size() + (n11Var.O0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > n11Var.J0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            zwVar = (org.telegram.ui.Components.zw) n11Var.N0.get(valueAt);
                        } else {
                            zwVar = null;
                        }
                        if (zwVar != null) {
                            boolean z11 = zwVar.h;
                            int size = zwVar.f42432c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gv gvVar = n11Var.f49377e0;
                                if (gvVar.E != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (gvVar.F != null && gvVar.f35065c0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                gvVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    n11Var.f49377e0.j(0, true);
                }
            }
        }
        n11Var.C();
        g01 g01Var = n11Var.f49380f0;
        if (n11Var.f49386i0.computeVerticalScrollOffset() != 0 || (i10 = this.f48808n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z10 = true;
        }
        org.telegram.messenger.g0.Y3(g01Var, z10, 1.0f, true, true);
        n11Var.m();
    }
}
