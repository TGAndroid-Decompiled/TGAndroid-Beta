package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class p7 extends w31 {
    public static final int f43011b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        q7 q7Var = (q7) view;
        d8 d8Var = q7Var.f43071x0;
        if (d8Var != null) {
            d8Var.h.remove(q7Var);
        }
        ValueAnimator valueAnimator = q7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        q7Var.f43072y0 = 1.0f;
        q7Var.D.setAlpha(1.0f);
        q7Var.f43070w0 = (TL_wallet.nftItem) x31Var.G;
        q7Var.f43071x0 = (d8) x31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = q7Var.f43070w0.gift;
        q7Var.k(false, true, 0.0f);
        q7Var.i(savedStarGift, true, false);
        d8 d8Var2 = q7Var.f43071x0;
        if (d8Var2 != null) {
            d8Var2.i(q7Var);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ?? y0Var = new zh.y0(i7, context, h6Var);
        y0Var.f43072y0 = 1.0f;
        y0Var.setStateListAnimator(null);
        y0Var.setWillNotDraw(false);
        return y0Var;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) x31Var.G).address, ((TL_wallet.nftItem) x31Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
