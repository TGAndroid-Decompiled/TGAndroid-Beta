package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.r61 {
    public final org.telegram.ui.i61[] a2;
    public final z f32876b2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.i61[] i61VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.f32876b2 = zVar;
        this.a2 = i61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f32876b2).currentAccount;
            if (mh.t7.y(i10, false).n(tL_starGiftUnique.f21070id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f32876b2;
        zVar.f33658e0 = l10;
        zVar.X();
        zVar.W();
        org.telegram.ui.i61 i61Var = this.a2[0];
        if (i61Var != null) {
            zVar.f33659f0 = null;
            i61Var.dismiss();
        }
    }
}
