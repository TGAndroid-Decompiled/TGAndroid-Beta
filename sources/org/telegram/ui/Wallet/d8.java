package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class d8 extends k41 {
    public static final int f44050b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        e8 e8Var = (e8) view;
        r8 r8Var = e8Var.f44136y0;
        if (r8Var != null) {
            r8Var.h.remove(e8Var);
        }
        ValueAnimator valueAnimator = e8Var.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        e8Var.f44137z0 = 1.0f;
        e8Var.E.setAlpha(1.0f);
        e8Var.f44135x0 = (TL_wallet.nftItem) l41Var.H;
        e8Var.f44136y0 = (r8) l41Var.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = e8Var.f44135x0.gift;
        e8Var.k(false, true, 0.0f);
        e8Var.i(savedStarGift, true, false);
        r8 r8Var2 = e8Var.f44136y0;
        if (r8Var2 != null) {
            r8Var2.i(e8Var);
        }
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ?? c3Var = new bi.c3(i7, context, i6Var);
        c3Var.f44137z0 = 1.0f;
        c3Var.setStateListAnimator(null);
        c3Var.setWillNotDraw(false);
        return c3Var;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) l41Var.H).address, ((TL_wallet.nftItem) l41Var2.H).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
