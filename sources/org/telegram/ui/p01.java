package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class p01 extends u01 {
    public final int f50674n3;
    public final r11 f50675o3;

    public p01(r11 r11Var, Context context, int i7) {
        super(r11Var, context);
        this.f50675o3 = r11Var;
        this.f50674n3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            r11 r11Var = this.f50675o3;
            r11Var.f51458y1 = false;
            if (r11Var.f51400a != -1 && r11Var.f51418g0.getVisibility() == 0 && r11Var.f51418g0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (r11Var.f51418g0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                r11.a(r11Var, i10, 0);
            }
        }
    }

    @Override
    public final void l0(int i7) {
        int i10;
        org.telegram.ui.Components.hx hxVar;
        int i11;
        int i12;
        r11 r11Var = this.f50675o3;
        r11Var.h();
        boolean z10 = false;
        if (!r11Var.f51458y1) {
            int I0 = r11Var.f51442s0.I0();
            ArrayList arrayList = r11Var.E0;
            SparseIntArray sparseIntArray = r11Var.f51454x0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || r11Var.D0) {
                    i13 = arrayList.size() + (r11Var.O0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > r11Var.J0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            hxVar = (org.telegram.ui.Components.hx) r11Var.N0.get(valueAt);
                        } else {
                            hxVar = null;
                        }
                        if (hxVar != null) {
                            boolean z11 = hxVar.h;
                            int size = hxVar.f35937c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.nv nvVar = r11Var.f51413e0;
                                if (nvVar.E != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (nvVar.F != null && nvVar.f37950c0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                nvVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    r11Var.f51413e0.j(0, true);
                }
            }
        }
        r11Var.C();
        k01 k01Var = r11Var.f51416f0;
        if (r11Var.f51422i0.computeVerticalScrollOffset() != 0 || (i10 = this.f50674n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z10 = true;
        }
        org.telegram.messenger.g0.X3(k01Var, z10, 1.0f, true, true);
        r11Var.m();
    }
}
