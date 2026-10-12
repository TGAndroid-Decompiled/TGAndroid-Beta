package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class np0 extends org.telegram.ui.Components.k61 {
    public static final int f38781a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        op0 op0Var = (op0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l61Var.G;
        yh.i1 i1Var = op0Var.h;
        yh.e1 e1Var = op0Var.e;
        op0Var.f39022a = savedStarGift.gift.f19441id;
        op0Var.setPadding(0, 0, 0, 0);
        op0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        op0Var.f39023b = (TL_stars.starGiftAttributeBackdrop) zh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        op0Var.f39024c = (TL_stars.starGiftAttributePattern) zh.n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(op0Var.f39023b);
        e1Var.e(op0Var.f39024c);
        if (i1Var != null) {
            i1Var.setBackdrop(op0Var.f39023b);
            String i10 = org.telegram.messenger.q.i(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.f48920b = i10;
            i1Var.f48919a.f(9, i10, false);
        }
        op0Var.b(l61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new op0(context, c6Var, true);
    }
}
