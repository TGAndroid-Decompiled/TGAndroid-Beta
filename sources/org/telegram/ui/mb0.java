package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mb0 implements Runnable {
    public final int f34900a;
    public final xb0 f34901b;

    public mb0(xb0 xb0Var, int i10) {
        this.f34900a = i10;
        this.f34901b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f34900a) {
            case 0:
                xb0 xb0Var = this.f34901b;
                xb0Var.f38666r.f19293b.requestFocus();
                AndroidUtilities.showKeyboard(xb0Var.f38666r.f19293b);
                return;
            case 1:
                xb0 xb0Var2 = this.f34901b;
                xb0Var2.f38666r.f19293b.clearFocus();
                AndroidUtilities.hideKeyboard(xb0Var2.f38666r.f19293b);
                return;
            default:
                nf.f.s(this.f34901b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
