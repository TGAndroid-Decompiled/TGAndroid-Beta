package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f37917a;
    public final vb0 f37918b;

    public kb0(vb0 vb0Var, int i10) {
        this.f37917a = i10;
        this.f37918b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37917a) {
            case 0:
                vb0 vb0Var = this.f37918b;
                vb0Var.f41684r.f22306b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f41684r.f22306b);
                return;
            case 1:
                vb0 vb0Var2 = this.f37918b;
                vb0Var2.f41684r.f22306b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f41684r.f22306b);
                return;
            default:
                nf.f.s(this.f37918b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
