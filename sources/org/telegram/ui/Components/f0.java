package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f0 extends org.telegram.ui.r11 {
    public final org.telegram.ui.i11[] f34856f2;
    public final h0 f34857g2;

    public f0(h0 h0Var, Context context, Integer num, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.i11[] i11VarArr) {
        super(null, context, true, num, 15, i6Var);
        this.f34857g2 = h0Var;
        this.f34856f2 = i11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && di.x8.y(this.f34857g2.f30189a, false).n(tL_starGiftUnique.f28634id) != null && org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        h0 h0Var = this.f34857g2;
        h0Var.d2 = l10;
        h0Var.g1();
        h0Var.f1();
        org.telegram.ui.i11 i11Var = this.f34856f2[0];
        if (i11Var != null) {
            h0Var.f35675e2 = null;
            i11Var.dismiss();
        }
    }
}
