package org.telegram.ui;

import android.content.Context;
public final class f11 extends org.telegram.ui.Components.kv0 {
    public final i01 H3;

    public f11(i01 i01Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.H3 = i01Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.pc.e(16388) && this.H3.G.f51226a0 != 4) {
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
