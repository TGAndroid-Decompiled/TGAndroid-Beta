package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ip0 extends org.telegram.ui.Components.g51 {
    public static final int f37420a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        jp0 jp0Var = (jp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h51Var.G;
        yh.i1 i1Var = jp0Var.h;
        yh.e1 e1Var = jp0Var.f37829e;
        jp0Var.f37826a = savedStarGift.gift.f20097id;
        jp0Var.setPadding(0, 0, 0, 0);
        jp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        jp0Var.f37827b = (TL_stars.starGiftAttributeBackdrop) zh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        jp0Var.f37828c = (TL_stars.starGiftAttributePattern) zh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(jp0Var.f37827b);
        e1Var.e(jp0Var.f37828c);
        if (i1Var != null) {
            i1Var.setBackdrop(jp0Var.f37827b);
            String k10 = i2.g.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.f50333b = k10;
            i1Var.f50332a.e(9, k10, false);
        }
        jp0Var.b(h51Var.f26588e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new jp0(context, f6Var, true);
    }
}
