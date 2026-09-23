package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 extends org.telegram.ui.Components.g51 {
    public static final int f32157a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        cp0 cp0Var = (cp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h51Var.G;
        xh.k1 k1Var = cp0Var.h;
        xh.f1 f1Var = cp0Var.e;
        cp0Var.f32383a = savedStarGift.gift.f18308id;
        cp0Var.setPadding(0, 0, 0, 0);
        cp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        cp0Var.f32384b = (TL_stars.starGiftAttributeBackdrop) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        cp0Var.f32385c = (TL_stars.starGiftAttributePattern) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(cp0Var.f32384b);
        f1Var.e(cp0Var.f32385c);
        if (k1Var != null) {
            k1Var.setBackdrop(cp0Var.f32384b);
            String k10 = hg.c.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f45923b = k10;
            k1Var.f45922a.e(9, k10, false);
        }
        cp0Var.b(h51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new cp0(context, d6Var, true);
    }
}
