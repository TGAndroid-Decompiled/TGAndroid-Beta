package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class f71 extends org.telegram.ui.Components.ux0 {
    public final g71 f35470x3;

    public f71(g71 g71Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f35470x3 = g71Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f35470x3.f36093y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f35470x3.e(false);
    }
}
