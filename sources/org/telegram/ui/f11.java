package org.telegram.ui;

import android.content.Context;
public final class f11 extends org.telegram.ui.Components.yu0 {
    public final i01 G3;

    public f11(i01 i01Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.G3 = i01Var;
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
