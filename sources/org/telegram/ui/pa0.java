package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa0 implements Runnable {
    public final int f40172a;
    public final ab0 f40173b;

    public pa0(ab0 ab0Var, int i10) {
        this.f40172a = i10;
        this.f40173b = ab0Var;
    }

    @Override
    public final void run() {
        switch (this.f40172a) {
            case 0:
                ab0 ab0Var = this.f40173b;
                ab0Var.f35332r.f22402b.requestFocus();
                AndroidUtilities.showKeyboard(ab0Var.f35332r.f22402b);
                return;
            case 1:
                ab0 ab0Var2 = this.f40173b;
                ab0Var2.f35332r.f22402b.clearFocus();
                AndroidUtilities.hideKeyboard(ab0Var2.f35332r.f22402b);
                return;
            default:
                pf.d.r(this.f40173b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
