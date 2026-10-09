package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class h61 extends m61 {
    public final int f38215d3;
    public final k71 f38216e3;

    public h61(k71 k71Var, Context context, int i10) {
        super(k71Var, context);
        this.f38216e3 = k71Var;
        this.f38215d3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        k71 k71Var = this.f38216e3;
        b61 b61Var = k71Var.f39126f0;
        if (i10 == 0) {
            k71Var.f39163w1 = false;
            if (k71Var.f39111a != -1 && b61Var.getVisibility() == 0 && b61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (b61Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                k71.a(k71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.ny nyVar;
        int i13;
        int i14;
        k71 k71Var = this.f38216e3;
        k71Var.h();
        boolean z10 = false;
        if (!k71Var.f39163w1) {
            int I0 = k71Var.f39150r0.I0();
            ArrayList arrayList = k71Var.D0;
            SparseIntArray sparseIntArray = k71Var.f39162w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || k71Var.C0) {
                    i15 = arrayList.size() + (k71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > k71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            nyVar = (org.telegram.ui.Components.ny) k71Var.M0.get(valueAt);
                        } else {
                            nyVar = null;
                        }
                        if (nyVar != null) {
                            boolean z11 = nyVar.h;
                            int size = nyVar.f29302c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.sw swVar = k71Var.f39120d0;
                                if (swVar.f30913y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (swVar.E != null && swVar.f30905b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                swVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    k71Var.f39120d0.j(0, true);
                }
            }
        }
        k71Var.C();
        c61 c61Var = k71Var.f39123e0;
        if (k71Var.f39130h0.computeVerticalScrollOffset() != 0 || (i12 = this.f38215d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(c61Var, z10, 1.0f, true);
        k71Var.m();
    }
}
