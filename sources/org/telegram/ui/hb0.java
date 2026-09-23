package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hb0 implements Runnable {
    public final int f33801a;
    public final sb0 f33802b;

    public hb0(sb0 sb0Var, int i10) {
        this.f33801a = i10;
        this.f33802b = sb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33801a) {
            case 0:
                sb0 sb0Var = this.f33802b;
                sb0Var.f37231r.f20177b.requestFocus();
                AndroidUtilities.showKeyboard(sb0Var.f37231r.f20177b);
                return;
            case 1:
                sb0 sb0Var2 = this.f33802b;
                sb0Var2.f37231r.f20177b.clearFocus();
                AndroidUtilities.hideKeyboard(sb0Var2.f37231r.f20177b);
                return;
            default:
                nf.f.s(this.f33802b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
