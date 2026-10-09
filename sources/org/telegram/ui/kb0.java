package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f39203a;
    public final vb0 f39204b;

    public kb0(vb0 vb0Var, int i10) {
        this.f39203a = i10;
        this.f39204b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39203a) {
            case 0:
                vb0 vb0Var = this.f39204b;
                vb0Var.f42810r.f22297b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f42810r.f22297b);
                return;
            case 1:
                vb0 vb0Var2 = this.f39204b;
                vb0Var2.f42810r.f22297b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f42810r.f22297b);
                return;
            default:
                of.f.s(this.f39204b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
