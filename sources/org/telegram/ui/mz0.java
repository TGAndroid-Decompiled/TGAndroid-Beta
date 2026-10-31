package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mz0 extends i31 {
    public final oz0 f39795e2;
    public final z21[] f39796f2;
    public final pz0 f39797g2;

    public mz0(pz0 pz0Var, pz0 pz0Var2, Activity activity, Integer num, oz0 oz0Var, z21[] z21VarArr) {
        super(pz0Var2, activity, false, num, 2, null);
        this.f39797g2 = pz0Var;
        this.f39795e2 = oz0Var;
        this.f39796f2 = z21VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            pz0 pz0Var = this.f39797g2;
            i10 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            b02.a2("animated_" + l4);
            oz0 oz0Var = this.f39795e2;
            if (oz0Var != null) {
                oz0Var.a(true);
            }
            z21 z21Var = this.f39796f2[0];
            if (z21Var != null) {
                pz0Var.f40830n = null;
                z21Var.dismiss();
            }
        }
    }

    @Override
    public final void r(s21 s21Var, sg.o0 o0Var) {
        int i10;
        pz0 pz0Var = this.f39797g2;
        i10 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        org.telegram.messenger.ui.b0(i10).a2(o0Var.f48434f);
        oz0 oz0Var = this.f39795e2;
        if (oz0Var != null) {
            oz0Var.a(true);
        }
        z21 z21Var = this.f39796f2[0];
        if (z21Var != null) {
            pz0Var.f40830n = null;
            z21Var.dismiss();
        }
    }
}
