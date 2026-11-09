package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y extends org.telegram.ui.s11 {
    public final org.telegram.ui.j11[] f40532e2;
    public final a0 f40533f2;

    public y(a0 a0Var, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.j11[] j11VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.f40533f2 = a0Var;
        this.f40532e2 = j11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && bi.ea.y(this.f40533f2.f28621a, false).n(tL_starGiftUnique.f27185id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.f40533f2;
        a0Var.Z1 = l10;
        a0Var.f1();
        a0Var.e1();
        org.telegram.ui.j11 j11Var = this.f40532e2[0];
        if (j11Var != null) {
            a0Var.f31624a2 = null;
            j11Var.dismiss();
        }
    }
}
