package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.n71 {
    public final org.telegram.ui.e71[] f32220d2;
    public final y f32221e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.e71[] e71VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.f32221e2 = yVar;
        this.f32220d2 = e71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.e3) this.f32221e2).currentAccount;
            if (yh.n5.y(i10, false).n(tL_starGiftUnique.f20031id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f32221e2;
        yVar.f32903h0 = l4;
        yVar.Y();
        yVar.X();
        org.telegram.ui.e71 e71Var = this.f32220d2[0];
        if (e71Var != null) {
            yVar.f32904i0 = null;
            e71Var.dismiss();
        }
    }
}
