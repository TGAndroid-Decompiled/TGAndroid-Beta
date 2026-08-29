package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class a51 extends f51 {
    public final int f36435b3;
    public final d61 c3;

    public a51(d61 d61Var, Context context, int i10) {
        super(d61Var, context);
        this.c3 = d61Var;
        this.f36435b3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        d61 d61Var = this.c3;
        u41 u41Var = d61Var.f37321b0;
        if (i10 == 0) {
            d61Var.f37360s1 = false;
            if (d61Var.f37317a != -1 && u41Var.getVisibility() == 0 && u41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (u41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                d61.a(d61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.rx rxVar;
        int i13;
        int i14;
        d61 d61Var = this.c3;
        d61Var.h();
        boolean z10 = false;
        if (!d61Var.f37360s1) {
            int I0 = d61Var.f37347n0.I0();
            ArrayList arrayList = d61Var.f37376z0;
            SparseIntArray sparseIntArray = d61Var.f37359s0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || d61Var.f37374y0) {
                    i15 = arrayList.size() + (d61Var.J0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > d61Var.E0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            rxVar = (org.telegram.ui.Components.rx) d61Var.I0.get(valueAt);
                        } else {
                            rxVar = null;
                        }
                        if (rxVar != null) {
                            boolean z11 = rxVar.h;
                            int size = rxVar.f32403c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.tv tvVar = d61Var.W;
                                if (tvVar.f33048y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (tvVar.A != null && tvVar.U) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                tvVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    d61Var.W.j(0, true);
                }
            }
        }
        d61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(d61Var.f37318a0, (d61Var.f37326d0.computeVerticalScrollOffset() != 0 || (i12 = this.f36435b3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        d61Var.m();
    }
}
