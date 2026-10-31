package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.i31 {
    public final org.telegram.ui.z21[] f32289e2;
    public final z f32290f2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.z21[] z21VarArr) {
        super(null, context, true, num, 15, p6Var);
        this.f32290f2 = zVar;
        this.f32289e2 = z21VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && rh.e6.y(this.f32290f2.f21583a, false).n(tL_starGiftUnique.f20021id) != null && org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f32290f2;
        zVar.Z1 = l4;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.z21 z21Var = this.f32289e2[0];
        if (z21Var != null) {
            zVar.a2 = null;
            z21Var.dismiss();
        }
    }
}
