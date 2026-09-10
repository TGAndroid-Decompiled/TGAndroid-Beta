package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.l71 {
    public final org.telegram.ui.c71[] f28881d2;
    public final z f28882e2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.c71[] c71VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f28882e2 = zVar;
        this.f28881d2 = c71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f28882e2).currentAccount;
            if (xh.v5.y(i10, false).n(tL_starGiftUnique.f17425id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f28882e2;
        zVar.f29545h0 = l4;
        zVar.X();
        zVar.W();
        org.telegram.ui.c71 c71Var = this.f28881d2[0];
        if (c71Var != null) {
            zVar.f29546i0 = null;
            c71Var.dismiss();
        }
    }
}
