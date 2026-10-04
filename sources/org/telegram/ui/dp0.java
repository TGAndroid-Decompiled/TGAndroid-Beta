package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 extends org.telegram.ui.Components.f61 {
    public static final int f35822a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        ep0 ep0Var = (ep0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) g61Var.G;
        xh.j1 j1Var = ep0Var.h;
        xh.f1 f1Var = ep0Var.f36067e;
        ep0Var.f36064a = savedStarGift.gift.f20265id;
        ep0Var.setPadding(0, 0, 0, 0);
        ep0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ep0Var.f36065b = (TL_stars.starGiftAttributeBackdrop) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ep0Var.f36066c = (TL_stars.starGiftAttributePattern) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(ep0Var.f36065b);
        f1Var.e(ep0Var.f36066c);
        if (j1Var != null) {
            j1Var.setBackdrop(ep0Var.f36065b);
            String h = org.telegram.messenger.f0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j1Var.f50033b = h;
            j1Var.f50032a.e(9, h, false);
        }
        ep0Var.b(g61Var.f26663e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ep0(context, d6Var, true);
    }
}
