package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class m7 extends x31 {
    public static final int f42816b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        n7 n7Var = (n7) view;
        a8 a8Var = n7Var.f42895x0;
        if (a8Var != null) {
            a8Var.h.remove(n7Var);
        }
        ValueAnimator valueAnimator = n7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n7Var.f42896y0 = 1.0f;
        n7Var.D.setAlpha(1.0f);
        n7Var.f42894w0 = (TL_wallet.nftItem) y31Var.G;
        n7Var.f42895x0 = (a8) y31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = n7Var.f42894w0.gift;
        n7Var.k(false, true, 0.0f);
        n7Var.i(savedStarGift, true, false);
        a8 a8Var2 = n7Var.f42895x0;
        if (a8Var2 != null) {
            a8Var2.i(n7Var);
        }
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        ?? y0Var = new zh.y0(i7, context, g6Var);
        y0Var.f42896y0 = 1.0f;
        y0Var.setStateListAnimator(null);
        y0Var.setWillNotDraw(false);
        return y0Var;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) y31Var.G).address, ((TL_wallet.nftItem) y31Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
