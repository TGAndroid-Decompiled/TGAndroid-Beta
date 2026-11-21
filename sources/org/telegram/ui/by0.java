package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class by0 extends s11 {
    public final dy0 f46333f2;
    public final j11[] f46334g2;
    public final ey0 f46335h2;

    public by0(ey0 ey0Var, ey0 ey0Var2, Activity activity, Integer num, dy0 dy0Var, j11[] j11VarArr) {
        super(ey0Var2, activity, false, num, 2, null);
        this.f46335h2 = ey0Var;
        this.f46333f2 = dy0Var;
        this.f46334g2 = j11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            ey0 ey0Var = this.f46335h2;
            i7 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
            d02.f2("animated_" + l10);
            dy0 dy0Var = this.f46333f2;
            if (dy0Var != null) {
                dy0Var.a(true);
            }
            j11 j11Var = this.f46334g2[0];
            if (j11Var != null) {
                ey0Var.f47414n = null;
                j11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(c11 c11Var, ch.p0 p0Var) {
        int i7;
        ey0 ey0Var = this.f46335h2;
        i7 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2(p0Var.f5504f);
        dy0 dy0Var = this.f46333f2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        j11 j11Var = this.f46334g2[0];
        if (j11Var != null) {
            ey0Var.f47414n = null;
            j11Var.dismiss();
        }
    }
}
