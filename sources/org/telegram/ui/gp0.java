package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class gp0 extends org.telegram.ui.Components.q61 {
    public static final int f38149a = 0;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        hp0 hp0Var = (hp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) r61Var.G;
        xh.k1 k1Var = hp0Var.h;
        xh.g1 g1Var = hp0Var.f38490e;
        hp0Var.f38487a = savedStarGift.gift.f20259id;
        hp0Var.setPadding(0, 0, 0, 0);
        hp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        hp0Var.f38488b = (TL_stars.starGiftAttributeBackdrop) yh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        hp0Var.f38489c = (TL_stars.starGiftAttributePattern) yh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        g1Var.d(hp0Var.f38488b);
        g1Var.e(hp0Var.f38489c);
        if (k1Var != null) {
            k1Var.setBackdrop(hp0Var.f38488b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f51412b = h;
            k1Var.f51411a.f(9, h, false);
        }
        hp0Var.b(r61Var.f30355e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hp0(context, d6Var, true);
    }
}
