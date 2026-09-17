package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ob0 implements Runnable {
    public final int f36287a;
    public final zb0 f36288b;

    public ob0(zb0 zb0Var, int i10) {
        this.f36287a = i10;
        this.f36288b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36287a) {
            case 0:
                zb0 zb0Var = this.f36288b;
                zb0Var.f40204r.f20239b.requestFocus();
                AndroidUtilities.showKeyboard(zb0Var.f40204r.f20239b);
                return;
            case 1:
                zb0 zb0Var2 = this.f36288b;
                zb0Var2.f40204r.f20239b.clearFocus();
                AndroidUtilities.hideKeyboard(zb0Var2.f40204r.f20239b);
                return;
            default:
                nf.f.s(this.f36288b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
