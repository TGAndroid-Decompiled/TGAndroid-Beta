package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f61 extends org.telegram.ui.Components.bw {
    public final int f36276g0;
    public final j71 f36277h0;

    public f61(j71 j71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, rx0 rx0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, rx0Var, i11, false);
        this.f36277h0 = j71Var;
        this.f36276g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f36277h0.f37654k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        x61 x61Var;
        int i13;
        int i14;
        j71 j71Var = this.f36277h0;
        SparseIntArray sparseIntArray = j71Var.f37682x0;
        int i15 = 0;
        if (j71Var.f37680w1) {
            return false;
        }
        int i16 = this.f36276g0;
        if (i16 == 4 && i10 == 0) {
            j71Var.Q = !j71Var.Q;
            j71Var.f37637d0.setVisibility(8);
            org.telegram.ui.Components.bw bwVar = j71Var.f37635c0[j71Var.Q ? 1 : 0];
            j71Var.f37637d0 = bwVar;
            bwVar.setVisibility(0);
            org.telegram.ui.Components.xv xvVar = j71Var.f37637d0.f24815x;
            Context context = getContext();
            if (j71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            xvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.xv xvVar2 = j71Var.f37637d0.f24815x;
            if (j71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            xvVar2.setContentDescription(LocaleController.getString(i14));
            j71Var.B(true, false, false);
            j71Var.f37667r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.xv xvVar3 = this.E;
        if (xvVar3 != null && this.f24808b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (xvVar3 != null && this.f24808b0 && i10 == 1) {
            i12 = j71Var.f37657n;
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
        j71Var.f37637d0.j(i10, true);
        j71Var.f37647h0.L1 = true;
        j71Var.v(null, true, true);
        a61 a61Var = j71Var.f37643f0;
        if (a61Var != null && (x61Var = a61Var.f43006n) != null) {
            x61Var.E1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.xv xvVar) {
        ValueAnimator valueAnimator = this.f36277h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        xvVar.setScaleX(0.0f);
        xvVar.setScaleY(0.0f);
    }
}
