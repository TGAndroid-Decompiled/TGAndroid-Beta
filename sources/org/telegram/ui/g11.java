package org.telegram.ui;

import android.content.Context;
public final class g11 extends org.telegram.ui.Components.iv0 {
    public final j01 H3;

    public g11(j01 j01Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.H3 = j01Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.pc.e(16388) && this.H3.G.f51417a0 != 4) {
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
