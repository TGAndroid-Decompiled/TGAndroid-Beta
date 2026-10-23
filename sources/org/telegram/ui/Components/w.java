package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.b61 {
    public final org.telegram.ui.s51[] f32080e2;
    public final y f32081f2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.s51[] s51VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.f32081f2 = yVar;
        this.f32080e2 = s51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f32081f2).currentAccount;
            if (ai.ha.y(i10, false).n(tL_starGiftUnique.f20567id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f32081f2;
        yVar.f32742h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.s51 s51Var = this.f32080e2[0];
        if (s51Var != null) {
            yVar.f32743i0 = null;
            s51Var.dismiss();
        }
    }
}
