package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class n01 extends org.telegram.ui.Components.av {
    public final int f47907g0;
    public final q11 f47908h0;

    public n01(q11 q11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10, int i7, by0 by0Var, int i10, int i11) {
        super(context, f6Var, z9, z10, false, true, i7, by0Var, i10, false);
        this.f47908h0 = q11Var;
        this.f47907g0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f47908h0.f49015k1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        f11 f11Var;
        int i12;
        int i13;
        q11 q11Var = this.f47908h0;
        SparseIntArray sparseIntArray = q11Var.f49042x0;
        int i14 = 0;
        if (q11Var.f49043x1) {
            return false;
        }
        int i15 = this.f47907g0;
        if (i15 == 4 && i7 == 0) {
            q11Var.Q = !q11Var.Q;
            q11Var.f48998d0.setVisibility(8);
            org.telegram.ui.Components.av avVar = q11Var.f48996c0[q11Var.Q ? 1 : 0];
            q11Var.f48998d0 = avVar;
            avVar.setVisibility(0);
            org.telegram.ui.Components.wu wuVar = q11Var.f48998d0.f31913y;
            Context context = getContext();
            if (q11Var.Q) {
                i12 = 2131232127;
            } else {
                i12 = 2131232126;
            }
            wuVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.wu wuVar2 = q11Var.f48998d0.f31913y;
            if (q11Var.Q) {
                i13 = 2131754756;
            } else {
                i13 = 2131751197;
            }
            wuVar2.setContentDescription(org.telegram.messenger.hd.M0(i13, null));
            q11Var.B(true, false, false);
            q11Var.f49027r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.wu wuVar3 = this.E;
        if (wuVar3 != null && this.f31905b0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (wuVar3 != null && this.f31905b0 && i7 == 1) {
            i11 = q11Var.f49018n;
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
        q11Var.f48998d0.j(i7, true);
        q11Var.f49008h0.J1 = true;
        q11Var.v(null, true, true);
        i01 i01Var = q11Var.f49004f0;
        if (i01Var != null && (f11Var = i01Var.f46533n) != null) {
            f11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.wu wuVar) {
        ValueAnimator valueAnimator = this.f47908h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        wuVar.setScaleX(0.0f);
        wuVar.setScaleY(0.0f);
    }
}
