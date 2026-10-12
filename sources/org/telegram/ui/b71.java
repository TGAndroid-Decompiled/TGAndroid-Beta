package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class b71 extends org.telegram.ui.Components.ey0 {
    public final c71 f36103x3;

    public b71(c71 c71Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f36103x3 = c71Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f36103x3.f36365y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f36103x3.d(false);
    }
}
