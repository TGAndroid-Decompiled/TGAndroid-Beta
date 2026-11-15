package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class k01 extends org.telegram.ui.Components.gv {
    public final int f48536h0;
    public final n11 f48537i0;

    public k01(n11 n11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i7, fy0 fy0Var, int i10, int i11) {
        super(context, e6Var, z10, z11, false, true, i7, fy0Var, i10, false);
        this.f48537i0 = n11Var;
        this.f48536h0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f48537i0.l1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        c11 c11Var;
        int i12;
        int i13;
        n11 n11Var = this.f48537i0;
        SparseIntArray sparseIntArray = n11Var.f49421y0;
        int i14 = 0;
        if (n11Var.f49422y1) {
            return false;
        }
        int i15 = this.f48536h0;
        if (i15 == 4 && i7 == 0) {
            n11Var.R = !n11Var.R;
            n11Var.f49377e0.setVisibility(8);
            org.telegram.ui.Components.gv gvVar = n11Var.f49374d0[n11Var.R ? 1 : 0];
            n11Var.f49377e0 = gvVar;
            gvVar.setVisibility(0);
            org.telegram.ui.Components.cv cvVar = n11Var.f49377e0.f35073y;
            Context context = getContext();
            if (n11Var.R) {
                i12 = 2131232128;
            } else {
                i12 = 2131232127;
            }
            cvVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.cv cvVar2 = n11Var.f49377e0.f35073y;
            if (n11Var.R) {
                i13 = 2131754756;
            } else {
                i13 = 2131751196;
            }
            cvVar2.setContentDescription(org.telegram.messenger.hd.M0(i13, null));
            n11Var.B(true, false, false);
            n11Var.f49406s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.cv cvVar3 = this.F;
        if (cvVar3 != null && this.f35065c0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (cvVar3 != null && this.f35065c0 && i7 == 1) {
            i11 = n11Var.f49394n;
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
        n11.a(n11Var, i11, org.telegram.messenger.g0.L(i14 - 2));
        n11Var.f49377e0.j(i7, true);
        n11Var.f49386i0.K1 = true;
        n11Var.v(null, true, true);
        f01 f01Var = n11Var.f49382g0;
        if (f01Var != null && (c11Var = f01Var.f46958n) != null) {
            c11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.cv cvVar) {
        ValueAnimator valueAnimator = this.f48537i0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        cvVar.setScaleX(0.0f);
        cvVar.setScaleY(0.0f);
    }
}
