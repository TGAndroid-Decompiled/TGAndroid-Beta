package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f39201a;
    public final vb0 f39202b;

    public kb0(vb0 vb0Var, int i10) {
        this.f39201a = i10;
        this.f39202b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39201a) {
            case 0:
                vb0 vb0Var = this.f39202b;
                vb0Var.f42808r.f22297b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f42808r.f22297b);
                return;
            case 1:
                vb0 vb0Var2 = this.f39202b;
                vb0Var2.f42808r.f22297b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f42808r.f22297b);
                return;
            default:
                of.f.s(this.f39202b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
