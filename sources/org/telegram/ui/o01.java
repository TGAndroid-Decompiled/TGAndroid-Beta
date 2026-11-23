package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class o01 extends org.telegram.ui.Components.nv {
    public final int f50389h0;
    public final r11 f50390i0;

    public o01(r11 r11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11, int i7, ur0 ur0Var, int i10, int i11) {
        super(context, h6Var, z10, z11, false, true, i7, ur0Var, i10, false);
        this.f50390i0 = r11Var;
        this.f50389h0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f50390i0.l1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        g11 g11Var;
        int i12;
        int i13;
        r11 r11Var = this.f50390i0;
        SparseIntArray sparseIntArray = r11Var.f51457y0;
        int i14 = 0;
        if (r11Var.f51458y1) {
            return false;
        }
        int i15 = this.f50389h0;
        if (i15 == 4 && i7 == 0) {
            r11Var.R = !r11Var.R;
            r11Var.f51413e0.setVisibility(8);
            org.telegram.ui.Components.nv nvVar = r11Var.f51410d0[r11Var.R ? 1 : 0];
            r11Var.f51413e0 = nvVar;
            nvVar.setVisibility(0);
            org.telegram.ui.Components.jv jvVar = r11Var.f51413e0.f37958y;
            Context context = getContext();
            if (r11Var.R) {
                i12 = 2131232129;
            } else {
                i12 = 2131232128;
            }
            jvVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.jv jvVar2 = r11Var.f51413e0.f37958y;
            if (r11Var.R) {
                i13 = 2131754755;
            } else {
                i13 = 2131751184;
            }
            jvVar2.setContentDescription(org.telegram.messenger.hd.N0(i13, null));
            r11Var.B(true, false, false);
            r11Var.f51442s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.jv jvVar3 = this.F;
        if (jvVar3 != null && this.f37950c0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (jvVar3 != null && this.f37950c0 && i7 == 1) {
            i11 = r11Var.f51430n;
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
        r11.a(r11Var, i11, org.telegram.messenger.g0.L(i14 - 2));
        r11Var.f51413e0.j(i7, true);
        r11Var.f51422i0.K1 = true;
        r11Var.v(null, true, true);
        j01 j01Var = r11Var.f51418g0;
        if (j01Var != null && (g11Var = j01Var.f48866n) != null) {
            g11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.jv jvVar) {
        ValueAnimator valueAnimator = this.f50390i0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        jvVar.setScaleX(0.0f);
        jvVar.setScaleY(0.0f);
    }
}
