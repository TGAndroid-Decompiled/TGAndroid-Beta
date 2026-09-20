package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f61 extends org.telegram.ui.Components.dw {
    public final int f33515g0;
    public final j71 f33516h0;

    public f61(j71 j71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, rx0 rx0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, rx0Var, i11, false);
        this.f33516h0 = j71Var;
        this.f33515g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f33516h0.f34799k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        x61 x61Var;
        int i13;
        int i14;
        j71 j71Var = this.f33516h0;
        SparseIntArray sparseIntArray = j71Var.f34827x0;
        int i15 = 0;
        if (j71Var.f34825w1) {
            return false;
        }
        int i16 = this.f33515g0;
        if (i16 == 4 && i10 == 0) {
            j71Var.Q = !j71Var.Q;
            j71Var.f34783d0.setVisibility(8);
            org.telegram.ui.Components.dw dwVar = j71Var.f34781c0[j71Var.Q ? 1 : 0];
            j71Var.f34783d0 = dwVar;
            dwVar.setVisibility(0);
            org.telegram.ui.Components.zv zvVar = j71Var.f34783d0.f23658x;
            Context context = getContext();
            if (j71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            zvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.zv zvVar2 = j71Var.f34783d0.f23658x;
            if (j71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            zvVar2.setContentDescription(LocaleController.getString(i14));
            j71Var.B(true, false, false);
            j71Var.f34812r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.zv zvVar3 = this.E;
        if (zvVar3 != null && this.f23651b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (zvVar3 != null && this.f23651b0 && i10 == 1) {
            i12 = j71Var.f34802n;
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
        j71Var.f34783d0.j(i10, true);
        j71Var.f34792h0.L1 = true;
        j71Var.v(null, true, true);
        a61 a61Var = j71Var.f34788f0;
        if (a61Var != null && (x61Var = a61Var.f39809n) != null) {
            x61Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.zv zvVar) {
        ValueAnimator valueAnimator = this.f33516h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        zvVar.setScaleX(0.0f);
        zvVar.setScaleY(0.0f);
    }
}
