package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.z51 {
    public final org.telegram.ui.q51[] f31941d2;
    public final y f31942e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.q51[] q51VarArr) {
        super(null, context, true, num, 15, d6Var);
        this.f31942e2 = yVar;
        this.f31941d2 = q51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f31942e2).currentAccount;
            if (ai.fa.y(i10, false).n(tL_starGiftUnique.f20496id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f31942e2;
        yVar.f32489h0 = l4;
        yVar.Y();
        yVar.X();
        org.telegram.ui.q51 q51Var = this.f31941d2[0];
        if (q51Var != null) {
            yVar.f32490i0 = null;
            q51Var.dismiss();
        }
    }
}
