package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class po0 extends org.telegram.ui.Components.f61 {
    public static final int f40260a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        qo0 qo0Var = (qo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) g61Var.G;
        yh.h1 h1Var = qo0Var.h;
        yh.d1 d1Var = qo0Var.e;
        qo0Var.f40936a = savedStarGift.gift.f20497id;
        qo0Var.setPadding(0, 0, 0, 0);
        qo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        qo0Var.f40937b = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        qo0Var.f40938c = (TL_stars.starGiftAttributePattern) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(qo0Var.f40937b);
        d1Var.e(qo0Var.f40938c);
        if (h1Var != null) {
            h1Var.setBackdrop(qo0Var.f40937b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.f50284b = h;
            h1Var.f50283a.f(9, h, false);
        }
        qo0Var.b(g61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new qo0(context, d6Var, true);
    }
}
