package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lb0 implements Runnable {
    public final int f39688a;
    public final wb0 f39689b;

    public lb0(wb0 wb0Var, int i10) {
        this.f39688a = i10;
        this.f39689b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39688a) {
            case 0:
                wb0 wb0Var = this.f39689b;
                wb0Var.f43123r.f22080b.requestFocus();
                AndroidUtilities.showKeyboard(wb0Var.f43123r.f22080b);
                return;
            case 1:
                wb0 wb0Var2 = this.f39689b;
                wb0Var2.f43123r.f22080b.clearFocus();
                AndroidUtilities.hideKeyboard(wb0Var2.f43123r.f22080b);
                return;
            default:
                of.f.s(this.f39689b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
