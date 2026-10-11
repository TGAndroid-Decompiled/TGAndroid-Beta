package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jb0 implements Runnable {
    public final int f38999a;
    public final ub0 f39000b;

    public jb0(ub0 ub0Var, int i10) {
        this.f38999a = i10;
        this.f39000b = ub0Var;
    }

    @Override
    public final void run() {
        switch (this.f38999a) {
            case 0:
                ub0 ub0Var = this.f39000b;
                ub0Var.f42544r.f22325b.requestFocus();
                AndroidUtilities.showKeyboard(ub0Var.f42544r.f22325b);
                return;
            case 1:
                ub0 ub0Var2 = this.f39000b;
                ub0Var2.f42544r.f22325b.clearFocus();
                AndroidUtilities.hideKeyboard(ub0Var2.f42544r.f22325b);
                return;
            default:
                of.f.s(this.f39000b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
