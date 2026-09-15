package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c61 extends org.telegram.ui.Components.cw {
    public final int f32685g0;
    public final g71 f32686h0;

    public c61(g71 g71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i10, iy0 iy0Var, int i11, int i12) {
        super(context, e6Var, z10, z11, false, true, i10, iy0Var, i11, false);
        this.f32686h0 = g71Var;
        this.f32685g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f32686h0.f33803k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        u61 u61Var;
        int i13;
        int i14;
        g71 g71Var = this.f32686h0;
        SparseIntArray sparseIntArray = g71Var.f33831x0;
        int i15 = 0;
        if (g71Var.f33829w1) {
            return false;
        }
        int i16 = this.f32685g0;
        if (i16 == 4 && i10 == 0) {
            g71Var.Q = !g71Var.Q;
            g71Var.f33787d0.setVisibility(8);
            org.telegram.ui.Components.cw cwVar = g71Var.f33785c0[g71Var.Q ? 1 : 0];
            g71Var.f33787d0 = cwVar;
            cwVar.setVisibility(0);
            org.telegram.ui.Components.yv yvVar = g71Var.f33787d0.f23154x;
            Context context = getContext();
            if (g71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            yvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.yv yvVar2 = g71Var.f33787d0.f23154x;
            if (g71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            yvVar2.setContentDescription(LocaleController.getString(i14));
            g71Var.B(true, false, false);
            g71Var.f33816r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.yv yvVar3 = this.E;
        if (yvVar3 != null && this.f23147b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (yvVar3 != null && this.f23147b0 && i10 == 1) {
            i12 = g71Var.f33806n;
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
        g71.a(g71Var, i12, AndroidUtilities.dp(i15 - 2));
        g71Var.f33787d0.j(i10, true);
        g71Var.f33796h0.L1 = true;
        g71Var.v(null, true, true);
        x51 x51Var = g71Var.f33792f0;
        if (x51Var != null && (u61Var = x51Var.f38376n) != null) {
            u61Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.yv yvVar) {
        ValueAnimator valueAnimator = this.f32686h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        yvVar.setScaleX(0.0f);
        yvVar.setScaleY(0.0f);
    }
}
