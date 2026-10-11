package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f61 extends org.telegram.ui.Components.tw {
    public final int f37591g0;
    public final j71 f37592h0;

    public f61(j71 j71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, m31 m31Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, m31Var, i11, false);
        this.f37592h0 = j71Var;
        this.f37591g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f37592h0.f38935k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        x61 x61Var;
        int i13;
        int i14;
        j71 j71Var = this.f37592h0;
        SparseIntArray sparseIntArray = j71Var.f38963x0;
        int i15 = 0;
        if (j71Var.f38961w1) {
            return false;
        }
        int i16 = this.f37591g0;
        if (i16 == 4 && i10 == 0) {
            j71Var.Q = !j71Var.Q;
            j71Var.f38918d0.setVisibility(8);
            org.telegram.ui.Components.tw twVar = j71Var.f38916c0[j71Var.Q ? 1 : 0];
            j71Var.f38918d0 = twVar;
            twVar.setVisibility(0);
            org.telegram.ui.Components.pw pwVar = j71Var.f38918d0.f31357x;
            Context context = getContext();
            if (j71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            pwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.pw pwVar2 = j71Var.f38918d0.f31357x;
            if (j71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            pwVar2.setContentDescription(LocaleController.getString(i14));
            j71Var.B(true, false, false);
            j71Var.f38948r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.pw pwVar3 = this.E;
        if (pwVar3 != null && this.f31350b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (pwVar3 != null && this.f31350b0 && i10 == 1) {
            i12 = j71Var.f38938n;
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
        j71.a(j71Var, i12, AndroidUtilities.dp(i15 - 2));
        j71Var.f38918d0.j(i10, true);
        j71Var.f38928h0.J1 = true;
        j71Var.v(null, true, true);
        a61 a61Var = j71Var.f38924f0;
        if (a61Var != null && (x61Var = a61Var.f44301n) != null) {
            x61Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.pw pwVar) {
        ValueAnimator valueAnimator = this.f37592h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        pwVar.setScaleX(0.0f);
        pwVar.setScaleY(0.0f);
    }
}
