package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class g61 extends l61 {
    public final int f33844f3;
    public final j71 f33845g3;

    public g61(j71 j71Var, Context context, int i10) {
        super(j71Var, context);
        this.f33845g3 = j71Var;
        this.f33844f3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        j71 j71Var = this.f33845g3;
        a61 a61Var = j71Var.f34813f0;
        if (i10 == 0) {
            j71Var.f34850w1 = false;
            if (j71Var.f34799a != -1 && a61Var.getVisibility() == 0 && a61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
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
    public final void l0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.xx xxVar;
        int i13;
        int i14;
        j71 j71Var = this.f33845g3;
        j71Var.h();
        boolean z10 = false;
        if (!j71Var.f34850w1) {
            int I0 = j71Var.f34837r0.I0();
            ArrayList arrayList = j71Var.D0;
            SparseIntArray sparseIntArray = j71Var.f34849w0;
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
                            xxVar = (org.telegram.ui.Components.xx) j71Var.M0.get(valueAt);
                        } else {
                            xxVar = null;
                        }
                        if (xxVar != null) {
                            boolean z11 = xxVar.h;
                            int size = xxVar.f30423c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.dw dwVar = j71Var.f34808d0;
                                if (dwVar.f23769y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (dwVar.E != null && dwVar.f23761b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                dwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    j71Var.f34808d0.j(0, true);
                }
            }
        }
        j71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(j71Var.f34810e0, (j71Var.f34817h0.computeVerticalScrollOffset() != 0 || (i12 = this.f33844f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        j71Var.m();
    }
}
