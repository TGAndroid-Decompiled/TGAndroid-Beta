package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qa0 implements Runnable {
    public final int f41732a;
    public final bb0 f41733b;

    public qa0(bb0 bb0Var, int i9) {
        this.f41732a = i9;
        this.f41733b = bb0Var;
    }

    @Override
    public final void run() {
        switch (this.f41732a) {
            case 0:
                bb0 bb0Var = this.f41733b;
                bb0Var.f36814r.f24544b.requestFocus();
                AndroidUtilities.showKeyboard(bb0Var.f36814r.f24544b);
                return;
            case 1:
                bb0 bb0Var2 = this.f41733b;
                bb0Var2.f36814r.f24544b.clearFocus();
                AndroidUtilities.hideKeyboard(bb0Var2.f36814r.f24544b);
                return;
            default:
                ve.e.s(this.f41733b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
