package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends i61 {
    public final int f32940f3;
    public final g71 f32941g3;

    public d61(g71 g71Var, Context context, int i10) {
        super(g71Var, context);
        this.f32941g3 = g71Var;
        this.f32940f3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        g71 g71Var = this.f32941g3;
        x51 x51Var = g71Var.f33792f0;
        if (i10 == 0) {
            g71Var.f33829w1 = false;
            if (g71Var.f33778a != -1 && x51Var.getVisibility() == 0 && x51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (x51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                g71.a(g71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.wx wxVar;
        int i13;
        int i14;
        g71 g71Var = this.f32941g3;
        g71Var.h();
        boolean z10 = false;
        if (!g71Var.f33829w1) {
            int I0 = g71Var.f33816r0.I0();
            ArrayList arrayList = g71Var.D0;
            SparseIntArray sparseIntArray = g71Var.f33828w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || g71Var.C0) {
                    i15 = arrayList.size() + (g71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > g71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            wxVar = (org.telegram.ui.Components.wx) g71Var.M0.get(valueAt);
                        } else {
                            wxVar = null;
                        }
                        if (wxVar != null) {
                            boolean z11 = wxVar.h;
                            int size = wxVar.f29824c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.cw cwVar = g71Var.f33787d0;
                                if (cwVar.f23155y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (cwVar.E != null && cwVar.f23147b0) {
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
                    g71Var.f33787d0.j(0, true);
                }
            }
        }
        g71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(g71Var.f33789e0, (g71Var.f33796h0.computeVerticalScrollOffset() != 0 || (i12 = this.f32940f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        g71Var.m();
    }
}
