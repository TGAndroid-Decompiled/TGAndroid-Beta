package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 extends org.telegram.ui.Components.v51 {
    public static final int f32209a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        bp0 bp0Var = (bp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) w51Var.G;
        xh.k1 k1Var = bp0Var.h;
        xh.f1 f1Var = bp0Var.e;
        bp0Var.f32459a = savedStarGift.gift.f18560id;
        bp0Var.setPadding(0, 0, 0, 0);
        bp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        bp0Var.f32460b = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        bp0Var.f32461c = (TL_stars.starGiftAttributePattern) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(bp0Var.f32460b);
        f1Var.e(bp0Var.f32461c);
        if (k1Var != null) {
            k1Var.setBackdrop(bp0Var.f32460b);
            String h = org.telegram.messenger.f0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f46250b = h;
            k1Var.f46249a.e(9, h, false);
        }
        bp0Var.b(w51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new bp0(context, d6Var, true);
    }
}
