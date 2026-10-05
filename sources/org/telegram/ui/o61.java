package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class o61 extends org.telegram.ui.Components.sx0 {
    public final p61 G3;

    public o61(p61 p61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.G3 = p61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.G3.f39376y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.G3.d(false);
    }
}
