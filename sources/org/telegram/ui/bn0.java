package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class bn0 extends org.telegram.ui.Components.z41 {
    public static final int f36279b = 0;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        cn0 cn0Var = (cn0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) a51Var.G;
        ph.d1 d1Var = cn0Var.h;
        ph.z0 z0Var = cn0Var.e;
        cn0Var.f36486a = savedStarGift.gift.f20021id;
        cn0Var.setPadding(0, 0, 0, 0);
        cn0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        cn0Var.f36487b = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        cn0Var.f36488c = (TL_stars.starGiftAttributePattern) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        z0Var.d(cn0Var.f36487b);
        z0Var.e(cn0Var.f36488c);
        if (d1Var != null) {
            d1Var.setBackdrop(cn0Var.f36487b);
            String k10 = i0.a.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            d1Var.f45021b = k10;
            d1Var.f45020a.f(9, k10, false);
        }
        cn0Var.b(a51Var.e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new cn0(context, p6Var, true);
    }
}
