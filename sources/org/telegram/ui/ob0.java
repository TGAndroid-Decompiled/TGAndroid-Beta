package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ob0 implements Runnable {
    public final int f36259a;
    public final zb0 f36260b;

    public ob0(zb0 zb0Var, int i10) {
        this.f36259a = i10;
        this.f36260b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36259a) {
            case 0:
                zb0 zb0Var = this.f36260b;
                zb0Var.f40162r.f20527b.requestFocus();
                AndroidUtilities.showKeyboard(zb0Var.f40162r.f20527b);
                return;
            case 1:
                zb0 zb0Var2 = this.f36260b;
                zb0Var2.f40162r.f20527b.clearFocus();
                AndroidUtilities.hideKeyboard(zb0Var2.f40162r.f20527b);
                return;
            default:
                nf.f.s(this.f36260b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
