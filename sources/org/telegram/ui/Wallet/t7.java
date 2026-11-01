package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class t7 extends a51 {
    public static final int f35252b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        u7 u7Var = (u7) view;
        h8 h8Var = u7Var.f35284x0;
        if (h8Var != null) {
            h8Var.h.remove(u7Var);
        }
        ValueAnimator valueAnimator = u7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u7Var.f35285y0 = 1.0f;
        u7Var.D.setAlpha(1.0f);
        u7Var.f35283w0 = (TL_wallet.nftItem) b51Var.G;
        u7Var.f35284x0 = (h8) b51Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = u7Var.f35283w0.gift;
        u7Var.k(false, true, 0.0f);
        u7Var.i(savedStarGift, true, false);
        h8 h8Var2 = u7Var.f35284x0;
        if (h8Var2 != null) {
            h8Var2.i(u7Var);
        }
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        ?? c1Var = new ph.c1(i10, context, p6Var);
        c1Var.f35285y0 = 1.0f;
        c1Var.setStateListAnimator(null);
        c1Var.setWillNotDraw(false);
        return c1Var;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) b51Var.G).address, ((TL_wallet.nftItem) b51Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
