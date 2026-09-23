package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.z61 {
    public final org.telegram.ui.q61[] f29442d2;
    public final y f29443e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.q61[] q61VarArr) {
        super(null, context, true, num, 15, d6Var);
        this.f29443e2 = yVar;
        this.f29442d2 = q61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f29443e2).currentAccount;
            if (yh.t5.y(i10, false).n(tL_starGiftUnique.f18308id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f29443e2;
        yVar.f30109h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.q61 q61Var = this.f29442d2[0];
        if (q61Var != null) {
            yVar.f30110i0 = null;
            q61Var.dismiss();
        }
    }
}
