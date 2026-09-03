package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class db0 implements Runnable {
    public final int f33399a;
    public final pb0 f33400b;

    public db0(pb0 pb0Var, int i10) {
        this.f33399a = i10;
        this.f33400b = pb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33399a) {
            case 0:
                pb0 pb0Var = this.f33400b;
                pb0Var.f37065r.f21132b.requestFocus();
                AndroidUtilities.showKeyboard(pb0Var.f37065r.f21132b);
                return;
            case 1:
                pb0 pb0Var2 = this.f33400b;
                pb0Var2.f37065r.f21132b.clearFocus();
                AndroidUtilities.hideKeyboard(pb0Var2.f37065r.f21132b);
                return;
            default:
                ze.d.s(this.f33400b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
