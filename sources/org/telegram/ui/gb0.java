package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gb0 implements Runnable {
    public final int f34023a;
    public final rb0 f34024b;

    public gb0(rb0 rb0Var, int i10) {
        this.f34023a = i10;
        this.f34024b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f34023a) {
            case 0:
                rb0 rb0Var = this.f34024b;
                rb0Var.f37388r.f20508b.requestFocus();
                AndroidUtilities.showKeyboard(rb0Var.f37388r.f20508b);
                return;
            case 1:
                rb0 rb0Var2 = this.f34024b;
                rb0Var2.f37388r.f20508b.clearFocus();
                AndroidUtilities.hideKeyboard(rb0Var2.f37388r.f20508b);
                return;
            default:
                nf.f.s(this.f34024b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
