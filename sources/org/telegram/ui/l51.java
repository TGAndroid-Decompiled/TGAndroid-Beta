package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class l51 extends org.telegram.ui.Components.rx0 {
    public final m51 f38803x3;

    public l51(m51 m51Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f38803x3 = m51Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f38803x3.f39126y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f38803x3.e(false);
    }
}
