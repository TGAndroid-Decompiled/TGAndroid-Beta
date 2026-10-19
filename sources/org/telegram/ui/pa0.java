package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa0 implements Runnable {
    public final int f40166a;
    public final ab0 f40167b;

    public pa0(ab0 ab0Var, int i10) {
        this.f40166a = i10;
        this.f40167b = ab0Var;
    }

    @Override
    public final void run() {
        switch (this.f40166a) {
            case 0:
                ab0 ab0Var = this.f40167b;
                ab0Var.f35326r.f22399b.requestFocus();
                AndroidUtilities.showKeyboard(ab0Var.f35326r.f22399b);
                return;
            case 1:
                ab0 ab0Var2 = this.f40167b;
                ab0Var2.f35326r.f22399b.clearFocus();
                AndroidUtilities.hideKeyboard(ab0Var2.f35326r.f22399b);
                return;
            default:
                pf.d.r(this.f40167b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
