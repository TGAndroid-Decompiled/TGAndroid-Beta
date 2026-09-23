package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class n61 extends org.telegram.ui.Components.vw0 {
    public final o61 f35443z3;

    public n61(o61 o61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f35443z3 = o61Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f35443z3.f35698y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f35443z3.d(false);
    }
}
