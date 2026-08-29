package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class io0 extends org.telegram.ui.Components.v41 {
    public static final int f39300a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        jo0 jo0Var = (jo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) w41Var.G;
        ih.z1 z1Var = jo0Var.h;
        ih.v1 v1Var = jo0Var.f39604e;
        jo0Var.f39601a = savedStarGift.gift.f22619id;
        jo0Var.setPadding(0, 0, 0, 0);
        jo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        jo0Var.f39602b = (TL_stars.starGiftAttributeBackdrop) jh.s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        jo0Var.f39603c = (TL_stars.starGiftAttributePattern) jh.s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v1Var.d(jo0Var.f39602b);
        v1Var.e(jo0Var.f39603c);
        if (z1Var != null) {
            z1Var.setBackdrop(jo0Var.f39602b);
            String m10 = j7.l1.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z1Var.f9558b = m10;
            z1Var.f9557a.e(9, m10, false);
        }
        jo0Var.b(w41Var.f34294e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new jo0(context, c6Var, true);
    }
}
