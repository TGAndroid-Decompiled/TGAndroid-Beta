package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa0 implements Runnable {
    public final int f40175a;
    public final ab0 f40176b;

    public pa0(ab0 ab0Var, int i10) {
        this.f40175a = i10;
        this.f40176b = ab0Var;
    }

    @Override
    public final void run() {
        switch (this.f40175a) {
            case 0:
                ab0 ab0Var = this.f40176b;
                ab0Var.f35324r.f22401b.requestFocus();
                AndroidUtilities.showKeyboard(ab0Var.f35324r.f22401b);
                return;
            case 1:
                ab0 ab0Var2 = this.f40176b;
                ab0Var2.f35324r.f22401b.clearFocus();
                AndroidUtilities.hideKeyboard(ab0Var2.f35324r.f22401b);
                return;
            default:
                pf.d.r(this.f40176b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
