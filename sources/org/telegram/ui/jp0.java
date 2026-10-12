package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends org.telegram.ui.Components.t61 {
    public static final int f39263a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        kp0 kp0Var = (kp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) u61Var.G;
        xh.j1 j1Var = kp0Var.h;
        xh.f1 f1Var = kp0Var.f39569e;
        kp0Var.f39566a = savedStarGift.gift.f20031id;
        kp0Var.setPadding(0, 0, 0, 0);
        kp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        kp0Var.f39567b = (TL_stars.starGiftAttributeBackdrop) yh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kp0Var.f39568c = (TL_stars.starGiftAttributePattern) yh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(kp0Var.f39567b);
        f1Var.e(kp0Var.f39568c);
        if (j1Var != null) {
            j1Var.setBackdrop(kp0Var.f39567b);
            String k10 = hg.c.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j1Var.f51538b = k10;
            j1Var.f51537a.f(9, k10, false);
        }
        kp0Var.b(u61Var.f31070e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new kp0(context, c6Var, true);
    }
}
