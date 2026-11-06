package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class o7 extends v31 {
    public static final int f42929b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        p7 p7Var = (p7) view;
        c8 c8Var = p7Var.f43016x0;
        if (c8Var != null) {
            c8Var.h.remove(p7Var);
        }
        ValueAnimator valueAnimator = p7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        p7Var.f43017y0 = 1.0f;
        p7Var.D.setAlpha(1.0f);
        p7Var.f43015w0 = (TL_wallet.nftItem) w31Var.G;
        p7Var.f43016x0 = (c8) w31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = p7Var.f43015w0.gift;
        p7Var.k(false, true, 0.0f);
        p7Var.i(savedStarGift, true, false);
        c8 c8Var2 = p7Var.f43016x0;
        if (c8Var2 != null) {
            c8Var2.i(p7Var);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        ?? z0Var = new zh.z0(i7, context, f6Var);
        z0Var.f43017y0 = 1.0f;
        z0Var.setStateListAnimator(null);
        z0Var.setWillNotDraw(false);
        return z0Var;
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) w31Var.G).address, ((TL_wallet.nftItem) w31Var2.G).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
