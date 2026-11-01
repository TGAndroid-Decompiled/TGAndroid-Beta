package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class e21 extends j21 {
    public final int f36720m3;
    public final g31 f36721n3;

    public e21(g31 g31Var, Context context, int i10) {
        super(g31Var, context);
        this.f36721n3 = g31Var;
        this.f36720m3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        if (i10 == 0) {
            g31 g31Var = this.f36721n3;
            g31Var.f37341x1 = false;
            if (g31Var.f37287a != -1 && g31Var.f37301f0.getVisibility() == 0 && g31Var.f37301f0.getTranslationY() > (-org.telegram.messenger.i0.L(51.0f))) {
                if (g31Var.f37301f0.getTranslationY() > (-org.telegram.messenger.i0.L(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                g31.a(g31Var, i11, 0);
            }
        }
    }

    @Override
    public final void l0(int i10) {
        int i11;
        org.telegram.ui.Components.ix ixVar;
        int i12;
        int i13;
        g31 g31Var = this.f36721n3;
        g31Var.h();
        boolean z10 = false;
        if (!g31Var.f37341x1) {
            int I0 = g31Var.f37325r0.I0();
            ArrayList arrayList = g31Var.D0;
            SparseIntArray sparseIntArray = g31Var.f37337w0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || g31Var.C0) {
                    i14 = arrayList.size() + (g31Var.N0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > g31Var.I0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            ixVar = (org.telegram.ui.Components.ix) g31Var.M0.get(valueAt);
                        } else {
                            ixVar = null;
                        }
                        if (ixVar != null) {
                            boolean z11 = ixVar.h;
                            int size = ixVar.f27194c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.mv mvVar = g31Var.f37296d0;
                                if (mvVar.D != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (mvVar.E != null && mvVar.f28576b0) {
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
                    g31Var.f37296d0.j(0, true);
                }
            }
        }
        g31Var.C();
        z11 z11Var = g31Var.f37298e0;
        if (g31Var.f37305h0.computeVerticalScrollOffset() != 0 || (i11 = this.f36720m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) {
            z10 = true;
        }
        org.telegram.messenger.i0.Y3(z11Var, z10, 1.0f, true, true);
        g31Var.m();
    }
}
