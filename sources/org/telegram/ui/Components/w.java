package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.c71 {
    public final org.telegram.ui.t61[] f29816d2;
    public final y f29817e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.t61[] t61VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.f29817e2 = yVar;
        this.f29816d2 = t61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.g3) this.f29817e2).currentAccount;
            if (yh.s5.y(i10, false).n(tL_starGiftUnique.f18554id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f29817e2;
        yVar.f30533h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.t61 t61Var = this.f29816d2[0];
        if (t61Var != null) {
            yVar.f30534i0 = null;
            t61Var.dismiss();
        }
    }
}
