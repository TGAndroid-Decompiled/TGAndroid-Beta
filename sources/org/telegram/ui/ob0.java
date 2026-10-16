package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ob0 implements Runnable {
    public final int f38598a;
    public final zb0 f38599b;

    public ob0(zb0 zb0Var, int i10) {
        this.f38598a = i10;
        this.f38599b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38598a) {
            case 0:
                zb0 zb0Var = this.f38599b;
                zb0Var.f42266r.f21083b.requestFocus();
                AndroidUtilities.showKeyboard(zb0Var.f42266r.f21083b);
                return;
            case 1:
                zb0 zb0Var2 = this.f38599b;
                zb0Var2.f42266r.f21083b.clearFocus();
                AndroidUtilities.hideKeyboard(zb0Var2.f42266r.f21083b);
                return;
            default:
                pf.d.r(this.f38599b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
