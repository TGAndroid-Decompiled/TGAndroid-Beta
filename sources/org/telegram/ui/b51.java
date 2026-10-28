package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b51 extends org.telegram.ui.Components.kw {
    public final int f37891g0;
    public final f61 f37892h0;

    public b51(f61 f61Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, int i10, by0 by0Var, int i11, int i12) {
        super(context, u6Var, z10, z11, false, true, i10, by0Var, i11, false);
        this.f37892h0 = f61Var;
        this.f37891g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f37892h0.f39209k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        t51 t51Var;
        int i13;
        int i14;
        f61 f61Var = this.f37892h0;
        SparseIntArray sparseIntArray = f61Var.f39237x0;
        int i15 = 0;
        if (f61Var.f39238x1) {
            return false;
        }
        int i16 = this.f37891g0;
        if (i16 == 4 && i10 == 0) {
            f61Var.Q = !f61Var.Q;
            f61Var.f39193d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = f61Var.f39191c0[f61Var.Q ? 1 : 0];
            f61Var.f39193d0 = kwVar;
            kwVar.setVisibility(0);
            org.telegram.ui.Components.gw gwVar = f61Var.f39193d0.f30044x;
            Context context = getContext();
            if (f61Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            gwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.gw gwVar2 = f61Var.f39193d0.f30044x;
            if (f61Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            gwVar2.setContentDescription(LocaleController.getString(i14));
            f61Var.B(true, false, false);
            f61Var.f39222r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar3 = this.E;
        if (gwVar3 != null && this.f30037b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (gwVar3 != null && this.f30037b0 && i10 == 1) {
            i12 = f61Var.f39212n;
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
        f61.a(f61Var, i12, AndroidUtilities.dp(i15 - 2));
        f61Var.f39193d0.j(i10, true);
        f61Var.f39202h0.J1 = true;
        f61Var.v(null, true, true);
        w41 w41Var = f61Var.f39198f0;
        if (w41Var != null && (t51Var = w41Var.f43883n) != null) {
            t51Var.L1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.f37892h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        gwVar.setScaleX(0.0f);
        gwVar.setScaleY(0.0f);
    }
}
