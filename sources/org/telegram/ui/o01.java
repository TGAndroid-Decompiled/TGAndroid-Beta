package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class o01 extends t01 {
    public final int f48202m3;
    public final q11 f48203n3;

    public o01(q11 q11Var, Context context, int i7) {
        super(q11Var, context);
        this.f48203n3 = q11Var;
        this.f48202m3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            q11 q11Var = this.f48203n3;
            q11Var.f49072x1 = false;
            if (q11Var.f49018a != -1 && q11Var.f49033f0.getVisibility() == 0 && q11Var.f49033f0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (q11Var.f49033f0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                q11.a(q11Var, i10, 0);
            }
        }
    }

    @Override
    public final void l0(int i7) {
        int i10;
        org.telegram.ui.Components.uw uwVar;
        int i11;
        int i12;
        q11 q11Var = this.f48203n3;
        q11Var.h();
        boolean z9 = false;
        if (!q11Var.f49072x1) {
            int I0 = q11Var.f49056r0.I0();
            ArrayList arrayList = q11Var.D0;
            SparseIntArray sparseIntArray = q11Var.f49068w0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || q11Var.C0) {
                    i13 = arrayList.size() + (q11Var.N0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > q11Var.I0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            uwVar = (org.telegram.ui.Components.uw) q11Var.M0.get(valueAt);
                        } else {
                            uwVar = null;
                        }
                        if (uwVar != null) {
                            boolean z10 = uwVar.h;
                            int size = uwVar.f38748c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.bv bvVar = q11Var.f49027d0;
                                if (bvVar.D != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (bvVar.E != null && bvVar.f32364b0) {
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
                    q11Var.f49027d0.j(0, true);
                }
            }
        }
        q11Var.C();
        j01 j01Var = q11Var.f49030e0;
        if (q11Var.f49037h0.computeVerticalScrollOffset() != 0 || (i10 = this.f48202m3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z9 = true;
        }
        org.telegram.messenger.g0.Z3(j01Var, z9, 1.0f, true, true);
        q11Var.m();
    }
}
