package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gb0 implements Runnable {
    public final int f33883a;
    public final rb0 f33884b;

    public gb0(rb0 rb0Var, int i10) {
        this.f33883a = i10;
        this.f33884b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33883a) {
            case 0:
                rb0 rb0Var = this.f33884b;
                rb0Var.f37287r.f20492b.requestFocus();
                AndroidUtilities.showKeyboard(rb0Var.f37287r.f20492b);
                return;
            case 1:
                rb0 rb0Var2 = this.f33884b;
                rb0Var2.f37287r.f20492b.clearFocus();
                AndroidUtilities.hideKeyboard(rb0Var2.f37287r.f20492b);
                return;
            default:
                nf.f.s(this.f33884b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
