package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w extends org.telegram.ui.k71 {
    public final org.telegram.ui.b71[] f32488d2;
    public final y f32489e2;

    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.b71[] b71VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.f32489e2 = yVar;
        this.f32488d2 = b71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f32489e2).currentAccount;
            if (yh.m5.y(i10, false).n(tL_starGiftUnique.f20265id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f32489e2;
        yVar.f33059h0 = l4;
        yVar.Y();
        yVar.X();
        org.telegram.ui.b71 b71Var = this.f32488d2[0];
        if (b71Var != null) {
            yVar.f33060i0 = null;
            b71Var.dismiss();
        }
    }
}
