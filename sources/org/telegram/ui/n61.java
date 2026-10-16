package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n61 extends org.telegram.ui.Components.ow {
    public final int f38265g0;
    public final r71 f38266h0;

    public n61(r71 r71Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, i11 i11Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, i11Var, i11, false);
        this.f38266h0 = r71Var;
        this.f38265g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f38266h0.f39337k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        f71 f71Var;
        int i13;
        int i14;
        r71 r71Var = this.f38266h0;
        SparseIntArray sparseIntArray = r71Var.f39365x0;
        int i15 = 0;
        if (r71Var.f39363w1) {
            return false;
        }
        int i16 = this.f38265g0;
        if (i16 == 4 && i10 == 0) {
            r71Var.Q = !r71Var.Q;
            r71Var.f39321d0.setVisibility(8);
            org.telegram.ui.Components.ow owVar = r71Var.f39319c0[r71Var.Q ? 1 : 0];
            r71Var.f39321d0 = owVar;
            owVar.setVisibility(0);
            org.telegram.ui.Components.kw kwVar = r71Var.f39321d0.f27760x;
            Context context = getContext();
            if (r71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            kwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.kw kwVar2 = r71Var.f39321d0.f27760x;
            if (r71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            kwVar2.setContentDescription(LocaleController.getString(i14));
            r71Var.B(true, false, false);
            r71Var.f39350r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.kw kwVar3 = this.E;
        if (kwVar3 != null && this.f27753b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (kwVar3 != null && this.f27753b0 && i10 == 1) {
            i12 = r71Var.f39340n;
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
        r71.a(r71Var, i12, AndroidUtilities.dp(i15 - 2));
        r71Var.f39321d0.j(i10, true);
        r71Var.f39330h0.J1 = true;
        r71Var.v(null, true, true);
        i61 i61Var = r71Var.f39326f0;
        if (i61Var != null && (f71Var = i61Var.f36088n) != null) {
            f71Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.kw kwVar) {
        ValueAnimator valueAnimator = this.f38266h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        kwVar.setScaleX(0.0f);
        kwVar.setScaleY(0.0f);
    }
}
