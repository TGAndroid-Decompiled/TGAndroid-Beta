package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.t11 {
    public final org.telegram.ui.k11[] f40120e2;
    public final z f40121f2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.k11[] k11VarArr) {
        super(null, context, true, num, 15, h6Var);
        this.f40121f2 = zVar;
        this.f40120e2 = k11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && bi.ea.y(this.f40121f2.f28669a, false).n(tL_starGiftUnique.f27189id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f40121f2;
        zVar.f40780c2 = l10;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.k11 k11Var = this.f40120e2[0];
        if (k11Var != null) {
            zVar.d2 = null;
            k11Var.dismiss();
        }
    }
}
