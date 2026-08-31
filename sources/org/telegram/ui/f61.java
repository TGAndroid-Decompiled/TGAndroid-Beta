package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class f61 extends org.telegram.ui.Components.yw0 {
    public final g61 f36768w3;

    public f61(g61 g61Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f36768w3 = g61Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f36768w3.f37104y.T != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f36768w3.d(false);
    }
}
