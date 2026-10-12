package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lb0 implements Runnable {
    public final int f39682a;
    public final wb0 f39683b;

    public lb0(wb0 wb0Var, int i10) {
        this.f39682a = i10;
        this.f39683b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39682a) {
            case 0:
                wb0 wb0Var = this.f39683b;
                wb0Var.f43125r.f22081b.requestFocus();
                AndroidUtilities.showKeyboard(wb0Var.f43125r.f22081b);
                return;
            case 1:
                wb0 wb0Var2 = this.f39683b;
                wb0Var2.f43125r.f22081b.clearFocus();
                AndroidUtilities.hideKeyboard(wb0Var2.f43125r.f22081b);
                return;
            default:
                of.f.s(this.f39683b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
