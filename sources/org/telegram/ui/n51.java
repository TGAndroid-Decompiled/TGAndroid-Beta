package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class n51 extends org.telegram.ui.Components.px0 {
    public final o51 f39302x3;

    public n51(o51 o51Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f39302x3 = o51Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f39302x3.f39680y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f39302x3.e(false);
    }
}
