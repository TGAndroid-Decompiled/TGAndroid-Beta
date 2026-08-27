package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class w extends org.telegram.ui.a61 {
    public final org.telegram.ui.r51[] Z1;
    public final y a2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.r51[] r51VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.a2 = yVar;
        this.Z1 = r51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || hh.u7.y(((org.telegram.ui.ActionBar.e3) this.a2).currentAccount, false).n(tL_starGiftUnique.f22607id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.a2;
        yVar.f34741d0 = l10;
        yVar.X();
        yVar.W();
        org.telegram.ui.r51 r51Var = this.Z1[0];
        if (r51Var != null) {
            yVar.f34742e0 = null;
            r51Var.dismiss();
        }
    }
}
