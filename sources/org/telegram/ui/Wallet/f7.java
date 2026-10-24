package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class f7 extends k61 {
    public static final int f34516a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        g7 g7Var = (g7) view;
        t7 t7Var = g7Var.f34548x0;
        if (t7Var != null) {
            t7Var.h.remove(g7Var);
        }
        ValueAnimator valueAnimator = g7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g7Var.f34549y0 = 1.0f;
        g7Var.f50731y.setAlpha(1.0f);
        g7Var.f34547w0 = (TL_wallet.nftItem) l61Var.G;
        g7Var.f34548x0 = (t7) l61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.f34547w0.gift;
        g7Var.k(false, true, 0.0f);
        g7Var.i(savedStarGift, true, false);
        t7 t7Var2 = g7Var.f34548x0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        ?? g1Var = new yh.g1(context, i10, g6Var);
        g1Var.f34549y0 = 1.0f;
        g1Var.setStateListAnimator(null);
        g1Var.setWillNotDraw(false);
        return g1Var;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) l61Var.G).address, ((TL_wallet.nftItem) l61Var2.G).address);
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
