package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mb0 implements Runnable {
    public final int f35692a;
    public final xb0 f35693b;

    public mb0(xb0 xb0Var, int i10) {
        this.f35692a = i10;
        this.f35693b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f35692a) {
            case 0:
                xb0 xb0Var = this.f35693b;
                xb0Var.f39572r.f20229b.requestFocus();
                AndroidUtilities.showKeyboard(xb0Var.f39572r.f20229b);
                return;
            case 1:
                xb0 xb0Var2 = this.f35693b;
                xb0Var2.f39572r.f20229b.clearFocus();
                AndroidUtilities.hideKeyboard(xb0Var2.f39572r.f20229b);
                return;
            default:
                nf.f.s(this.f35693b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
