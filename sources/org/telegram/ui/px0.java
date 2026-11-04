package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class px0 extends g11 {
    public final rx0 f48702f2;
    public final x01[] f48703g2;
    public final sx0 f48704h2;

    public px0(sx0 sx0Var, sx0 sx0Var2, Activity activity, Integer num, rx0 rx0Var, x01[] x01VarArr) {
        super(sx0Var2, activity, false, num, 2, null);
        this.f48704h2 = sx0Var;
        this.f48702f2 = rx0Var;
        this.f48703g2 = x01VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i3;
        if (l10 != null) {
            sx0 sx0Var = this.f48704h2;
            i3 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i3);
            b02.a2("animated_" + l10);
            rx0 rx0Var = this.f48702f2;
            if (rx0Var != null) {
                rx0Var.a(true);
            }
            x01 x01Var = this.f48703g2[0];
            if (x01Var != null) {
                sx0Var.f49645n = null;
                x01Var.dismiss();
            }
        }
    }

    @Override
    public final void r(q01 q01Var, dh.n0 n0Var) {
        int i3;
        sx0 sx0Var = this.f48704h2;
        i3 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        org.telegram.messenger.li.b0(i3).a2(n0Var.f9097f);
        rx0 rx0Var = this.f48702f2;
        if (rx0Var != null) {
            rx0Var.a(true);
        }
        x01 x01Var = this.f48703g2[0];
        if (x01Var != null) {
            sx0Var.f49645n = null;
            x01Var.dismiss();
        }
    }
}
