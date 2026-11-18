package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class p01 extends u01 {
    public final int f50656n3;
    public final r11 f50657o3;

    public p01(r11 r11Var, Context context, int i7) {
        super(r11Var, context);
        this.f50657o3 = r11Var;
        this.f50656n3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            r11 r11Var = this.f50657o3;
            r11Var.f51434y1 = false;
            if (r11Var.f51376a != -1 && r11Var.f51394g0.getVisibility() == 0 && r11Var.f51394g0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (r11Var.f51394g0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
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
        org.telegram.ui.Components.fx fxVar;
        int i11;
        int i12;
        r11 r11Var = this.f50657o3;
        r11Var.h();
        boolean z10 = false;
        if (!r11Var.f51434y1) {
            int I0 = r11Var.f51418s0.I0();
            ArrayList arrayList = r11Var.E0;
            SparseIntArray sparseIntArray = r11Var.f51430x0;
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
                            fxVar = (org.telegram.ui.Components.fx) r11Var.N0.get(valueAt);
                        } else {
                            fxVar = null;
                        }
                        if (fxVar != null) {
                            boolean z11 = fxVar.h;
                            int size = fxVar.f35173c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.lv lvVar = r11Var.f51389e0;
                                if (lvVar.E != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (lvVar.F != null && lvVar.f37247c0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                lvVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    r11Var.f51389e0.j(0, true);
                }
            }
        }
        r11Var.C();
        k01 k01Var = r11Var.f51392f0;
        if (r11Var.f51398i0.computeVerticalScrollOffset() != 0 || (i10 = this.f50656n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z10 = true;
        }
        org.telegram.messenger.g0.X3(k01Var, z10, 1.0f, true, true);
        r11Var.m();
    }
}
