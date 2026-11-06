package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class pl0 extends org.telegram.ui.Components.v31 {
    public static final int f48848b = 0;

    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        ql0 ql0Var = (ql0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) w31Var.G;
        zh.a1 a1Var = ql0Var.h;
        zh.w0 w0Var = ql0Var.f49260e;
        ql0Var.f49257a = savedStarGift.gift.f27181id;
        ql0Var.setPadding(0, 0, 0, 0);
        ql0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ql0Var.f49258b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ql0Var.f49259c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        w0Var.d(ql0Var.f49258b);
        w0Var.e(ql0Var.f49259c);
        if (a1Var != null) {
            a1Var.setBackdrop(ql0Var.f49258b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            a1Var.f60105b = m10;
            a1Var.f60104a.f(9, m10, false);
        }
        ql0Var.b(w31Var.f39824e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ql0(context, f6Var, true);
    }
}
