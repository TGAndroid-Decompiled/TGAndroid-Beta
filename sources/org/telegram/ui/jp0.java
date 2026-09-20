package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends org.telegram.ui.Components.v51 {
    public static final int f34972a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        kp0 kp0Var = (kp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) w51Var.G;
        xh.k1 k1Var = kp0Var.h;
        xh.f1 f1Var = kp0Var.e;
        kp0Var.f35220a = savedStarGift.gift.f18553id;
        kp0Var.setPadding(0, 0, 0, 0);
        kp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        kp0Var.f35221b = (TL_stars.starGiftAttributeBackdrop) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kp0Var.f35222c = (TL_stars.starGiftAttributePattern) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(kp0Var.f35221b);
        f1Var.e(kp0Var.f35222c);
        if (k1Var != null) {
            k1Var.setBackdrop(kp0Var.f35221b);
            String j3 = hg.k0.j(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f46271b = j3;
            k1Var.f46270a.e(9, j3, false);
        }
        kp0Var.b(w51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kp0(context, f6Var, true);
    }
}
