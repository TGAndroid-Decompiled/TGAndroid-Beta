package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class t7 extends z41 {
    public static final int f35250b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        u7 u7Var = (u7) view;
        h8 h8Var = u7Var.f35278x0;
        if (h8Var != null) {
            h8Var.h.remove(u7Var);
        }
        ValueAnimator valueAnimator = u7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u7Var.f35279y0 = 1.0f;
        u7Var.D.setAlpha(1.0f);
        u7Var.f35277w0 = (TL_wallet.nftItem) a51Var.G;
        u7Var.f35278x0 = (h8) a51Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = u7Var.f35277w0.gift;
        u7Var.k(false, true, 0.0f);
        u7Var.i(savedStarGift, true, false);
        h8 h8Var2 = u7Var.f35278x0;
        if (h8Var2 != null) {
            h8Var2.i(u7Var);
        }
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        ?? c1Var = new ph.c1(i10, context, p6Var);
        c1Var.f35279y0 = 1.0f;
        c1Var.setStateListAnimator(null);
        c1Var.setWillNotDraw(false);
        return c1Var;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) a51Var.G).address, ((TL_wallet.nftItem) a51Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
