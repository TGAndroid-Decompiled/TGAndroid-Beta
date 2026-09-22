package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d61 extends org.telegram.ui.Components.cw {
    public final int f32950g0;
    public final h71 f32951h0;

    public d61(h71 h71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i10, iy0 iy0Var, int i11, int i12) {
        super(context, e6Var, z10, z11, false, true, i10, iy0Var, i11, false);
        this.f32951h0 = h71Var;
        this.f32950g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f32951h0.f34139k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        v61 v61Var;
        int i13;
        int i14;
        h71 h71Var = this.f32951h0;
        SparseIntArray sparseIntArray = h71Var.f34167x0;
        int i15 = 0;
        if (h71Var.f34165w1) {
            return false;
        }
        int i16 = this.f32950g0;
        if (i16 == 4 && i10 == 0) {
            h71Var.Q = !h71Var.Q;
            h71Var.f34123d0.setVisibility(8);
            org.telegram.ui.Components.cw cwVar = h71Var.f34121c0[h71Var.Q ? 1 : 0];
            h71Var.f34123d0 = cwVar;
            cwVar.setVisibility(0);
            org.telegram.ui.Components.yv yvVar = h71Var.f34123d0.f23153x;
            Context context = getContext();
            if (h71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            yvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.yv yvVar2 = h71Var.f34123d0.f23153x;
            if (h71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            yvVar2.setContentDescription(LocaleController.getString(i14));
            h71Var.B(true, false, false);
            h71Var.f34152r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.yv yvVar3 = this.E;
        if (yvVar3 != null && this.f23146b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (yvVar3 != null && this.f23146b0 && i10 == 1) {
            i12 = h71Var.f34142n;
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
        h71.a(h71Var, i12, AndroidUtilities.dp(i15 - 2));
        h71Var.f34123d0.j(i10, true);
        h71Var.f34132h0.L1 = true;
        h71Var.v(null, true, true);
        y51 y51Var = h71Var.f34128f0;
        if (y51Var != null && (v61Var = y51Var.f38706n) != null) {
            v61Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.yv yvVar) {
        ValueAnimator valueAnimator = this.f32951h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        yvVar.setScaleX(0.0f);
        yvVar.setScaleY(0.0f);
    }
}
