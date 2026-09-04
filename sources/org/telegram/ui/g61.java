package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class g61 extends l61 {
    public final int f36586f3;
    public final j71 f36587g3;

    public g61(j71 j71Var, Context context, int i10) {
        super(j71Var, context);
        this.f36587g3 = j71Var;
        this.f36586f3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        j71 j71Var = this.f36587g3;
        a61 a61Var = j71Var.f37642f0;
        if (i10 == 0) {
            j71Var.f37679w1 = false;
            if (j71Var.f37627a != -1 && a61Var.getVisibility() == 0 && a61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
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
        org.telegram.ui.Components.xx xxVar;
        int i13;
        int i14;
        j71 j71Var = this.f36587g3;
        j71Var.h();
        boolean z10 = false;
        if (!j71Var.f37679w1) {
            int I0 = j71Var.f37666r0.I0();
            ArrayList arrayList = j71Var.D0;
            SparseIntArray sparseIntArray = j71Var.f37678w0;
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
                            int size = xxVar.f32765c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.bw bwVar = j71Var.f37636d0;
                                if (bwVar.f24815y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (bwVar.E != null && bwVar.f24807b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                bwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    j71Var.f37636d0.j(0, true);
                }
            }
        }
        j71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(j71Var.f37639e0, (j71Var.f37646h0.computeVerticalScrollOffset() != 0 || (i12 = this.f36586f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        j71Var.m();
    }
}
