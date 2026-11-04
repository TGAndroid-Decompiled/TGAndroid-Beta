package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.g11 {
    public final org.telegram.ui.x01[] f40183f2;
    public final z f40184g2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.x01[] x01VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.f40184g2 = zVar;
        this.f40183f2 = x01VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && ci.e9.y(this.f40184g2.f28583a, false).n(tL_starGiftUnique.f27230id) != null && org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f40184g2;
        zVar.f40876a2 = l10;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.x01 x01Var = this.f40183f2[0];
        if (x01Var != null) {
            zVar.f40877b2 = null;
            x01Var.dismiss();
        }
    }
}
