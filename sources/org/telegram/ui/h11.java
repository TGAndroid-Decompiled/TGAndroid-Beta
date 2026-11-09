package org.telegram.ui;

import android.content.Context;
public final class h11 extends org.telegram.ui.Components.av0 {
    public final k01 G3;

    public h11(k01 k01Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.G3 = k01Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.sc.e(16388) && this.G3.F.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.G3.d(false);
    }
}
