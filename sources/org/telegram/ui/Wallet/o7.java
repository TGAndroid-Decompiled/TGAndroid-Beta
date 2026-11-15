package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class o7 extends a41 {
    public static final int f44269b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        p7 p7Var = (p7) view;
        c8 c8Var = p7Var.f44329y0;
        if (c8Var != null) {
            c8Var.h.remove(p7Var);
        }
        ValueAnimator valueAnimator = p7Var.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        p7Var.f44330z0 = 1.0f;
        p7Var.E.setAlpha(1.0f);
        p7Var.f44328x0 = (TL_wallet.nftItem) b41Var.G;
        p7Var.f44329y0 = (c8) b41Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = p7Var.f44328x0.gift;
        p7Var.k(false, true, 0.0f);
        p7Var.i(savedStarGift, true, false);
        c8 c8Var2 = p7Var.f44329y0;
        if (c8Var2 != null) {
            c8Var2.i(p7Var);
        }
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        ?? i2Var = new bi.i2(i7, context, e6Var);
        i2Var.f44330z0 = 1.0f;
        i2Var.setStateListAnimator(null);
        i2Var.setWillNotDraw(false);
        return i2Var;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) b41Var.G).address, ((TL_wallet.nftItem) b41Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
