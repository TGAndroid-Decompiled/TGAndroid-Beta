package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class m51 extends r51 {
    public final int c3;
    public final q61 f36196d3;

    public m51(q61 q61Var, Context context, int i10) {
        super(q61Var, context);
        this.f36196d3 = q61Var;
        this.c3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        q61 q61Var = this.f36196d3;
        g51 g51Var = q61Var.f37601c0;
        if (i10 == 0) {
            q61Var.f37638t1 = false;
            if (q61Var.f37594a != -1 && g51Var.getVisibility() == 0 && g51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (g51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                q61.a(q61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.vx vxVar;
        int i13;
        int i14;
        q61 q61Var = this.f36196d3;
        q61Var.h();
        boolean z4 = false;
        if (!q61Var.f37638t1) {
            int I0 = q61Var.f37625o0.I0();
            ArrayList arrayList = q61Var.A0;
            SparseIntArray sparseIntArray = q61Var.f37637t0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || q61Var.f37652z0) {
                    i15 = arrayList.size() + (q61Var.K0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > q61Var.F0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            vxVar = (org.telegram.ui.Components.vx) q61Var.J0.get(valueAt);
                        } else {
                            vxVar = null;
                        }
                        if (vxVar != null) {
                            boolean z10 = vxVar.h;
                            int size = vxVar.f30101c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.xv xvVar = q61Var.f37595a0;
                                if (xvVar.f30739y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (xvVar.B != null && xvVar.V) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                xvVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    q61Var.f37595a0.j(0, true);
                }
            }
        }
        q61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(q61Var.f37598b0, (q61Var.f37605e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        q61Var.m();
    }
}
