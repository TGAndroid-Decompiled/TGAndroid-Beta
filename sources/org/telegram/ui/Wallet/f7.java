package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class f7 extends s61 {
    public static final int f36575a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        g7 g7Var = (g7) view;
        t7 t7Var = g7Var.f36603x0;
        if (t7Var != null) {
            t7Var.h.remove(g7Var);
        }
        ValueAnimator valueAnimator = g7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g7Var.f36604y0 = 1.0f;
        g7Var.f53010y.setAlpha(1.0f);
        g7Var.f36602w0 = (TL_wallet.nftItem) t61Var.G;
        g7Var.f36603x0 = (t7) t61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.f36602w0.gift;
        g7Var.k(false, true, 0.0f);
        g7Var.i(savedStarGift, true, false);
        t7 t7Var2 = g7Var.f36603x0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        ?? g1Var = new zh.g1(context, i10, u6Var);
        g1Var.f36604y0 = 1.0f;
        g1Var.setStateListAnimator(null);
        g1Var.setWillNotDraw(false);
        return g1Var;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) t61Var.G).address, ((TL_wallet.nftItem) t61Var2.G).address);
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
