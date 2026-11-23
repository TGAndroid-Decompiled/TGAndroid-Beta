package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class e8 extends m41 {
    public static final int f44222b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        f8 f8Var = (f8) view;
        s8 s8Var = f8Var.f44309y0;
        if (s8Var != null) {
            s8Var.h.remove(f8Var);
        }
        ValueAnimator valueAnimator = f8Var.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f8Var.f44310z0 = 1.0f;
        f8Var.E.setAlpha(1.0f);
        f8Var.f44308x0 = (TL_wallet.nftItem) n41Var.H;
        f8Var.f44309y0 = (s8) n41Var.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = f8Var.f44308x0.gift;
        f8Var.k(false, true, 0.0f);
        f8Var.i(savedStarGift, true, false);
        s8 s8Var2 = f8Var.f44309y0;
        if (s8Var2 != null) {
            s8Var2.i(f8Var);
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ?? i3Var = new bi.i3(i7, context, i6Var);
        i3Var.f44310z0 = 1.0f;
        i3Var.setStateListAnimator(null);
        i3Var.setWillNotDraw(false);
        return i3Var;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) n41Var.H).address, ((TL_wallet.nftItem) n41Var2.H).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
