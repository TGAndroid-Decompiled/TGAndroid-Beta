package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n51 extends org.telegram.ui.Components.zv {
    public final int f39302d0;
    public final r61 f39303e0;

    public n51(r61 r61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, int i10, w01 w01Var, int i11, int i12) {
        super(context, g6Var, z4, z10, false, true, i10, w01Var, i11, false);
        this.f39303e0 = r61Var;
        this.f39302d0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f39303e0.f40799h1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        f61 f61Var;
        int i13;
        int i14;
        r61 r61Var = this.f39303e0;
        SparseIntArray sparseIntArray = r61Var.f40825u0;
        int i15 = 0;
        if (r61Var.f40824t1) {
            return false;
        }
        int i16 = this.f39302d0;
        if (i16 == 4 && i10 == 0) {
            r61Var.N = !r61Var.N;
            r61Var.f40780a0.setVisibility(8);
            org.telegram.ui.Components.zv zvVar = r61Var.W[r61Var.N ? 1 : 0];
            r61Var.f40780a0 = zvVar;
            zvVar.setVisibility(0);
            org.telegram.ui.Components.vv vvVar = r61Var.f40780a0.f34029x;
            Context context = getContext();
            if (r61Var.N) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            vvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.vv vvVar2 = r61Var.f40780a0.f34029x;
            if (r61Var.N) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            vvVar2.setContentDescription(LocaleController.getString(i14));
            r61Var.B(true, false, false);
            r61Var.f40811o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.vv vvVar3 = this.B;
        if (vvVar3 != null && this.V) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (vvVar3 != null && this.V && i10 == 1) {
            i12 = r61Var.f40808n;
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
        r61.a(r61Var, i12, AndroidUtilities.dp(i15 - 2));
        r61Var.f40780a0.j(i10, true);
        r61Var.f40791e0.I1 = true;
        r61Var.v(null, true, true);
        i51 i51Var = r61Var.f40786c0;
        if (i51Var != null && (f61Var = i51Var.f37099n) != null) {
            f61Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.vv vvVar) {
        ValueAnimator valueAnimator = this.f39303e0.R1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        vvVar.setScaleX(0.0f);
        vvVar.setScaleY(0.0f);
    }
}
