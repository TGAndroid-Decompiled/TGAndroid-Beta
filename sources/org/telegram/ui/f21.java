package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class f21 extends org.telegram.ui.Components.mv {
    public final int f37161g0;
    public final i31 f37162h0;

    public f21(i31 i31Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11, int i10, t11 t11Var, int i11, int i12) {
        super(context, p6Var, z10, z11, false, true, i10, t11Var, i11, false);
        this.f37162h0 = i31Var;
        this.f37161g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f37162h0.f38136k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        x21 x21Var;
        int i13;
        int i14;
        i31 i31Var = this.f37162h0;
        SparseIntArray sparseIntArray = i31Var.f38164x0;
        int i15 = 0;
        if (i31Var.f38165x1) {
            return false;
        }
        int i16 = this.f37161g0;
        if (i16 == 4 && i10 == 0) {
            i31Var.Q = !i31Var.Q;
            i31Var.f38120d0.setVisibility(8);
            org.telegram.ui.Components.mv mvVar = i31Var.f38118c0[i31Var.Q ? 1 : 0];
            i31Var.f38120d0 = mvVar;
            mvVar.setVisibility(0);
            org.telegram.ui.Components.iv ivVar = i31Var.f38120d0.f28609y;
            Context context = getContext();
            if (i31Var.Q) {
                i13 = 2131232126;
            } else {
                i13 = 2131232125;
            }
            ivVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.iv ivVar2 = i31Var.f38120d0.f28609y;
            if (i31Var.Q) {
                i14 = 2131754756;
            } else {
                i14 = 2131751197;
            }
            ivVar2.setContentDescription(org.telegram.messenger.cd.L0(i14, null));
            i31Var.B(true, false, false);
            i31Var.f38149r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.iv ivVar3 = this.E;
        if (ivVar3 != null && this.f28601b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (ivVar3 != null && this.f28601b0 && i10 == 1) {
            i12 = i31Var.f38139n;
        } else {
            if ((i16 != 4 || i10 != 0) && i10 > 0) {
                int i18 = i10 - i17;
                if (sparseIntArray.indexOfKey(i18) >= 0) {
                    i12 = sparseIntArray.get(i18);
                }
            }
            i12 = 0;
        }
        if (i16 == 6) {
            i15 = 7;
        }
        i31.a(i31Var, i12, org.telegram.messenger.i0.L(i15 - 2));
        i31Var.f38120d0.j(i10, true);
        i31Var.f38129h0.J1 = true;
        i31Var.v(null, true, true);
        a21 a21Var = i31Var.f38125f0;
        if (a21Var != null && (x21Var = a21Var.f35531n) != null) {
            x21Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.iv ivVar) {
        ValueAnimator valueAnimator = this.f37162h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        ivVar.setScaleX(0.0f);
        ivVar.setScaleY(0.0f);
    }
}
