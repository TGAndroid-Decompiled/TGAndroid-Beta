package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j61 extends org.telegram.ui.Components.vw {
    public final int f39106g0;
    public final n71 f39107h0;

    public j61(n71 n71Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, w31 w31Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, w31Var, i11, false);
        this.f39107h0 = n71Var;
        this.f39106g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f39107h0.f40279k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        b71 b71Var;
        int i13;
        int i14;
        n71 n71Var = this.f39107h0;
        SparseIntArray sparseIntArray = n71Var.f40307x0;
        int i15 = 0;
        if (n71Var.f40305w1) {
            return false;
        }
        int i16 = this.f39106g0;
        if (i16 == 4 && i10 == 0) {
            n71Var.Q = !n71Var.Q;
            n71Var.f40262d0.setVisibility(8);
            org.telegram.ui.Components.vw vwVar = n71Var.f40260c0[n71Var.Q ? 1 : 0];
            n71Var.f40262d0 = vwVar;
            vwVar.setVisibility(0);
            org.telegram.ui.Components.rw rwVar = n71Var.f40262d0.f32205x;
            Context context = getContext();
            if (n71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            rwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.rw rwVar2 = n71Var.f40262d0.f32205x;
            if (n71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            rwVar2.setContentDescription(LocaleController.getString(i14));
            n71Var.B(true, false, false);
            n71Var.f40292r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.rw rwVar3 = this.E;
        if (rwVar3 != null && this.f32198b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (rwVar3 != null && this.f32198b0 && i10 == 1) {
            i12 = n71Var.f40282n;
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
        n71.a(n71Var, i12, AndroidUtilities.dp(i15 - 2));
        n71Var.f40262d0.j(i10, true);
        n71Var.f40272h0.J1 = true;
        n71Var.v(null, true, true);
        e61 e61Var = n71Var.f40268f0;
        if (e61Var != null && (b71Var = e61Var.f36358n) != null) {
            b71Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.rw rwVar) {
        ValueAnimator valueAnimator = this.f39107h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        rwVar.setScaleX(0.0f);
        rwVar.setScaleY(0.0f);
    }
}
