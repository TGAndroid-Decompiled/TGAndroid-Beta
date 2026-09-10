package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class hp0 extends org.telegram.ui.Components.u51 {
    public static final int f33434a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        ip0 ip0Var = (ip0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v51Var.G;
        wh.i1 i1Var = ip0Var.h;
        wh.e1 e1Var = ip0Var.e;
        ip0Var.f33775a = savedStarGift.gift.f17425id;
        ip0Var.setPadding(0, 0, 0, 0);
        ip0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ip0Var.f33776b = (TL_stars.starGiftAttributeBackdrop) xh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ip0Var.f33777c = (TL_stars.starGiftAttributePattern) xh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(ip0Var.f33776b);
        e1Var.e(ip0Var.f33777c);
        if (i1Var != null) {
            i1Var.setBackdrop(ip0Var.f33776b);
            String l4 = hc.b.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.f44149b = l4;
            i1Var.f44148a.e(9, l4, false);
        }
        ip0Var.b(v51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ip0(context, f6Var, true);
    }
}
