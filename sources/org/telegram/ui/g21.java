package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class g21 extends l21 {
    public final int f37406m3;
    public final i31 f37407n3;

    public g21(i31 i31Var, Context context, int i10) {
        super(i31Var, context);
        this.f37407n3 = i31Var;
        this.f37406m3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        if (i10 == 0) {
            i31 i31Var = this.f37407n3;
            i31Var.f38165x1 = false;
            if (i31Var.f38111a != -1 && i31Var.f38125f0.getVisibility() == 0 && i31Var.f38125f0.getTranslationY() > (-org.telegram.messenger.i0.L(51.0f))) {
                if (i31Var.f38125f0.getTranslationY() > (-org.telegram.messenger.i0.L(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                i31.a(i31Var, i11, 0);
            }
        }
    }

    @Override
    public final void l0(int i10) {
        int i11;
        org.telegram.ui.Components.ix ixVar;
        int i12;
        int i13;
        i31 i31Var = this.f37407n3;
        i31Var.h();
        boolean z10 = false;
        if (!i31Var.f38165x1) {
            int I0 = i31Var.f38149r0.I0();
            ArrayList arrayList = i31Var.D0;
            SparseIntArray sparseIntArray = i31Var.f38161w0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || i31Var.C0) {
                    i14 = arrayList.size() + (i31Var.N0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > i31Var.I0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            ixVar = (org.telegram.ui.Components.ix) i31Var.M0.get(valueAt);
                        } else {
                            ixVar = null;
                        }
                        if (ixVar != null) {
                            boolean z11 = ixVar.h;
                            int size = ixVar.f27114c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.mv mvVar = i31Var.f38120d0;
                                if (mvVar.D != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (mvVar.E != null && mvVar.f28601b0) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                mvVar.j(i13 + i12 + valueAt, true);
                            }
                        }
                        i15++;
                    }
                } else {
                    i31Var.f38120d0.j(0, true);
                }
            }
        }
        i31Var.C();
        b21 b21Var = i31Var.f38122e0;
        if (i31Var.f38129h0.computeVerticalScrollOffset() != 0 || (i11 = this.f37406m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) {
            z10 = true;
        }
        org.telegram.messenger.i0.Y3(b21Var, z10, 1.0f, true, true);
        i31Var.m();
    }
}
