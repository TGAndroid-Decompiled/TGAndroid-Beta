package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class d61 extends org.telegram.ui.Components.xw0 {
    public final e61 f33524w3;

    public d61(e61 e61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f33524w3 = e61Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f33524w3.f33911y.T != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f33524w3.d(false);
    }
}
