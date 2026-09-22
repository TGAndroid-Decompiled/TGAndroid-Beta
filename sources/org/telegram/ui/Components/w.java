package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.h71 {
    public final org.telegram.ui.y61[] f29495d2;
    public final y f29496e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.y61[] y61VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.f29496e2 = yVar;
        this.f29495d2 = y61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f29496e2).currentAccount;
            if (yh.u5.y(i10, false).n(tL_starGiftUnique.f18334id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f29496e2;
        yVar.f30103h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.y61 y61Var = this.f29495d2[0];
        if (y61Var != null) {
            yVar.f30104i0 = null;
            y61Var.dismiss();
        }
    }
}
