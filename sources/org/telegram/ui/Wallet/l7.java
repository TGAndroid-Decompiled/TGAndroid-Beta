package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class l7 extends e61 {
    public static final int f34512a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        m7 m7Var = (m7) view;
        z7 z7Var = m7Var.f34602p0;
        if (z7Var != null) {
            z7Var.h.remove(m7Var);
        }
        ValueAnimator valueAnimator = m7Var.f34605s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m7Var.f34603q0 = 1.0f;
        m7Var.f50330y.setAlpha(1.0f);
        m7Var.f34601o0 = (TL_wallet.nftItem) f61Var.G;
        m7Var.f34602p0 = (z7) f61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = m7Var.f34601o0.gift;
        m7Var.j(false, true, 0.0f);
        m7Var.h(savedStarGift, true, false);
        z7 z7Var2 = m7Var.f34602p0;
        if (z7Var2 != null) {
            z7Var2.i(m7Var);
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        ?? h1Var = new yh.h1(context, i10, d6Var);
        h1Var.f34603q0 = 1.0f;
        h1Var.setStateListAnimator(null);
        return h1Var;
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) f61Var.G).address, ((TL_wallet.nftItem) f61Var2.G).address);
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
