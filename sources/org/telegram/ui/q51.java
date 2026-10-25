package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class q51 extends org.telegram.ui.Components.by0 {
    public final r51 H3;

    public q51(r51 r51Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.H3 = r51Var;
    }

    @Override
    public final boolean G1() {
        if (!LiteMode.isEnabled(16388) && this.H3.F.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void K1(int i10) {
        super.K1(i10);
        this.H3.d(false);
    }
}
