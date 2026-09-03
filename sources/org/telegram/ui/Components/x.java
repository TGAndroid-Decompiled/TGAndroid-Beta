package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.w61 {
    public final org.telegram.ui.n61[] a2;
    public final z f32869b2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.n61[] n61VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.f32869b2 = zVar;
        this.a2 = n61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f32869b2).currentAccount;
            if (mh.t7.y(i10, false).n(tL_starGiftUnique.f21072id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f32869b2;
        zVar.f33700e0 = l10;
        zVar.X();
        zVar.W();
        org.telegram.ui.n61 n61Var = this.a2[0];
        if (n61Var != null) {
            zVar.f33701f0 = null;
            n61Var.dismiss();
        }
    }
}
