package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class k61 extends org.telegram.ui.Components.xw0 {
    public final l61 f35435w3;

    public k61(l61 l61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f35435w3 = l61Var;
    }

    @Override
    public final void D1(int i10) {
        super.D1(i10);
        this.f35435w3.d(false);
    }

    @Override
    public final boolean z1() {
        if (!LiteMode.isEnabled(16388) && this.f35435w3.f35664y.T != 4) {
            return false;
        }
        return true;
    }
}
