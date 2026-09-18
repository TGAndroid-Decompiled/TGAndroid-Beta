package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f61 extends k61 {
    public final int f33567f3;
    public final i71 f33568g3;

    public f61(i71 i71Var, Context context, int i10) {
        super(i71Var, context);
        this.f33568g3 = i71Var;
        this.f33567f3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        i71 i71Var = this.f33568g3;
        z51 z51Var = i71Var.f34462f0;
        if (i10 == 0) {
            i71Var.f34499w1 = false;
            if (i71Var.f34448a != -1 && z51Var.getVisibility() == 0 && z51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (z51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                i71.a(i71Var, i11, 0);
            }
        }
    }

    @Override
    public final void l0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.wx wxVar;
        int i13;
        int i14;
        i71 i71Var = this.f33568g3;
        i71Var.h();
        boolean z10 = false;
        if (!i71Var.f34499w1) {
            int I0 = i71Var.f34486r0.I0();
            ArrayList arrayList = i71Var.D0;
            SparseIntArray sparseIntArray = i71Var.f34498w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || i71Var.C0) {
                    i15 = arrayList.size() + (i71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > i71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            wxVar = (org.telegram.ui.Components.wx) i71Var.M0.get(valueAt);
                        } else {
                            wxVar = null;
                        }
                        if (wxVar != null) {
                            boolean z11 = wxVar.h;
                            int size = wxVar.f29763c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.cw cwVar = i71Var.f34457d0;
                                if (cwVar.f23148y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (cwVar.E != null && cwVar.f23140b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                cwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    i71Var.f34457d0.j(0, true);
                }
            }
        }
        i71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(i71Var.f34459e0, (i71Var.f34466h0.computeVerticalScrollOffset() != 0 || (i12 = this.f33567f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        i71Var.m();
    }
}
