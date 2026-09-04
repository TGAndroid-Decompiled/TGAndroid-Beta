package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mb0 implements Runnable {
    public final int f38606a;
    public final xb0 f38607b;

    public mb0(xb0 xb0Var, int i10) {
        this.f38606a = i10;
        this.f38607b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38606a) {
            case 0:
                xb0 xb0Var = this.f38607b;
                xb0Var.f42677r.f22074b.requestFocus();
                AndroidUtilities.showKeyboard(xb0Var.f42677r.f22074b);
                return;
            case 1:
                xb0 xb0Var2 = this.f38607b;
                xb0Var2.f42677r.f22074b.clearFocus();
                AndroidUtilities.hideKeyboard(xb0Var2.f42677r.f22074b);
                return;
            default:
                of.f.s(this.f38607b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
