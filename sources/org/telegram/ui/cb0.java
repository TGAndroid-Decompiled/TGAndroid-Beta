package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cb0 implements Runnable {
    public final int f35759a;
    public final ob0 f35760b;

    public cb0(ob0 ob0Var, int i10) {
        this.f35759a = i10;
        this.f35760b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f35759a) {
            case 0:
                ob0 ob0Var = this.f35760b;
                ob0Var.f39709r.f22955b.requestFocus();
                AndroidUtilities.showKeyboard(ob0Var.f39709r.f22955b);
                return;
            case 1:
                ob0 ob0Var2 = this.f35760b;
                ob0Var2.f39709r.f22955b.clearFocus();
                AndroidUtilities.hideKeyboard(ob0Var2.f39709r.f22955b);
                return;
            default:
                af.g.s(this.f35760b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
