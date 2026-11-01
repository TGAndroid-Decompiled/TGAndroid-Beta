package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lz0 extends g31 {
    public final nz0 f39405e2;
    public final x21[] f39406f2;
    public final oz0 f39407g2;

    public lz0(oz0 oz0Var, oz0 oz0Var2, Activity activity, Integer num, nz0 nz0Var, x21[] x21VarArr) {
        super(oz0Var2, activity, false, num, 2, null);
        this.f39407g2 = oz0Var;
        this.f39405e2 = nz0Var;
        this.f39406f2 = x21VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            oz0 oz0Var = this.f39407g2;
            i10 = ((org.telegram.ui.ActionBar.k2) oz0Var).currentAccount;
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i10);
            b02.a2("animated_" + l4);
            nz0 nz0Var = this.f39405e2;
            if (nz0Var != null) {
                nz0Var.a(true);
            }
            x21 x21Var = this.f39406f2[0];
            if (x21Var != null) {
                oz0Var.f40311n = null;
                x21Var.dismiss();
            }
        }
    }

    @Override
    public final void r(q21 q21Var, sg.o0 o0Var) {
        int i10;
        oz0 oz0Var = this.f39407g2;
        i10 = ((org.telegram.ui.ActionBar.k2) oz0Var).currentAccount;
        org.telegram.messenger.vi.b0(i10).a2(o0Var.f48445f);
        nz0 nz0Var = this.f39405e2;
        if (nz0Var != null) {
            nz0Var.a(true);
        }
        x21 x21Var = this.f39406f2[0];
        if (x21Var != null) {
            oz0Var.f40311n = null;
            x21Var.dismiss();
        }
    }
}
