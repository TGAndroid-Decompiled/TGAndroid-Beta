package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class n01 extends org.telegram.ui.Components.lv {
    public final int f50168h0;
    public final q11 f50169i0;

    public n01(q11 q11Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11, int i7, iy0 iy0Var, int i10, int i11) {
        super(context, i6Var, z10, z11, false, true, i7, iy0Var, i10, false);
        this.f50169i0 = q11Var;
        this.f50168h0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f50169i0.l1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        f11 f11Var;
        int i12;
        int i13;
        q11 q11Var = this.f50169i0;
        SparseIntArray sparseIntArray = q11Var.f51282y0;
        int i14 = 0;
        if (q11Var.f51283y1) {
            return false;
        }
        int i15 = this.f50168h0;
        if (i15 == 4 && i7 == 0) {
            q11Var.R = !q11Var.R;
            q11Var.f51238e0.setVisibility(8);
            org.telegram.ui.Components.lv lvVar = q11Var.f51235d0[q11Var.R ? 1 : 0];
            q11Var.f51238e0 = lvVar;
            lvVar.setVisibility(0);
            org.telegram.ui.Components.hv hvVar = q11Var.f51238e0.f37241y;
            Context context = getContext();
            if (q11Var.R) {
                i12 = 2131232132;
            } else {
                i12 = 2131232131;
            }
            hvVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.hv hvVar2 = q11Var.f51238e0.f37241y;
            if (q11Var.R) {
                i13 = 2131754755;
            } else {
                i13 = 2131751184;
            }
            hvVar2.setContentDescription(org.telegram.messenger.gd.N0(i13, null));
            q11Var.B(true, false, false);
            q11Var.f51267s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.hv hvVar3 = this.F;
        if (hvVar3 != null && this.f37233c0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (hvVar3 != null && this.f37233c0 && i7 == 1) {
            i11 = q11Var.f51255n;
        } else {
            if ((i15 != 4 || i7 != 0) && i7 > 0) {
                int i17 = i7 - i16;
                if (sparseIntArray.indexOfKey(i17) >= 0) {
                    i11 = sparseIntArray.get(i17);
                }
            }
            i11 = 0;
        }
        if (i15 == 6) {
            i14 = 7;
        }
        q11.a(q11Var, i11, org.telegram.messenger.g0.L(i14 - 2));
        q11Var.f51238e0.j(i7, true);
        q11Var.f51247i0.K1 = true;
        q11Var.v(null, true, true);
        i01 i01Var = q11Var.f51243g0;
        if (i01Var != null && (f11Var = i01Var.f48682n) != null) {
            f11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.hv hvVar) {
        ValueAnimator valueAnimator = this.f50169i0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        hvVar.setScaleX(0.0f);
        hvVar.setScaleY(0.0f);
    }
}
