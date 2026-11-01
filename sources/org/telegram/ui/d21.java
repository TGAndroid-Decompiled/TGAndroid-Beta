package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class d21 extends org.telegram.ui.Components.mv {
    public final int f36469g0;
    public final g31 f36470h0;

    public d21(g31 g31Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11, int i10, y01 y01Var, int i11, int i12) {
        super(context, p6Var, z10, z11, false, true, i10, y01Var, i11, false);
        this.f36470h0 = g31Var;
        this.f36469g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f36470h0.f37312k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        v21 v21Var;
        int i13;
        int i14;
        g31 g31Var = this.f36470h0;
        SparseIntArray sparseIntArray = g31Var.f37340x0;
        int i15 = 0;
        if (g31Var.f37341x1) {
            return false;
        }
        int i16 = this.f36469g0;
        if (i16 == 4 && i10 == 0) {
            g31Var.Q = !g31Var.Q;
            g31Var.f37296d0.setVisibility(8);
            org.telegram.ui.Components.mv mvVar = g31Var.f37294c0[g31Var.Q ? 1 : 0];
            g31Var.f37296d0 = mvVar;
            mvVar.setVisibility(0);
            org.telegram.ui.Components.iv ivVar = g31Var.f37296d0.f28584y;
            Context context = getContext();
            if (g31Var.Q) {
                i13 = 2131232126;
            } else {
                i13 = 2131232125;
            }
            ivVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.iv ivVar2 = g31Var.f37296d0.f28584y;
            if (g31Var.Q) {
                i14 = 2131754756;
            } else {
                i14 = 2131751197;
            }
            ivVar2.setContentDescription(org.telegram.messenger.dd.L0(i14, null));
            g31Var.B(true, false, false);
            g31Var.f37325r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.iv ivVar3 = this.E;
        if (ivVar3 != null && this.f28576b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (ivVar3 != null && this.f28576b0 && i10 == 1) {
            i12 = g31Var.f37315n;
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
        g31.a(g31Var, i12, org.telegram.messenger.i0.L(i15 - 2));
        g31Var.f37296d0.j(i10, true);
        g31Var.f37305h0.J1 = true;
        g31Var.v(null, true, true);
        y11 y11Var = g31Var.f37301f0;
        if (y11Var != null && (v21Var = y11Var.f43536n) != null) {
            v21Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.iv ivVar) {
        ValueAnimator valueAnimator = this.f36470h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        ivVar.setScaleX(0.0f);
        ivVar.setScaleY(0.0f);
    }
}
