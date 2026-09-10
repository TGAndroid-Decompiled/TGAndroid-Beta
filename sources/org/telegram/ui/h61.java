package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h61 extends org.telegram.ui.Components.gw {
    public final int f33287g0;
    public final l71 f33288h0;

    public h61(l71 l71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, ey0 ey0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, ey0Var, i11, false);
        this.f33288h0 = l71Var;
        this.f33287g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f33288h0.f34577k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        z61 z61Var;
        int i13;
        int i14;
        l71 l71Var = this.f33288h0;
        SparseIntArray sparseIntArray = l71Var.f34605x0;
        int i15 = 0;
        if (l71Var.f34603w1) {
            return false;
        }
        int i16 = this.f33287g0;
        if (i16 == 4 && i10 == 0) {
            l71Var.Q = !l71Var.Q;
            l71Var.f34561d0.setVisibility(8);
            org.telegram.ui.Components.gw gwVar = l71Var.f34559c0[l71Var.Q ? 1 : 0];
            l71Var.f34561d0 = gwVar;
            gwVar.setVisibility(0);
            org.telegram.ui.Components.cw cwVar = l71Var.f34561d0.f23447x;
            Context context = getContext();
            if (l71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            cwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.cw cwVar2 = l71Var.f34561d0.f23447x;
            if (l71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            cwVar2.setContentDescription(LocaleController.getString(i14));
            l71Var.B(true, false, false);
            l71Var.f34590r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.cw cwVar3 = this.E;
        if (cwVar3 != null && this.f23440b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (cwVar3 != null && this.f23440b0 && i10 == 1) {
            i12 = l71Var.f34580n;
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
        l71.a(l71Var, i12, AndroidUtilities.dp(i15 - 2));
        l71Var.f34561d0.j(i10, true);
        l71Var.f34570h0.L1 = true;
        l71Var.v(null, true, true);
        c61 c61Var = l71Var.f34566f0;
        if (c61Var != null && (z61Var = c61Var.f30816n) != null) {
            z61Var.E1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.cw cwVar) {
        ValueAnimator valueAnimator = this.f33288h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        cwVar.setScaleX(0.0f);
        cwVar.setScaleY(0.0f);
    }
}
