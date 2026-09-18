package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nb0 implements Runnable {
    public final int f35884a;
    public final yb0 f35885b;

    public nb0(yb0 yb0Var, int i10) {
        this.f35884a = i10;
        this.f35885b = yb0Var;
    }

    @Override
    public final void run() {
        switch (this.f35884a) {
            case 0:
                yb0 yb0Var = this.f35885b;
                yb0Var.f39776r.f20455b.requestFocus();
                AndroidUtilities.showKeyboard(yb0Var.f39776r.f20455b);
                return;
            case 1:
                yb0 yb0Var2 = this.f35885b;
                yb0Var2.f39776r.f20455b.clearFocus();
                AndroidUtilities.hideKeyboard(yb0Var2.f39776r.f20455b);
                return;
            default:
                nf.f.s(this.f35885b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
