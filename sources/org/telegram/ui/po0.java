package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class po0 extends org.telegram.ui.Components.g61 {
    public static final int f40269a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        qo0 qo0Var = (qo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h61Var.G;
        yh.h1 h1Var = qo0Var.h;
        yh.d1 d1Var = qo0Var.e;
        qo0Var.f40945a = savedStarGift.gift.f20503id;
        qo0Var.setPadding(0, 0, 0, 0);
        qo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        qo0Var.f40946b = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        qo0Var.f40947c = (TL_stars.starGiftAttributePattern) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(qo0Var.f40946b);
        d1Var.e(qo0Var.f40947c);
        if (h1Var != null) {
            h1Var.setBackdrop(qo0Var.f40946b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.f50292b = h;
            h1Var.f50291a.f(9, h, false);
        }
        qo0Var.b(h61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new qo0(context, d6Var, true);
    }
}
