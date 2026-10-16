package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class lp0 extends org.telegram.ui.Components.l61 {
    public static final int f37802a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        mp0 mp0Var = (mp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m61Var.G;
        yh.i1 i1Var = mp0Var.h;
        yh.e1 e1Var = mp0Var.e;
        mp0Var.f38047a = savedStarGift.gift.f19141id;
        mp0Var.setPadding(0, 0, 0, 0);
        mp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        mp0Var.f38048b = (TL_stars.starGiftAttributeBackdrop) zh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        mp0Var.f38049c = (TL_stars.starGiftAttributePattern) zh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(mp0Var.f38048b);
        e1Var.e(mp0Var.f38049c);
        if (i1Var != null) {
            i1Var.setBackdrop(mp0Var.f38048b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.f48919b = h;
            i1Var.f48918a.f(9, h, false);
        }
        mp0Var.b(m61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new mp0(context, c6Var, true);
    }
}
