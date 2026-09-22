package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends org.telegram.ui.Components.x51 {
    public static final int f34994a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        kp0 kp0Var = (kp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) y51Var.G;
        xh.k1 k1Var = kp0Var.h;
        xh.f1 f1Var = kp0Var.e;
        kp0Var.f35238a = savedStarGift.gift.f18568id;
        kp0Var.setPadding(0, 0, 0, 0);
        kp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        kp0Var.f35239b = (TL_stars.starGiftAttributeBackdrop) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kp0Var.f35240c = (TL_stars.starGiftAttributePattern) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(kp0Var.f35239b);
        f1Var.e(kp0Var.f35240c);
        if (k1Var != null) {
            k1Var.setBackdrop(kp0Var.f35239b);
            String j3 = hg.k0.j(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f46292b = j3;
            k1Var.f46291a.e(9, j3, false);
        }
        kp0Var.b(y51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kp0(context, f6Var, true);
    }
}
