package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jb0 implements Runnable {
    public final int f38965a;
    public final ub0 f38966b;

    public jb0(ub0 ub0Var, int i10) {
        this.f38965a = i10;
        this.f38966b = ub0Var;
    }

    @Override
    public final void run() {
        switch (this.f38965a) {
            case 0:
                ub0 ub0Var = this.f38966b;
                ub0Var.f42510r.f22289b.requestFocus();
                AndroidUtilities.showKeyboard(ub0Var.f42510r.f22289b);
                return;
            case 1:
                ub0 ub0Var2 = this.f38966b;
                ub0Var2.f42510r.f22289b.clearFocus();
                AndroidUtilities.hideKeyboard(ub0Var2.f42510r.f22289b);
                return;
            default:
                of.f.s(this.f38966b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
