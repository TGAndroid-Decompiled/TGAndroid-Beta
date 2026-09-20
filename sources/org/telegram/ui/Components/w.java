package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.j71 {
    public final org.telegram.ui.a71[] f29884d2;
    public final y f29885e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.a71[] a71VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f29885e2 = yVar;
        this.f29884d2 = a71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f29885e2).currentAccount;
            if (yh.u5.y(i10, false).n(tL_starGiftUnique.f18553id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f29885e2;
        yVar.f30407h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.a71 a71Var = this.f29884d2[0];
        if (a71Var != null) {
            yVar.f30408i0 = null;
            a71Var.dismiss();
        }
    }
}
