package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f37923a;
    public final vb0 f37924b;

    public kb0(vb0 vb0Var, int i10) {
        this.f37923a = i10;
        this.f37924b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37923a) {
            case 0:
                vb0 vb0Var = this.f37924b;
                vb0Var.f41692r.f22311b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f41692r.f22311b);
                return;
            case 1:
                vb0 vb0Var2 = this.f37924b;
                vb0Var2.f41692r.f22311b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f41692r.f22311b);
                return;
            default:
                nf.f.s(this.f37924b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
