package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.i71 {
    public final org.telegram.ui.z61[] f29446d2;
    public final y f29447e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.z61[] z61VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f29447e2 = yVar;
        this.f29446d2 = z61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.g3) this.f29447e2).currentAccount;
            if (yh.v5.y(i10, false).n(tL_starGiftUnique.f18347id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f29447e2;
        yVar.f30050h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.z61 z61Var = this.f29446d2[0];
        if (z61Var != null) {
            yVar.f30051i0 = null;
            z61Var.dismiss();
        }
    }
}
