package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.c71 {
    public final org.telegram.ui.t61[] f32405d2;
    public final y f32406e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.t61[] t61VarArr) {
        super(null, context, true, num, 15, d6Var);
        this.f32406e2 = yVar;
        this.f32405d2 = t61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f32406e2).currentAccount;
            if (yh.t5.y(i10, false).n(tL_starGiftUnique.f20269id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f32406e2;
        yVar.f33015h0 = l4;
        yVar.W();
        yVar.U();
        org.telegram.ui.t61 t61Var = this.f32405d2[0];
        if (t61Var != null) {
            yVar.f33016i0 = null;
            t61Var.dismiss();
        }
    }
}
