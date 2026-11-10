package org.telegram.ui;

import android.content.Context;
public final class i11 extends org.telegram.ui.Components.zu0 {
    public final l01 G3;

    public i11(l01 l01Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.G3 = l01Var;
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
