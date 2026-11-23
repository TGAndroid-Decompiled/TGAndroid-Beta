package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f0 extends org.telegram.ui.q11 {
    public final org.telegram.ui.h11[] f34930f2;
    public final h0 f34931g2;

    public f0(h0 h0Var, Context context, Integer num, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.h11[] h11VarArr) {
        super(null, context, true, num, 15, i6Var);
        this.f34931g2 = h0Var;
        this.f34930f2 = h11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && di.y8.y(this.f34931g2.f30223a, false).n(tL_starGiftUnique.f28721id) != null && org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        h0 h0Var = this.f34931g2;
        h0Var.d2 = l10;
        h0Var.g1();
        h0Var.f1();
        org.telegram.ui.h11 h11Var = this.f34930f2[0];
        if (h11Var != null) {
            h0Var.f35585e2 = null;
            h11Var.dismiss();
        }
    }
}
