package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class o61 extends org.telegram.ui.Components.hx0 {
    public final p61 f36061z3;

    public o61(p61 p61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f36061z3 = p61Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f36061z3.f36416y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f36061z3.d(false);
    }
}
