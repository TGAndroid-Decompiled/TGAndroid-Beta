package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y extends org.telegram.ui.d61 {
    public final org.telegram.ui.u51[] Z1;
    public final a0 a2;

    public y(a0 a0Var, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.u51[] u51VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.a2 = a0Var;
        this.Z1 = u51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.a2).currentAccount;
            if (jh.s7.y(i10, false).n(tL_starGiftUnique.f22619id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.a2;
        a0Var.f26604d0 = l10;
        a0Var.X();
        a0Var.W();
        org.telegram.ui.u51 u51Var = this.Z1[0];
        if (u51Var != null) {
            a0Var.f26605e0 = null;
            u51Var.dismiss();
        }
    }
}
