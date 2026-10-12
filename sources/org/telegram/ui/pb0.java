package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pb0 implements Runnable {
    public final int f39176a;
    public final ac0 f39177b;

    public pb0(ac0 ac0Var, int i10) {
        this.f39176a = i10;
        this.f39177b = ac0Var;
    }

    @Override
    public final void run() {
        switch (this.f39176a) {
            case 0:
                ac0 ac0Var = this.f39177b;
                ac0Var.f34170r.f21368b.requestFocus();
                AndroidUtilities.showKeyboard(ac0Var.f34170r.f21368b);
                return;
            case 1:
                ac0 ac0Var2 = this.f39177b;
                ac0Var2.f34170r.f21368b.clearFocus();
                AndroidUtilities.hideKeyboard(ac0Var2.f34170r.f21368b);
                return;
            default:
                pf.d.s(this.f39177b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
