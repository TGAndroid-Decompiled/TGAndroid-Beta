package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends j61 {
    public final int f33179f3;
    public final h71 f33180g3;

    public e61(h71 h71Var, Context context, int i10) {
        super(h71Var, context);
        this.f33180g3 = h71Var;
        this.f33179f3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        h71 h71Var = this.f33180g3;
        y51 y51Var = h71Var.f34128f0;
        if (i10 == 0) {
            h71Var.f34165w1 = false;
            if (h71Var.f34114a != -1 && y51Var.getVisibility() == 0 && y51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (y51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                h71.a(h71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.wx wxVar;
        int i13;
        int i14;
        h71 h71Var = this.f33180g3;
        h71Var.h();
        boolean z10 = false;
        if (!h71Var.f34165w1) {
            int I0 = h71Var.f34152r0.I0();
            ArrayList arrayList = h71Var.D0;
            SparseIntArray sparseIntArray = h71Var.f34164w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || h71Var.C0) {
                    i15 = arrayList.size() + (h71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > h71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            wxVar = (org.telegram.ui.Components.wx) h71Var.M0.get(valueAt);
                        } else {
                            wxVar = null;
                        }
                        if (wxVar != null) {
                            boolean z11 = wxVar.h;
                            int size = wxVar.f29821c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.cw cwVar = h71Var.f34123d0;
                                if (cwVar.f23154y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (cwVar.E != null && cwVar.f23146b0) {
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
                    h71Var.f34123d0.j(0, true);
                }
            }
        }
        h71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(h71Var.f34125e0, (h71Var.f34132h0.computeVerticalScrollOffset() != 0 || (i12 = this.f33179f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        h71Var.m();
    }
}
