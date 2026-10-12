package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class o61 extends t61 {
    public final int f38875d3;
    public final r71 f38876e3;

    public o61(r71 r71Var, Context context, int i10) {
        super(r71Var, context);
        this.f38876e3 = r71Var;
        this.f38875d3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        r71 r71Var = this.f38876e3;
        i61 i61Var = r71Var.f39633f0;
        if (i10 == 0) {
            r71Var.f39670w1 = false;
            if (r71Var.f39619a != -1 && i61Var.getVisibility() == 0 && i61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (i61Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                r71.a(r71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.jy jyVar;
        int i13;
        int i14;
        r71 r71Var = this.f38876e3;
        r71Var.h();
        boolean z10 = false;
        if (!r71Var.f39670w1) {
            int I0 = r71Var.f39657r0.I0();
            ArrayList arrayList = r71Var.D0;
            SparseIntArray sparseIntArray = r71Var.f39669w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || r71Var.C0) {
                    i15 = arrayList.size() + (r71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > r71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            jyVar = (org.telegram.ui.Components.jy) r71Var.M0.get(valueAt);
                        } else {
                            jyVar = null;
                        }
                        if (jyVar != null) {
                            boolean z11 = jyVar.h;
                            int size = jyVar.f26515c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.ow owVar = r71Var.f39628d0;
                                if (owVar.f28077y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (owVar.E != null && owVar.f28069b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                owVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    r71Var.f39628d0.j(0, true);
                }
            }
        }
        r71Var.C();
        j61 j61Var = r71Var.f39630e0;
        if (r71Var.f39637h0.computeVerticalScrollOffset() != 0 || (i12 = this.f38875d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(j61Var, z10, 1.0f, true);
        r71Var.m();
    }
}
