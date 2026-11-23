package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g0 extends org.telegram.ui.r11 {
    public final org.telegram.ui.i11[] f35306f2;
    public final i0 f35307g2;

    public g0(i0 i0Var, Context context, Integer num, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.i11[] i11VarArr) {
        super(null, context, true, num, 15, h6Var);
        this.f35307g2 = i0Var;
        this.f35306f2 = i11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && di.y8.y(this.f35307g2.f30139a, false).n(tL_starGiftUnique.f28627id) != null && org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        i0 i0Var = this.f35307g2;
        i0Var.d2 = l10;
        i0Var.g1();
        i0Var.f1();
        org.telegram.ui.i11 i11Var = this.f35306f2[0];
        if (i11Var != null) {
            i0Var.f36015e2 = null;
            i11Var.dismiss();
        }
    }
}
