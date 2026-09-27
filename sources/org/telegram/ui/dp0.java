package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 extends org.telegram.ui.Components.w51 {
    public static final int f33013a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        ep0 ep0Var = (ep0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x51Var.G;
        xh.k1 k1Var = ep0Var.h;
        xh.f1 f1Var = ep0Var.e;
        ep0Var.f33299a = savedStarGift.gift.f18554id;
        ep0Var.setPadding(0, 0, 0, 0);
        ep0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ep0Var.f33300b = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ep0Var.f33301c = (TL_stars.starGiftAttributePattern) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(ep0Var.f33300b);
        f1Var.e(ep0Var.f33301c);
        if (k1Var != null) {
            k1Var.setBackdrop(ep0Var.f33300b);
            String j3 = hg.k0.j(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f46318b = j3;
            k1Var.f46317a.e(9, j3, false);
        }
        ep0Var.b(x51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ep0(context, e6Var, true);
    }
}
