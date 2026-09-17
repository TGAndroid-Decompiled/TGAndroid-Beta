package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends org.telegram.ui.Components.i51 {
    public static final int f34917a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        kp0 kp0Var = (kp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) j51Var.G;
        xh.j1 j1Var = kp0Var.h;
        xh.e1 e1Var = kp0Var.e;
        kp0Var.f35346a = savedStarGift.gift.f18347id;
        kp0Var.setPadding(0, 0, 0, 0);
        kp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        kp0Var.f35347b = (TL_stars.starGiftAttributeBackdrop) yh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kp0Var.f35348c = (TL_stars.starGiftAttributePattern) yh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(kp0Var.f35347b);
        e1Var.e(kp0Var.f35348c);
        if (j1Var != null) {
            j1Var.setBackdrop(kp0Var.f35347b);
            String k10 = hg.k0.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j1Var.f45965b = k10;
            j1Var.f45964a.e(9, k10, false);
        }
        kp0Var.b(j51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kp0(context, f6Var, true);
    }
}
