package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class o7 extends q31 {
    public static final int f42904b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        p7 p7Var = (p7) view;
        c8 c8Var = p7Var.f42991x0;
        if (c8Var != null) {
            c8Var.h.remove(p7Var);
        }
        ValueAnimator valueAnimator = p7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        p7Var.f42992y0 = 1.0f;
        p7Var.D.setAlpha(1.0f);
        p7Var.f42990w0 = (TL_wallet.nftItem) r31Var.G;
        p7Var.f42991x0 = (c8) r31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = p7Var.f42990w0.gift;
        p7Var.k(false, true, 0.0f);
        p7Var.i(savedStarGift, true, false);
        c8 c8Var2 = p7Var.f42991x0;
        if (c8Var2 != null) {
            c8Var2.i(p7Var);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        ?? z0Var = new zh.z0(i7, context, f6Var);
        z0Var.f42992y0 = 1.0f;
        z0Var.setStateListAnimator(null);
        z0Var.setWillNotDraw(false);
        return z0Var;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) r31Var.G).address, ((TL_wallet.nftItem) r31Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
