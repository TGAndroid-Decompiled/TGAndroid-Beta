package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x extends org.telegram.ui.g31 {
    public final org.telegram.ui.x21[] f32348e2;
    public final z f32349f2;

    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.x21[] x21VarArr) {
        super(null, context, true, num, 15, p6Var);
        this.f32349f2 = zVar;
        this.f32348e2 = x21VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && rh.e6.y(this.f32349f2.f21584a, false).n(tL_starGiftUnique.f20022id) != null && org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f32349f2;
        zVar.Z1 = l4;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.x21 x21Var = this.f32348e2[0];
        if (x21Var != null) {
            zVar.a2 = null;
            x21Var.dismiss();
        }
    }
}
