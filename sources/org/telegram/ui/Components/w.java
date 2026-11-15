package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.n11 {
    public final org.telegram.ui.e11[] f41208f2;
    public final y f41209g2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.e11[] e11VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.f41209g2 = yVar;
        this.f41208f2 = e11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && di.u8.y(this.f41209g2.f29679a, false).n(tL_starGiftUnique.f28280id) != null && org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f41209g2;
        yVar.d2 = l10;
        yVar.f1();
        yVar.e1();
        org.telegram.ui.e11 e11Var = this.f41208f2[0];
        if (e11Var != null) {
            yVar.f41813e2 = null;
            e11Var.dismiss();
        }
    }
}
