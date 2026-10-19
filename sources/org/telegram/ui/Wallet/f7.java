package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class f7 extends f61 {
    public static final int f34209a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        g7 g7Var = (g7) view;
        t7 t7Var = g7Var.f34247p0;
        if (t7Var != null) {
            t7Var.h.remove(g7Var);
        }
        ValueAnimator valueAnimator = g7Var.f34250s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g7Var.f34248q0 = 1.0f;
        g7Var.f50269y.setAlpha(1.0f);
        g7Var.f34246o0 = (TL_wallet.nftItem) g61Var.G;
        g7Var.f34247p0 = (t7) g61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.f34246o0.gift;
        g7Var.j(false, true, 0.0f);
        g7Var.h(savedStarGift, true, false);
        t7 t7Var2 = g7Var.f34247p0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        ?? g1Var = new yh.g1(context, i10, d6Var);
        g1Var.f34248q0 = 1.0f;
        g1Var.setStateListAnimator(null);
        g1Var.setWillNotDraw(false);
        return g1Var;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) g61Var.G).address, ((TL_wallet.nftItem) g61Var2.G).address);
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
