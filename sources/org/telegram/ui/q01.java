package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class q01 extends v01 {
    public final int f48851m3;
    public final s11 f48852n3;

    public q01(s11 s11Var, Context context, int i7) {
        super(s11Var, context);
        this.f48852n3 = s11Var;
        this.f48851m3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            s11 s11Var = this.f48852n3;
            s11Var.f49715x1 = false;
            if (s11Var.f49661a != -1 && s11Var.f49676f0.getVisibility() == 0 && s11Var.f49676f0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (s11Var.f49676f0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                s11.a(s11Var, i10, 0);
            }
        }
    }

    @Override
    public final void l0(int i7) {
        int i10;
        org.telegram.ui.Components.uw uwVar;
        int i11;
        int i12;
        s11 s11Var = this.f48852n3;
        s11Var.h();
        boolean z9 = false;
        if (!s11Var.f49715x1) {
            int I0 = s11Var.f49699r0.I0();
            ArrayList arrayList = s11Var.D0;
            SparseIntArray sparseIntArray = s11Var.f49711w0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || s11Var.C0) {
                    i13 = arrayList.size() + (s11Var.N0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > s11Var.I0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            uwVar = (org.telegram.ui.Components.uw) s11Var.M0.get(valueAt);
                        } else {
                            uwVar = null;
                        }
                        if (uwVar != null) {
                            boolean z10 = uwVar.h;
                            int size = uwVar.f38811c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.bv bvVar = s11Var.f49670d0;
                                if (bvVar.D != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (bvVar.E != null && bvVar.f32427b0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                bvVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    s11Var.f49670d0.j(0, true);
                }
            }
        }
        s11Var.C();
        l01 l01Var = s11Var.f49673e0;
        if (s11Var.f49680h0.computeVerticalScrollOffset() != 0 || (i10 = this.f48851m3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z9 = true;
        }
        org.telegram.messenger.g0.Z3(l01Var, z9, 1.0f, true, true);
        s11Var.m();
    }
}
