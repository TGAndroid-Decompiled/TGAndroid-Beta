package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 extends org.telegram.ui.Components.t61 {
    public static final int f37806a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        bp0 bp0Var = (bp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) u61Var.G;
        zh.h1 h1Var = bp0Var.h;
        zh.d1 d1Var = bp0Var.e;
        bp0Var.f38084a = savedStarGift.gift.f22257id;
        bp0Var.setPadding(0, 0, 0, 0);
        bp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        bp0Var.f38085b = (TL_stars.starGiftAttributeBackdrop) bi.ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        bp0Var.f38086c = (TL_stars.starGiftAttributePattern) bi.ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(bp0Var.f38085b);
        d1Var.e(bp0Var.f38086c);
        if (h1Var != null) {
            h1Var.setBackdrop(bp0Var.f38085b);
            String i10 = org.telegram.messenger.t.i(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.f53082b = i10;
            h1Var.f53081a.f(9, i10, false);
        }
        bp0Var.b(u61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new bp0(context, u6Var, true);
    }
}
