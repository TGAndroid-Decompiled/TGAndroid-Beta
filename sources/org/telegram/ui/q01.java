package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class q01 extends org.telegram.ui.Components.av {
    public final int f48900g0;
    public final t11 f48901h0;

    public q01(t11 t11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10, int i7, rw0 rw0Var, int i10, int i11) {
        super(context, h6Var, z9, z10, false, true, i7, rw0Var, i10, false);
        this.f48901h0 = t11Var;
        this.f48900g0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f48901h0.f50043k1;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int i11;
        i11 i11Var;
        int i12;
        int i13;
        t11 t11Var = this.f48901h0;
        SparseIntArray sparseIntArray = t11Var.f50070x0;
        int i14 = 0;
        if (t11Var.f50071x1) {
            return false;
        }
        int i15 = this.f48900g0;
        if (i15 == 4 && i7 == 0) {
            t11Var.Q = !t11Var.Q;
            t11Var.f50026d0.setVisibility(8);
            org.telegram.ui.Components.av avVar = t11Var.f50024c0[t11Var.Q ? 1 : 0];
            t11Var.f50026d0 = avVar;
            avVar.setVisibility(0);
            org.telegram.ui.Components.wu wuVar = t11Var.f50026d0.f32018y;
            Context context = getContext();
            if (t11Var.Q) {
                i12 = 2131232127;
            } else {
                i12 = 2131232126;
            }
            wuVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.wu wuVar2 = t11Var.f50026d0.f32018y;
            if (t11Var.Q) {
                i13 = 2131754756;
            } else {
                i13 = 2131751196;
            }
            wuVar2.setContentDescription(org.telegram.messenger.id.M0(i13, null));
            t11Var.B(true, false, false);
            t11Var.f50055r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.wu wuVar3 = this.E;
        if (wuVar3 != null && this.f32010b0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (wuVar3 != null && this.f32010b0 && i7 == 1) {
            i11 = t11Var.f50046n;
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
        t11.a(t11Var, i11, org.telegram.messenger.g0.L(i14 - 2));
        t11Var.f50026d0.j(i7, true);
        t11Var.f50036h0.J1 = true;
        t11Var.v(null, true, true);
        l01 l01Var = t11Var.f50032f0;
        if (l01Var != null && (i11Var = l01Var.f47478n) != null) {
            i11Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.wu wuVar) {
        ValueAnimator valueAnimator = this.f48901h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        wuVar.setScaleX(0.0f);
        wuVar.setScaleY(0.0f);
    }
}
