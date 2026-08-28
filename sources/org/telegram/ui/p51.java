package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class p51 extends org.telegram.ui.Components.ew0 {
    public final q51 f41341v3;

    public p51(q51 q51Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.f41341v3 = q51Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f41341v3.f41692y.S != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i9) {
        super.E1(i9);
        this.f41341v3.e(false);
    }
}
