package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class o51 extends t51 {
    public final int c3;
    public final r61 f39600d3;

    public o51(r61 r61Var, Context context, int i10) {
        super(r61Var, context);
        this.f39600d3 = r61Var;
        this.c3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        r61 r61Var = this.f39600d3;
        i51 i51Var = r61Var.f40786c0;
        if (i10 == 0) {
            r61Var.f40824t1 = false;
            if (r61Var.f40779a != -1 && i51Var.getVisibility() == 0 && i51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (i51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                r61.a(r61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.xx xxVar;
        int i13;
        int i14;
        r61 r61Var = this.f39600d3;
        r61Var.h();
        boolean z4 = false;
        if (!r61Var.f40824t1) {
            int I0 = r61Var.f40811o0.I0();
            ArrayList arrayList = r61Var.A0;
            SparseIntArray sparseIntArray = r61Var.f40823t0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || r61Var.f40838z0) {
                    i15 = arrayList.size() + (r61Var.K0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > r61Var.F0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            xxVar = (org.telegram.ui.Components.xx) r61Var.J0.get(valueAt);
                        } else {
                            xxVar = null;
                        }
                        if (xxVar != null) {
                            boolean z10 = xxVar.h;
                            int size = xxVar.f33190c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.zv zvVar = r61Var.f40780a0;
                                if (zvVar.f34030y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (zvVar.B != null && zvVar.V) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                zvVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    r61Var.f40780a0.j(0, true);
                }
            }
        }
        r61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(r61Var.f40783b0, (r61Var.f40791e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        r61Var.m();
    }
}
