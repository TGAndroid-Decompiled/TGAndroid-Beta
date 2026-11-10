package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cy0 extends t11 {
    public final ey0 f44843e2;
    public final k11[] f44844f2;
    public final fy0 f44845g2;

    public cy0(fy0 fy0Var, fy0 fy0Var2, Activity activity, Integer num, ey0 ey0Var, k11[] k11VarArr) {
        super(fy0Var2, activity, false, num, 2, null);
        this.f44845g2 = fy0Var;
        this.f44843e2 = ey0Var;
        this.f44844f2 = k11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            fy0 fy0Var = this.f44845g2;
            i7 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            b02.a2("animated_" + l10);
            ey0 ey0Var = this.f44843e2;
            if (ey0Var != null) {
                ey0Var.a(true);
            }
            k11 k11Var = this.f44844f2[0];
            if (k11Var != null) {
                fy0Var.f45877n = null;
                k11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(d11 d11Var, ch.o0 o0Var) {
        int i7;
        fy0 fy0Var = this.f44845g2;
        i7 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2(o0Var.f6359f);
        ey0 ey0Var = this.f44843e2;
        if (ey0Var != null) {
            ey0Var.a(true);
        }
        k11 k11Var = this.f44844f2[0];
        if (k11Var != null) {
            fy0Var.f45877n = null;
            k11Var.dismiss();
        }
    }
}
