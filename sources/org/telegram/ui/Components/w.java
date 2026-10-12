package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.r71 {
    public final org.telegram.ui.i71[] f30686d2;
    public final y f30687e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.i71[] i71VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.f30687e2 = yVar;
        this.f30686d2 = i71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.e3) this.f30687e2).currentAccount;
            if (zh.n5.y(i10, false).n(tL_starGiftUnique.f19441id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f30687e2;
        yVar.f31436h0 = l4;
        yVar.Y();
        yVar.X();
        org.telegram.ui.i71 i71Var = this.f30686d2[0];
        if (i71Var != null) {
            yVar.f31437i0 = null;
            i71Var.dismiss();
        }
    }
}
