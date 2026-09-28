package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 extends org.telegram.ui.Components.w51 {
    public static final int f32210a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        bp0 bp0Var = (bp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x51Var.G;
        xh.k1 k1Var = bp0Var.h;
        xh.f1 f1Var = bp0Var.e;
        bp0Var.f32460a = savedStarGift.gift.f18560id;
        bp0Var.setPadding(0, 0, 0, 0);
        bp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        bp0Var.f32461b = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        bp0Var.f32462c = (TL_stars.starGiftAttributePattern) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(bp0Var.f32461b);
        f1Var.e(bp0Var.f32462c);
        if (k1Var != null) {
            k1Var.setBackdrop(bp0Var.f32461b);
            String h = org.telegram.messenger.f0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f46251b = h;
            k1Var.f46250a.e(9, h, false);
        }
        bp0Var.b(x51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new bp0(context, d6Var, true);
    }
}
