package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class q61 extends org.telegram.ui.Components.rx0 {
    public final r61 G3;

    public q61(r61 r61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.G3 = r61Var;
    }

    @Override
    public final boolean C1() {
        if (!LiteMode.isEnabled(16388) && this.G3.f39937y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void G1(int i10) {
        super.G1(i10);
        this.G3.d(false);
    }
}
