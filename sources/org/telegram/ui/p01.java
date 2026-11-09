package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class p01 extends org.telegram.ui.Components.bv {
    public final int f48584g0;
    public final s11 f48585h0;

    public p01(s11 s11Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10, int i7, ax0 ax0Var, int i10, int i11) {
        super(context, g6Var, z9, z10, false, true, i7, ax0Var, i10, false);
        this.f48585h0 = s11Var;
        this.f48584g0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f48585h0.f49687k1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        h11 h11Var;
        int i12;
        int i13;
        s11 s11Var = this.f48585h0;
        SparseIntArray sparseIntArray = s11Var.f49714x0;
        int i14 = 0;
        if (s11Var.f49715x1) {
            return false;
        }
        int i15 = this.f48584g0;
        if (i15 == 4 && i7 == 0) {
            s11Var.Q = !s11Var.Q;
            s11Var.f49670d0.setVisibility(8);
            org.telegram.ui.Components.bv bvVar = s11Var.f49668c0[s11Var.Q ? 1 : 0];
            s11Var.f49670d0 = bvVar;
            bvVar.setVisibility(0);
            org.telegram.ui.Components.xu xuVar = s11Var.f49670d0.f32435y;
            Context context = getContext();
            if (s11Var.Q) {
                i12 = 2131232127;
            } else {
                i12 = 2131232126;
            }
            xuVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.xu xuVar2 = s11Var.f49670d0.f32435y;
            if (s11Var.Q) {
                i13 = 2131754756;
            } else {
                i13 = 2131751196;
            }
            xuVar2.setContentDescription(org.telegram.messenger.id.M0(i13, null));
            s11Var.B(true, false, false);
            s11Var.f49699r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.xu xuVar3 = this.E;
        if (xuVar3 != null && this.f32427b0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (xuVar3 != null && this.f32427b0 && i7 == 1) {
            i11 = s11Var.f49690n;
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
        s11.a(s11Var, i11, org.telegram.messenger.g0.L(i14 - 2));
        s11Var.f49670d0.j(i7, true);
        s11Var.f49680h0.J1 = true;
        s11Var.v(null, true, true);
        k01 k01Var = s11Var.f49676f0;
        if (k01Var != null && (h11Var = k01Var.f47149n) != null) {
            h11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.xu xuVar) {
        ValueAnimator valueAnimator = this.f48585h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        xuVar.setScaleX(0.0f);
        xuVar.setScaleY(0.0f);
    }
}
