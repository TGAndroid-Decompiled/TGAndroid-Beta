package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class kl0 extends org.telegram.ui.Components.q31 {
    public static final int f46980b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        ll0 ll0Var = (ll0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) r31Var.G;
        ai.r2 r2Var = ll0Var.h;
        ai.m2 m2Var = ll0Var.f47356e;
        ll0Var.f47353a = savedStarGift.gift.f27230id;
        ll0Var.setPadding(0, 0, 0, 0);
        ll0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ll0Var.f47354b = (TL_stars.starGiftAttributeBackdrop) ci.e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ll0Var.f47355c = (TL_stars.starGiftAttributePattern) ci.e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        m2Var.d(ll0Var.f47354b);
        m2Var.e(ll0Var.f47355c);
        if (r2Var != null) {
            r2Var.setBackdrop(ll0Var.f47354b);
            String l10 = k2.p1.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            r2Var.f941b = l10;
            r2Var.f940a.f(9, l10, false);
        }
        ll0Var.b(r31Var.f37621e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ll0(context, e6Var, true);
    }
}
