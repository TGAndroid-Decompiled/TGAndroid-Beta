package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

public final class ko0 extends org.telegram.ui.Components.m41 {

    public static final int f39816a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new ko0());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        lo0 lo0Var = (lo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n41Var.G;
        gh.c2 c2Var = lo0Var.h;
        gh.y1 y1Var = lo0Var.f40168e;
        lo0Var.f40165a = savedStarGift.gift.f22607id;
        lo0Var.setPadding(0, 0, 0, 0);
        lo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        lo0Var.f40166b = (TL_stars.starGiftAttributeBackdrop) hh.u7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        lo0Var.f40167c = (TL_stars.starGiftAttributePattern) hh.u7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        y1Var.d(lo0Var.f40166b);
        y1Var.e(lo0Var.f40167c);
        if (c2Var != null) {
            c2Var.setBackdrop(lo0Var.f40166b);
            String strM = i0.a.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            c2Var.f7180b = strM;
            c2Var.f7179a.e(9, strM, false);
        }
        lo0Var.b(n41Var.f30838e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new lo0(context, c6Var, true);
    }
}
