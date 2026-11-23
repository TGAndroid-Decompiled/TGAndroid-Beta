package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class p01 extends org.telegram.ui.Components.ov {
    public final int f50698h0;
    public final s11 f50699i0;

    public p01(s11 s11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11, int i7, mz0 mz0Var, int i10, int i11) {
        super(context, h6Var, z10, z11, false, true, i7, mz0Var, i10, false);
        this.f50699i0 = s11Var;
        this.f50698h0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f50699i0.l1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        h11 h11Var;
        int i12;
        int i13;
        s11 s11Var = this.f50699i0;
        SparseIntArray sparseIntArray = s11Var.f51879y0;
        int i14 = 0;
        if (s11Var.f51880y1) {
            return false;
        }
        int i15 = this.f50698h0;
        if (i15 == 4 && i7 == 0) {
            s11Var.R = !s11Var.R;
            s11Var.f51835e0.setVisibility(8);
            org.telegram.ui.Components.ov ovVar = s11Var.f51832d0[s11Var.R ? 1 : 0];
            s11Var.f51835e0 = ovVar;
            ovVar.setVisibility(0);
            org.telegram.ui.Components.kv kvVar = s11Var.f51835e0.f38379y;
            Context context = getContext();
            if (s11Var.R) {
                i12 = 2131232129;
            } else {
                i12 = 2131232128;
            }
            kvVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.kv kvVar2 = s11Var.f51835e0.f38379y;
            if (s11Var.R) {
                i13 = 2131754755;
            } else {
                i13 = 2131751184;
            }
            kvVar2.setContentDescription(org.telegram.messenger.hd.N0(i13, null));
            s11Var.B(true, false, false);
            s11Var.f51864s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.kv kvVar3 = this.F;
        if (kvVar3 != null && this.f38371c0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (kvVar3 != null && this.f38371c0 && i7 == 1) {
            i11 = s11Var.f51852n;
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
        s11Var.f51835e0.j(i7, true);
        s11Var.f51844i0.K1 = true;
        s11Var.v(null, true, true);
        k01 k01Var = s11Var.f51840g0;
        if (k01Var != null && (h11Var = k01Var.f49165n) != null) {
            h11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.kv kvVar) {
        ValueAnimator valueAnimator = this.f50699i0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        kvVar.setScaleX(0.0f);
        kvVar.setScaleY(0.0f);
    }
}
