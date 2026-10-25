package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.c61 {
    public final org.telegram.ui.t51[] f34307e2;
    public final y f34308f2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.t51[] t51VarArr) {
        super(null, context, true, num, 15, u6Var);
        this.f34308f2 = yVar;
        this.f34307e2 = t51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.k3) this.f34308f2).currentAccount;
            if (bi.ca.y(i10, false).n(tL_starGiftUnique.f22254id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f34308f2;
        yVar.f34861h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.t51 t51Var = this.f34307e2[0];
        if (t51Var != null) {
            yVar.f34862i0 = null;
            t51Var.dismiss();
        }
    }
}
