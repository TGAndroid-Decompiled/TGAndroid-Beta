package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class q61 extends org.telegram.ui.Components.ix0 {
    public final r61 f36620z3;

    public q61(r61 r61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f36620z3 = r61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f36620z3.f37015y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f36620z3.d(false);
    }
}
