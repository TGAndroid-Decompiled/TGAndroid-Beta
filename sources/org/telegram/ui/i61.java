package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends n61 {
    public final int f33546f3;
    public final l71 f33547g3;

    public i61(l71 l71Var, Context context, int i10) {
        super(l71Var, context);
        this.f33547g3 = l71Var;
        this.f33546f3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        l71 l71Var = this.f33547g3;
        c61 c61Var = l71Var.f34566f0;
        if (i10 == 0) {
            l71Var.f34603w1 = false;
            if (l71Var.f34552a != -1 && c61Var.getVisibility() == 0 && c61Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (c61Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                l71.a(l71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.dy dyVar;
        int i13;
        int i14;
        l71 l71Var = this.f33547g3;
        l71Var.h();
        boolean z10 = false;
        if (!l71Var.f34603w1) {
            int I0 = l71Var.f34590r0.I0();
            ArrayList arrayList = l71Var.D0;
            SparseIntArray sparseIntArray = l71Var.f34602w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || l71Var.C0) {
                    i15 = arrayList.size() + (l71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > l71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            dyVar = (org.telegram.ui.Components.dy) l71Var.M0.get(valueAt);
                        } else {
                            dyVar = null;
                        }
                        if (dyVar != null) {
                            boolean z11 = dyVar.h;
                            int size = dyVar.f22500c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gw gwVar = l71Var.f34561d0;
                                if (gwVar.f23448y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (gwVar.E != null && gwVar.f23440b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                gwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    l71Var.f34561d0.j(0, true);
                }
            }
        }
        l71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(l71Var.f34563e0, (l71Var.f34570h0.computeVerticalScrollOffset() != 0 || (i12 = this.f33546f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        l71Var.m();
    }
}
