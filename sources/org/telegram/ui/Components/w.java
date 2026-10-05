package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.a71 {
    public final org.telegram.ui.r61[] f32442d2;
    public final y f32443e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.r61[] r61VarArr) {
        super(null, context, true, num, 15, d6Var);
        this.f32443e2 = yVar;
        this.f32442d2 = r61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f32443e2).currentAccount;
            if (yh.u5.y(i10, false).n(tL_starGiftUnique.f20274id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f32443e2;
        yVar.f33133h0 = l4;
        yVar.W();
        yVar.U();
        org.telegram.ui.r61 r61Var = this.f32442d2[0];
        if (r61Var != null) {
            yVar.f33134i0 = null;
            r61Var.dismiss();
        }
    }
}
