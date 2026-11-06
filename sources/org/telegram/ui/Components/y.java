package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y extends org.telegram.ui.q11 {
    public final org.telegram.ui.h11[] f40472e2;
    public final a0 f40473f2;

    public y(a0 a0Var, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.h11[] h11VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f40473f2 = a0Var;
        this.f40472e2 = h11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && bi.ea.y(this.f40473f2.f28612a, false).n(tL_starGiftUnique.f27181id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.f40473f2;
        a0Var.Z1 = l10;
        a0Var.f1();
        a0Var.e1();
        org.telegram.ui.h11 h11Var = this.f40472e2[0];
        if (h11Var != null) {
            a0Var.f31614a2 = null;
            h11Var.dismiss();
        }
    }
}
