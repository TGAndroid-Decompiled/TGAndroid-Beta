package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f37918a;
    public final vb0 f37919b;

    public kb0(vb0 vb0Var, int i10) {
        this.f37918a = i10;
        this.f37919b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37918a) {
            case 0:
                vb0 vb0Var = this.f37919b;
                vb0Var.f41685r.f22307b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f41685r.f22307b);
                return;
            case 1:
                vb0 vb0Var2 = this.f37919b;
                vb0Var2.f41685r.f22307b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f41685r.f22307b);
                return;
            default:
                nf.f.s(this.f37919b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
