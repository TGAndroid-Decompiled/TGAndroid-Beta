package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class c51 extends h51 {
    public final int f38176n3;
    public final f61 f38177o3;

    public c51(f61 f61Var, Context context, int i10) {
        super(f61Var, context);
        this.f38177o3 = f61Var;
        this.f38176n3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        f61 f61Var = this.f38177o3;
        w41 w41Var = f61Var.f39198f0;
        if (i10 == 0) {
            f61Var.f39238x1 = false;
            if (f61Var.f39184a != -1 && w41Var.getVisibility() == 0 && w41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (w41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                f61.a(f61Var, i11, 0);
            }
        }
    }

    @Override
    public final void l0(int i10) {
        int i11;
        org.telegram.ui.Components.ey eyVar;
        int i12;
        int i13;
        f61 f61Var = this.f38177o3;
        f61Var.h();
        boolean z10 = false;
        if (!f61Var.f39238x1) {
            int I0 = f61Var.f39222r0.I0();
            ArrayList arrayList = f61Var.D0;
            SparseIntArray sparseIntArray = f61Var.f39234w0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || f61Var.C0) {
                    i14 = arrayList.size() + (f61Var.N0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > f61Var.I0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            eyVar = (org.telegram.ui.Components.ey) f61Var.M0.get(valueAt);
                        } else {
                            eyVar = null;
                        }
                        if (eyVar != null) {
                            boolean z11 = eyVar.h;
                            int size = eyVar.f27959c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = f61Var.f39193d0;
                                if (kwVar.f30045y != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (kwVar.E != null && kwVar.f30037b0) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                kwVar.j(i13 + i12 + valueAt, true);
                            }
                        }
                        i15++;
                    }
                } else {
                    f61Var.f39193d0.j(0, true);
                }
            }
        }
        f61Var.C();
        x41 x41Var = f61Var.f39195e0;
        if (f61Var.f39202h0.computeVerticalScrollOffset() != 0 || (i11 = this.f38176n3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(x41Var, z10, 1.0f, true);
        f61Var.m();
    }
}
