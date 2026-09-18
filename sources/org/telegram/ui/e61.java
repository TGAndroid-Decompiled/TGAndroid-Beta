package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e61 extends org.telegram.ui.Components.cw {
    public final int f33303g0;
    public final i71 f33304h0;

    public e61(i71 i71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, ky0 ky0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, ky0Var, i11, false);
        this.f33304h0 = i71Var;
        this.f33303g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f33304h0.f34473k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        w61 w61Var;
        int i13;
        int i14;
        i71 i71Var = this.f33304h0;
        SparseIntArray sparseIntArray = i71Var.f34501x0;
        int i15 = 0;
        if (i71Var.f34499w1) {
            return false;
        }
        int i16 = this.f33303g0;
        if (i16 == 4 && i10 == 0) {
            i71Var.Q = !i71Var.Q;
            i71Var.f34457d0.setVisibility(8);
            org.telegram.ui.Components.cw cwVar = i71Var.f34455c0[i71Var.Q ? 1 : 0];
            i71Var.f34457d0 = cwVar;
            cwVar.setVisibility(0);
            org.telegram.ui.Components.yv yvVar = i71Var.f34457d0.f23147x;
            Context context = getContext();
            if (i71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            yvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.yv yvVar2 = i71Var.f34457d0.f23147x;
            if (i71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            yvVar2.setContentDescription(LocaleController.getString(i14));
            i71Var.B(true, false, false);
            i71Var.f34486r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.yv yvVar3 = this.E;
        if (yvVar3 != null && this.f23140b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (yvVar3 != null && this.f23140b0 && i10 == 1) {
            i12 = i71Var.f34476n;
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
        i71.a(i71Var, i12, AndroidUtilities.dp(i15 - 2));
        i71Var.f34457d0.j(i10, true);
        i71Var.f34466h0.L1 = true;
        i71Var.v(null, true, true);
        z51 z51Var = i71Var.f34462f0;
        if (z51Var != null && (w61Var = z51Var.f39399n) != null) {
            w61Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.yv yvVar) {
        ValueAnimator valueAnimator = this.f33304h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        yvVar.setScaleX(0.0f);
        yvVar.setScaleY(0.0f);
    }
}
