package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mb0 implements Runnable {
    public final int f35685a;
    public final xb0 f35686b;

    public mb0(xb0 xb0Var, int i10) {
        this.f35685a = i10;
        this.f35686b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f35685a) {
            case 0:
                xb0 xb0Var = this.f35686b;
                xb0Var.f39581r.f20190b.requestFocus();
                AndroidUtilities.showKeyboard(xb0Var.f39581r.f20190b);
                return;
            case 1:
                xb0 xb0Var2 = this.f35686b;
                xb0Var2.f39581r.f20190b.clearFocus();
                AndroidUtilities.hideKeyboard(xb0Var2.f39581r.f20190b);
                return;
            default:
                nf.f.s(this.f35686b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
