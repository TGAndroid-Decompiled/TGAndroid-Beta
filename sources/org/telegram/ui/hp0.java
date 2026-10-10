package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class hp0 extends org.telegram.ui.Components.p61 {
    public static final int f38433a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        ip0 ip0Var = (ip0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) q61Var.G;
        xh.k1 k1Var = ip0Var.h;
        xh.g1 g1Var = ip0Var.f38785e;
        ip0Var.f38782a = savedStarGift.gift.f20269id;
        ip0Var.setPadding(0, 0, 0, 0);
        ip0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ip0Var.f38783b = (TL_stars.starGiftAttributeBackdrop) yh.m5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ip0Var.f38784c = (TL_stars.starGiftAttributePattern) yh.m5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        g1Var.d(ip0Var.f38783b);
        g1Var.e(ip0Var.f38784c);
        if (k1Var != null) {
            k1Var.setBackdrop(ip0Var.f38783b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f51369b = h;
            k1Var.f51368a.f(9, h, false);
        }
        ip0Var.b(q61Var.f30057e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ip0(context, e6Var, true);
    }
}
