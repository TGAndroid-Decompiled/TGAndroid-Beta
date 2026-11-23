package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class o01 extends t01 {
    public final int f50473n3;
    public final q11 f50474o3;

    public o01(q11 q11Var, Context context, int i7) {
        super(q11Var, context);
        this.f50474o3 = q11Var;
        this.f50473n3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            q11 q11Var = this.f50474o3;
            q11Var.f51283y1 = false;
            if (q11Var.f51225a != -1 && q11Var.f51243g0.getVisibility() == 0 && q11Var.f51243g0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (q11Var.f51243g0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
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
        org.telegram.ui.Components.ex exVar;
        int i11;
        int i12;
        q11 q11Var = this.f50474o3;
        q11Var.h();
        boolean z10 = false;
        if (!q11Var.f51283y1) {
            int I0 = q11Var.f51267s0.I0();
            ArrayList arrayList = q11Var.E0;
            SparseIntArray sparseIntArray = q11Var.f51279x0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || q11Var.D0) {
                    i13 = arrayList.size() + (q11Var.O0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > q11Var.J0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            exVar = (org.telegram.ui.Components.ex) q11Var.N0.get(valueAt);
                        } else {
                            exVar = null;
                        }
                        if (exVar != null) {
                            boolean z11 = exVar.h;
                            int size = exVar.f34857c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.lv lvVar = q11Var.f51238e0;
                                if (lvVar.E != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (lvVar.F != null && lvVar.f37233c0) {
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
                    q11Var.f51238e0.j(0, true);
                }
            }
        }
        q11Var.C();
        j01 j01Var = q11Var.f51241f0;
        if (q11Var.f51247i0.computeVerticalScrollOffset() != 0 || (i10 = this.f50473n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z10 = true;
        }
        org.telegram.messenger.g0.X3(j01Var, z10, 1.0f, true, true);
        q11Var.m();
    }
}
