package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gb0 implements Runnable {
    public final int f33867a;
    public final rb0 f33868b;

    public gb0(rb0 rb0Var, int i10) {
        this.f33867a = i10;
        this.f33868b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33867a) {
            case 0:
                rb0 rb0Var = this.f33868b;
                rb0Var.f37274r.f20477b.requestFocus();
                AndroidUtilities.showKeyboard(rb0Var.f37274r.f20477b);
                return;
            case 1:
                rb0 rb0Var2 = this.f33868b;
                rb0Var2.f37274r.f20477b.clearFocus();
                AndroidUtilities.hideKeyboard(rb0Var2.f37274r.f20477b);
                return;
            default:
                nf.f.s(this.f33868b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
