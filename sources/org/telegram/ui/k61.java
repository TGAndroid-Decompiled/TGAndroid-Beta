package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class k61 extends org.telegram.ui.Components.xw0 {
    public final l61 f38197w3;

    public k61(l61 l61Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f38197w3 = l61Var;
    }

    @Override
    public final void D1(int i10) {
        super.D1(i10);
        this.f38197w3.d(false);
    }

    @Override
    public final boolean z1() {
        if (!LiteMode.isEnabled(16388) && this.f38197w3.f38561y.T != 4) {
            return false;
        }
        return true;
    }
}
