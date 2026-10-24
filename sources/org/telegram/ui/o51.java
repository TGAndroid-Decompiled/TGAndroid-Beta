package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class o51 extends org.telegram.ui.Components.tx0 {
    public final p51 A3;

    public o51(p51 p51Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.A3 = p51Var;
    }

    @Override
    public final boolean G1() {
        if (!LiteMode.isEnabled(16388) && this.A3.F.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void K1(int i10) {
        super.K1(i10);
        this.A3.d(false);
    }
}
