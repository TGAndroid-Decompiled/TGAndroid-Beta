package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class g61 extends l61 {
    public final int f38011d3;
    public final j71 f38012e3;

    public g61(j71 j71Var, Context context, int i10) {
        super(j71Var, context);
        this.f38012e3 = j71Var;
        this.f38011d3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        j71 j71Var = this.f38012e3;
        a61 a61Var = j71Var.f38924f0;
        if (i10 == 0) {
            j71Var.f38961w1 = false;
            if (j71Var.f38909a != -1 && a61Var.getVisibility() == 0 && a61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (a61Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                j71.a(j71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.oy oyVar;
        int i13;
        int i14;
        j71 j71Var = this.f38012e3;
        j71Var.h();
        boolean z10 = false;
        if (!j71Var.f38961w1) {
            int I0 = j71Var.f38948r0.I0();
            ArrayList arrayList = j71Var.D0;
            SparseIntArray sparseIntArray = j71Var.f38960w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || j71Var.C0) {
                    i15 = arrayList.size() + (j71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > j71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            oyVar = (org.telegram.ui.Components.oy) j71Var.M0.get(valueAt);
                        } else {
                            oyVar = null;
                        }
                        if (oyVar != null) {
                            boolean z11 = oyVar.h;
                            int size = oyVar.f29652c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.tw twVar = j71Var.f38918d0;
                                if (twVar.f31358y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (twVar.E != null && twVar.f31350b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                twVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    j71Var.f38918d0.j(0, true);
                }
            }
        }
        j71Var.C();
        b61 b61Var = j71Var.f38921e0;
        if (j71Var.f38928h0.computeVerticalScrollOffset() != 0 || (i12 = this.f38011d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(b61Var, z10, 1.0f, true);
        j71Var.m();
    }
}
