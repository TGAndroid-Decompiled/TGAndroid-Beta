package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class i7 extends e61 {
    public static final int f34325a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        j7 j7Var = (j7) view;
        w7 w7Var = j7Var.f34361p0;
        if (w7Var != null) {
            w7Var.h.remove(j7Var);
        }
        ValueAnimator valueAnimator = j7Var.f34364s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        j7Var.f34362q0 = 1.0f;
        j7Var.f50305y.setAlpha(1.0f);
        j7Var.f34360o0 = (TL_wallet.nftItem) f61Var.G;
        j7Var.f34361p0 = (w7) f61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = j7Var.f34360o0.gift;
        j7Var.j(false, true, 0.0f);
        j7Var.h(savedStarGift, true, false);
        w7 w7Var2 = j7Var.f34361p0;
        if (w7Var2 != null) {
            w7Var2.i(j7Var);
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        ?? h1Var = new yh.h1(context, i10, d6Var);
        h1Var.f34362q0 = 1.0f;
        h1Var.setStateListAnimator(null);
        return h1Var;
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) f61Var.G).address, ((TL_wallet.nftItem) f61Var2.G).address);
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
