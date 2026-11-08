package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class pl0 extends org.telegram.ui.Components.w31 {
    public static final int f48850b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        ql0 ql0Var = (ql0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x31Var.G;
        zh.z0 z0Var = ql0Var.h;
        zh.v0 v0Var = ql0Var.f49262e;
        ql0Var.f49259a = savedStarGift.gift.f27185id;
        ql0Var.setPadding(0, 0, 0, 0);
        ql0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ql0Var.f49260b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ql0Var.f49261c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v0Var.d(ql0Var.f49260b);
        v0Var.e(ql0Var.f49261c);
        if (z0Var != null) {
            z0Var.setBackdrop(ql0Var.f49260b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z0Var.f60620b = m10;
            z0Var.f60619a.f(9, m10, false);
        }
        ql0Var.b(x31Var.f40174e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ql0(context, f6Var, true);
    }
}
