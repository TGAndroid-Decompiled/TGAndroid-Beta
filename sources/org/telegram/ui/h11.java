package org.telegram.ui;

import android.content.Context;
public final class h11 extends org.telegram.ui.Components.lv0 {
    public final k01 H3;

    public h11(k01 k01Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.H3 = k01Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.qc.e(16388) && this.H3.G.f51823a0 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}
