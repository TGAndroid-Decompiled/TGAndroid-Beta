package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa0 implements Runnable {
    public final int f40176a;
    public final ab0 f40177b;

    public pa0(ab0 ab0Var, int i10) {
        this.f40176a = i10;
        this.f40177b = ab0Var;
    }

    @Override
    public final void run() {
        switch (this.f40176a) {
            case 0:
                ab0 ab0Var = this.f40177b;
                ab0Var.f35337r.f22406b.requestFocus();
                AndroidUtilities.showKeyboard(ab0Var.f35337r.f22406b);
                return;
            case 1:
                ab0 ab0Var2 = this.f40177b;
                ab0Var2.f35337r.f22406b.clearFocus();
                AndroidUtilities.hideKeyboard(ab0Var2.f35337r.f22406b);
                return;
            default:
                pf.d.r(this.f40177b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
