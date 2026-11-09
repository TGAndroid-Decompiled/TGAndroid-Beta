package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class by0 extends s11 {
    public final dy0 f44160e2;
    public final j11[] f44161f2;
    public final ey0 f44162g2;

    public by0(ey0 ey0Var, ey0 ey0Var2, Activity activity, Integer num, dy0 dy0Var, j11[] j11VarArr) {
        super(ey0Var2, activity, false, num, 2, null);
        this.f44162g2 = ey0Var;
        this.f44160e2 = dy0Var;
        this.f44161f2 = j11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            ey0 ey0Var = this.f44162g2;
            i7 = ((org.telegram.ui.ActionBar.f2) ey0Var).currentAccount;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            b02.a2("animated_" + l10);
            dy0 dy0Var = this.f44160e2;
            if (dy0Var != null) {
                dy0Var.a(true);
            }
            j11 j11Var = this.f44161f2[0];
            if (j11Var != null) {
                ey0Var.f45540n = null;
                j11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(c11 c11Var, ch.o0 o0Var) {
        int i7;
        ey0 ey0Var = this.f44162g2;
        i7 = ((org.telegram.ui.ActionBar.f2) ey0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2(o0Var.f6354f);
        dy0 dy0Var = this.f44160e2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        j11 j11Var = this.f44161f2[0];
        if (j11Var != null) {
            ey0Var.f45540n = null;
            j11Var.dismiss();
        }
    }
}
