package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class q01 extends v01 {
    public final int f51021n3;
    public final s11 f51022o3;

    public q01(s11 s11Var, Context context, int i7) {
        super(s11Var, context);
        this.f51022o3 = s11Var;
        this.f51021n3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            s11 s11Var = this.f51022o3;
            s11Var.f51880y1 = false;
            if (s11Var.f51822a != -1 && s11Var.f51840g0.getVisibility() == 0 && s11Var.f51840g0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (s11Var.f51840g0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
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
        org.telegram.ui.Components.hx hxVar;
        int i11;
        int i12;
        s11 s11Var = this.f51022o3;
        s11Var.h();
        boolean z10 = false;
        if (!s11Var.f51880y1) {
            int I0 = s11Var.f51864s0.I0();
            ArrayList arrayList = s11Var.E0;
            SparseIntArray sparseIntArray = s11Var.f51876x0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || s11Var.D0) {
                    i13 = arrayList.size() + (s11Var.O0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > s11Var.J0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            hxVar = (org.telegram.ui.Components.hx) s11Var.N0.get(valueAt);
                        } else {
                            hxVar = null;
                        }
                        if (hxVar != null) {
                            boolean z11 = hxVar.h;
                            int size = hxVar.f35983c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.ov ovVar = s11Var.f51835e0;
                                if (ovVar.E != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (ovVar.F != null && ovVar.f38371c0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                ovVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    s11Var.f51835e0.j(0, true);
                }
            }
        }
        s11Var.C();
        l01 l01Var = s11Var.f51838f0;
        if (s11Var.f51844i0.computeVerticalScrollOffset() != 0 || (i10 = this.f51021n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z10 = true;
        }
        org.telegram.messenger.g0.X3(l01Var, z10, 1.0f, true, true);
        s11Var.m();
    }
}
