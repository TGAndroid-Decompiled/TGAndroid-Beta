package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.j71 {
    public final org.telegram.ui.a71[] f32368d2;
    public final z f32369e2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.a71[] a71VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f32369e2 = zVar;
        this.f32368d2 = a71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f32369e2).currentAccount;
            if (zh.s5.y(i10, false).n(tL_starGiftUnique.f20097id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f32369e2;
        zVar.f33032h0 = l4;
        zVar.X();
        zVar.W();
        org.telegram.ui.a71 a71Var = this.f32368d2[0];
        if (a71Var != null) {
            zVar.f33033i0 = null;
            a71Var.dismiss();
        }
    }
}
