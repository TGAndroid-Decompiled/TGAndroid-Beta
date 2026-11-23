package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g0 extends org.telegram.ui.s11 {
    public final org.telegram.ui.j11[] f35344f2;
    public final i0 f35345g2;

    public g0(i0 i0Var, Context context, Integer num, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.j11[] j11VarArr) {
        super(null, context, true, num, 15, h6Var);
        this.f35345g2 = i0Var;
        this.f35344f2 = j11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && di.y8.y(this.f35345g2.f30173a, false).n(tL_starGiftUnique.f28663id) != null && org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        i0 i0Var = this.f35345g2;
        i0Var.d2 = l10;
        i0Var.g1();
        i0Var.f1();
        org.telegram.ui.j11 j11Var = this.f35344f2[0];
        if (j11Var != null) {
            i0Var.f36060e2 = null;
            j11Var.dismiss();
        }
    }
}
