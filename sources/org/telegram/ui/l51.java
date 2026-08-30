package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l51 extends org.telegram.ui.Components.xv {
    public final int f35961d0;
    public final q61 f35962e0;

    public l51(q61 q61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, int i10, l01 l01Var, int i11, int i12) {
        super(context, f6Var, z4, z10, false, true, i10, l01Var, i11, false);
        this.f35962e0 = q61Var;
        this.f35961d0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f35962e0.f37613h1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        d61 d61Var;
        int i13;
        int i14;
        q61 q61Var = this.f35962e0;
        SparseIntArray sparseIntArray = q61Var.f37639u0;
        int i15 = 0;
        if (q61Var.f37638t1) {
            return false;
        }
        int i16 = this.f35961d0;
        if (i16 == 4 && i10 == 0) {
            q61Var.N = !q61Var.N;
            q61Var.f37595a0.setVisibility(8);
            org.telegram.ui.Components.xv xvVar = q61Var.W[q61Var.N ? 1 : 0];
            q61Var.f37595a0 = xvVar;
            xvVar.setVisibility(0);
            org.telegram.ui.Components.tv tvVar = q61Var.f37595a0.f30738x;
            Context context = getContext();
            if (q61Var.N) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            tvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.tv tvVar2 = q61Var.f37595a0.f30738x;
            if (q61Var.N) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            tvVar2.setContentDescription(LocaleController.getString(i14));
            q61Var.B(true, false, false);
            q61Var.f37625o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.tv tvVar3 = this.B;
        if (tvVar3 != null && this.V) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (tvVar3 != null && this.V && i10 == 1) {
            i12 = q61Var.f37622n;
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
        q61.a(q61Var, i12, AndroidUtilities.dp(i15 - 2));
        q61Var.f37595a0.j(i10, true);
        q61Var.f37605e0.I1 = true;
        q61Var.v(null, true, true);
        g51 g51Var = q61Var.f37601c0;
        if (g51Var != null && (d61Var = g51Var.f33906n) != null) {
            d61Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.tv tvVar) {
        ValueAnimator valueAnimator = this.f35962e0.R1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        tvVar.setScaleX(0.0f);
        tvVar.setScaleY(0.0f);
    }
}
