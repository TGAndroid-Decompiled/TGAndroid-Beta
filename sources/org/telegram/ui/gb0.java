package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gb0 implements Runnable {
    public final int f33882a;
    public final rb0 f33883b;

    public gb0(rb0 rb0Var, int i10) {
        this.f33882a = i10;
        this.f33883b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33882a) {
            case 0:
                rb0 rb0Var = this.f33883b;
                rb0Var.f37286r.f20491b.requestFocus();
                AndroidUtilities.showKeyboard(rb0Var.f37286r.f20491b);
                return;
            case 1:
                rb0 rb0Var2 = this.f33883b;
                rb0Var2.f37286r.f20491b.clearFocus();
                AndroidUtilities.hideKeyboard(rb0Var2.f37286r.f20491b);
                return;
            default:
                nf.f.s(this.f33883b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
