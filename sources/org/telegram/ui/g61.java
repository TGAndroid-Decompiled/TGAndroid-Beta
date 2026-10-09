package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g61 extends org.telegram.ui.Components.sw {
    public final int f37895g0;
    public final k71 f37896h0;

    public g61(k71 k71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i10, n31 n31Var, int i11, int i12) {
        super(context, e6Var, z10, z11, false, true, i10, n31Var, i11, false);
        this.f37896h0 = k71Var;
        this.f37895g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f37896h0.f39137k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        y61 y61Var;
        int i13;
        int i14;
        k71 k71Var = this.f37896h0;
        SparseIntArray sparseIntArray = k71Var.f39165x0;
        int i15 = 0;
        if (k71Var.f39163w1) {
            return false;
        }
        int i16 = this.f37895g0;
        if (i16 == 4 && i10 == 0) {
            k71Var.Q = !k71Var.Q;
            k71Var.f39120d0.setVisibility(8);
            org.telegram.ui.Components.sw swVar = k71Var.f39118c0[k71Var.Q ? 1 : 0];
            k71Var.f39120d0 = swVar;
            swVar.setVisibility(0);
            org.telegram.ui.Components.ow owVar = k71Var.f39120d0.f30912x;
            Context context = getContext();
            if (k71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            owVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.ow owVar2 = k71Var.f39120d0.f30912x;
            if (k71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            owVar2.setContentDescription(LocaleController.getString(i14));
            k71Var.B(true, false, false);
            k71Var.f39150r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.ow owVar3 = this.E;
        if (owVar3 != null && this.f30905b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (owVar3 != null && this.f30905b0 && i10 == 1) {
            i12 = k71Var.f39140n;
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
        k71.a(k71Var, i12, AndroidUtilities.dp(i15 - 2));
        k71Var.f39120d0.j(i10, true);
        k71Var.f39130h0.J1 = true;
        k71Var.v(null, true, true);
        b61 b61Var = k71Var.f39126f0;
        if (b61Var != null && (y61Var = b61Var.f44495n) != null) {
            y61Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.ow owVar) {
        ValueAnimator valueAnimator = this.f37896h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        owVar.setScaleX(0.0f);
        owVar.setScaleY(0.0f);
    }
}
