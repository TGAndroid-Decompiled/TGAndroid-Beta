package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class jo0 extends org.telegram.ui.Components.k41 {
    public static final int f39537a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        ko0 ko0Var = (ko0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l41Var.G;
        fh.g2 g2Var = ko0Var.h;
        fh.b2 b2Var = ko0Var.f39882e;
        ko0Var.f39879a = savedStarGift.gift.f22607id;
        ko0Var.setPadding(0, 0, 0, 0);
        ko0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ko0Var.f39880b = (TL_stars.starGiftAttributeBackdrop) gh.v7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ko0Var.f39881c = (TL_stars.starGiftAttributePattern) gh.v7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        b2Var.d(ko0Var.f39880b);
        b2Var.e(ko0Var.f39881c);
        if (g2Var != null) {
            g2Var.setBackdrop(ko0Var.f39880b);
            String n10 = j3.r0.n(savedStarGift.gift.num, ',', new StringBuilder("#"));
            g2Var.f6473b = n10;
            g2Var.f6472a.e(9, n10, false);
        }
        ko0Var.b(l41Var.f30333e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new ko0(context, b6Var, true);
    }
}
