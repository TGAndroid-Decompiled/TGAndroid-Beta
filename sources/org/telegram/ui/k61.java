package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class k61 extends p61 {
    public final int f39370d3;
    public final n71 f39371e3;

    public k61(n71 n71Var, Context context, int i10) {
        super(n71Var, context);
        this.f39371e3 = n71Var;
        this.f39370d3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        n71 n71Var = this.f39371e3;
        e61 e61Var = n71Var.f40271f0;
        if (i10 == 0) {
            n71Var.f40308w1 = false;
            if (n71Var.f40256a != -1 && e61Var.getVisibility() == 0 && e61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (e61Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                n71.a(n71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.qy qyVar;
        int i13;
        int i14;
        n71 n71Var = this.f39371e3;
        n71Var.h();
        boolean z10 = false;
        if (!n71Var.f40308w1) {
            int I0 = n71Var.f40295r0.I0();
            ArrayList arrayList = n71Var.D0;
            SparseIntArray sparseIntArray = n71Var.f40307w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || n71Var.C0) {
                    i15 = arrayList.size() + (n71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > n71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            qyVar = (org.telegram.ui.Components.qy) n71Var.M0.get(valueAt);
                        } else {
                            qyVar = null;
                        }
                        if (qyVar != null) {
                            boolean z11 = qyVar.h;
                            int size = qyVar.f29949c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.vw vwVar = n71Var.f40265d0;
                                if (vwVar.f32192y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (vwVar.E != null && vwVar.f32184b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                vwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    n71Var.f40265d0.j(0, true);
                }
            }
        }
        n71Var.C();
        f61 f61Var = n71Var.f40268e0;
        if (n71Var.f40275h0.computeVerticalScrollOffset() != 0 || (i12 = this.f39370d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(f61Var, z10, 1.0f, true);
        n71Var.m();
    }
}
