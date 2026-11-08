package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class n01 extends org.telegram.ui.Components.bv {
    public final int f47932g0;
    public final q11 f47933h0;

    public n01(q11 q11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10, int i7, by0 by0Var, int i10, int i11) {
        super(context, f6Var, z9, z10, false, true, i7, by0Var, i10, false);
        this.f47933h0 = q11Var;
        this.f47932g0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f47933h0.f49044k1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        f11 f11Var;
        int i12;
        int i13;
        q11 q11Var = this.f47933h0;
        SparseIntArray sparseIntArray = q11Var.f49071x0;
        int i14 = 0;
        if (q11Var.f49072x1) {
            return false;
        }
        int i15 = this.f47932g0;
        if (i15 == 4 && i7 == 0) {
            q11Var.Q = !q11Var.Q;
            q11Var.f49027d0.setVisibility(8);
            org.telegram.ui.Components.bv bvVar = q11Var.f49025c0[q11Var.Q ? 1 : 0];
            q11Var.f49027d0 = bvVar;
            bvVar.setVisibility(0);
            org.telegram.ui.Components.xu xuVar = q11Var.f49027d0.f32372y;
            Context context = getContext();
            if (q11Var.Q) {
                i12 = 2131232127;
            } else {
                i12 = 2131232126;
            }
            xuVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.xu xuVar2 = q11Var.f49027d0.f32372y;
            if (q11Var.Q) {
                i13 = 2131754756;
            } else {
                i13 = 2131751197;
            }
            xuVar2.setContentDescription(org.telegram.messenger.id.M0(i13, null));
            q11Var.B(true, false, false);
            q11Var.f49056r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.xu xuVar3 = this.E;
        if (xuVar3 != null && this.f32364b0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (xuVar3 != null && this.f32364b0 && i7 == 1) {
            i11 = q11Var.f49047n;
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
        q11Var.f49027d0.j(i7, true);
        q11Var.f49037h0.J1 = true;
        q11Var.v(null, true, true);
        i01 i01Var = q11Var.f49033f0;
        if (i01Var != null && (f11Var = i01Var.f46540n) != null) {
            f11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.xu xuVar) {
        ValueAnimator valueAnimator = this.f47933h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        xuVar.setScaleX(0.0f);
        xuVar.setScaleY(0.0f);
    }
}
