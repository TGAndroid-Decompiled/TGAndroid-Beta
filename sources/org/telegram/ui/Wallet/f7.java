package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class f7 extends g61 {
    public static final int f34217a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        g7 g7Var = (g7) view;
        t7 t7Var = g7Var.f34255p0;
        if (t7Var != null) {
            t7Var.h.remove(g7Var);
        }
        ValueAnimator valueAnimator = g7Var.f34258s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g7Var.f34256q0 = 1.0f;
        g7Var.f50276y.setAlpha(1.0f);
        g7Var.f34254o0 = (TL_wallet.nftItem) h61Var.G;
        g7Var.f34255p0 = (t7) h61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.f34254o0.gift;
        g7Var.j(false, true, 0.0f);
        g7Var.h(savedStarGift, true, false);
        t7 t7Var2 = g7Var.f34255p0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        ?? g1Var = new yh.g1(context, i10, d6Var);
        g1Var.f34256q0 = 1.0f;
        g1Var.setStateListAnimator(null);
        g1Var.setWillNotDraw(false);
        return g1Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) h61Var.G).address, ((TL_wallet.nftItem) h61Var2.G).address);
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
