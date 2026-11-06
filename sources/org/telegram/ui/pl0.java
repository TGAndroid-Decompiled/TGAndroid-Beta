package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class pl0 extends org.telegram.ui.Components.q31 {
    public static final int f48853b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        ql0 ql0Var = (ql0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) r31Var.G;
        zh.a1 a1Var = ql0Var.h;
        zh.w0 w0Var = ql0Var.f49233e;
        ql0Var.f49230a = savedStarGift.gift.f27181id;
        ql0Var.setPadding(0, 0, 0, 0);
        ql0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ql0Var.f49231b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ql0Var.f49232c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        w0Var.d(ql0Var.f49231b);
        w0Var.e(ql0Var.f49232c);
        if (a1Var != null) {
            a1Var.setBackdrop(ql0Var.f49231b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            a1Var.f60080b = m10;
            a1Var.f60079a.f(9, m10, false);
        }
        ql0Var.b(r31Var.f37592e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ql0(context, f6Var, true);
    }
}
