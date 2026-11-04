package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class d01 extends org.telegram.ui.Components.zu {
    public final int f44513h0;
    public final g11 f44514i0;

    public d01(g11 g11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i3, qv0 qv0Var, int i10, int i11) {
        super(context, e6Var, z10, z11, false, true, i3, qv0Var, i10, false);
        this.f44514i0 = g11Var;
        this.f44513h0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f44514i0.f45462l1;
    }

    @Override
    public final boolean h(int i3) {
        int i10;
        int i11;
        v01 v01Var;
        int i12;
        int i13;
        g11 g11Var = this.f44514i0;
        SparseIntArray sparseIntArray = g11Var.f45491y0;
        int i14 = 0;
        if (g11Var.f45492y1) {
            return false;
        }
        int i15 = this.f44513h0;
        if (i15 == 4 && i3 == 0) {
            g11Var.R = !g11Var.R;
            g11Var.f45447e0.setVisibility(8);
            org.telegram.ui.Components.zu zuVar = g11Var.f45444d0[g11Var.R ? 1 : 0];
            g11Var.f45447e0 = zuVar;
            zuVar.setVisibility(0);
            org.telegram.ui.Components.vu vuVar = g11Var.f45447e0.f41124y;
            Context context = getContext();
            if (g11Var.R) {
                i12 = 2131232127;
            } else {
                i12 = 2131232126;
            }
            vuVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.vu vuVar2 = g11Var.f45447e0.f41124y;
            if (g11Var.R) {
                i13 = 2131754756;
            } else {
                i13 = 2131751197;
            }
            vuVar2.setContentDescription(org.telegram.messenger.bd.M0(i13, null));
            g11Var.B(true, false, false);
            g11Var.f45476s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.vu vuVar3 = this.F;
        if (vuVar3 != null && this.f41116c0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (vuVar3 != null && this.f41116c0 && i3 == 1) {
            i11 = g11Var.f45463n;
        } else {
            if ((i15 != 4 || i3 != 0) && i3 > 0) {
                int i17 = i3 - i16;
                if (sparseIntArray.indexOfKey(i17) >= 0) {
                    i11 = sparseIntArray.get(i17);
                }
            }
            i11 = 0;
        }
        if (i15 == 6) {
            i14 = 7;
        }
        g11.a(g11Var, i11, org.telegram.messenger.g0.L(i14 - 2));
        g11Var.f45447e0.j(i3, true);
        g11Var.f45456i0.K1 = true;
        g11Var.v(null, true, true);
        yz0 yz0Var = g11Var.f45452g0;
        if (yz0Var != null && (v01Var = yz0Var.f52470n) != null) {
            v01Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.vu vuVar) {
        ValueAnimator valueAnimator = this.f44514i0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        vuVar.setScaleX(0.0f);
        vuVar.setScaleY(0.0f);
    }
}
