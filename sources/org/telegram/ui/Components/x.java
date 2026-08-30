package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.q61 {
    public final org.telegram.ui.g61[] a2;
    public final z f30464b2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.g61[] g61VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f30464b2 = zVar;
        this.a2 = g61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.g3) this.f30464b2).currentAccount;
            if (lh.t7.y(i10, false).n(tL_starGiftUnique.f19409id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f30464b2;
        zVar.f31187e0 = l10;
        zVar.X();
        zVar.W();
        org.telegram.ui.g61 g61Var = this.a2[0];
        if (g61Var != null) {
            zVar.f31188f0 = null;
            g61Var.dismiss();
        }
    }
}
