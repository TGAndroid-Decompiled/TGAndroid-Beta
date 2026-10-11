package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class gp0 extends org.telegram.ui.Components.p61 {
    public static final int f38183a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        hp0 hp0Var = (hp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) q61Var.G;
        xh.k1 k1Var = hp0Var.h;
        xh.g1 g1Var = hp0Var.f38524e;
        hp0Var.f38521a = savedStarGift.gift.f20295id;
        hp0Var.setPadding(0, 0, 0, 0);
        hp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        hp0Var.f38522b = (TL_stars.starGiftAttributeBackdrop) yh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        hp0Var.f38523c = (TL_stars.starGiftAttributePattern) yh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        g1Var.d(hp0Var.f38522b);
        g1Var.e(hp0Var.f38523c);
        if (k1Var != null) {
            k1Var.setBackdrop(hp0Var.f38522b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f51446b = h;
            k1Var.f51445a.f(9, h, false);
        }
        hp0Var.b(q61Var.f30161e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hp0(context, d6Var, true);
    }
}
