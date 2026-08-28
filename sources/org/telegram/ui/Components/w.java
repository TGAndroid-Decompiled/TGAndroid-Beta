package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.b61 {
    public final org.telegram.ui.s51[] Z1;
    public final y a2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.s51[] s51VarArr) {
        super(null, context, true, num, 15, b6Var);
        this.a2 = yVar;
        this.Z1 = s51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i9;
        if (tL_starGiftUnique != null) {
            i9 = ((org.telegram.ui.ActionBar.f3) this.a2).currentAccount;
            if (gh.v7.y(i9, false).n(tL_starGiftUnique.f22607id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.a2;
        yVar.f34813d0 = l10;
        yVar.W();
        yVar.V();
        org.telegram.ui.s51 s51Var = this.Z1[0];
        if (s51Var != null) {
            yVar.f34814e0 = null;
            s51Var.dismiss();
        }
    }
}
