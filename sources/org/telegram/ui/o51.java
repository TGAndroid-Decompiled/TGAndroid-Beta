package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

public final class o51 extends org.telegram.ui.Components.gw0 {

    public final p51 f40992v3;

    public o51(p51 p51Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f40992v3 = p51Var;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(16388) || this.f40992v3.f41282y.S == 4;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f40992v3.e(false);
    }
}
