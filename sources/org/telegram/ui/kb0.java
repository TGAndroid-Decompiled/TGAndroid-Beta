package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f37946a;
    public final vb0 f37947b;

    public kb0(vb0 vb0Var, int i10) {
        this.f37946a = i10;
        this.f37947b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37946a) {
            case 0:
                vb0 vb0Var = this.f37947b;
                vb0Var.f41699r.f22315b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f41699r.f22315b);
                return;
            case 1:
                vb0 vb0Var2 = this.f37947b;
                vb0Var2.f41699r.f22315b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f41699r.f22315b);
                return;
            default:
                nf.f.s(this.f37947b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
