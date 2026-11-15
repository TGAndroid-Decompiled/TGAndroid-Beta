package org.telegram.ui;

import android.content.Context;
public final class c11 extends org.telegram.ui.Components.av0 {
    public final f01 H3;

    public c11(f01 f01Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.H3 = f01Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.qc.e(16388) && this.H3.G.f49365a0 != 4) {
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
