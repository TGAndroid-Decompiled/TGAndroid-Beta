package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cb0 implements Runnable {
    public final int f35748a;
    public final ob0 f35749b;

    public cb0(ob0 ob0Var, int i10) {
        this.f35748a = i10;
        this.f35749b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f35748a) {
            case 0:
                ob0 ob0Var = this.f35749b;
                ob0Var.f39645r.f22957b.requestFocus();
                AndroidUtilities.showKeyboard(ob0Var.f39645r.f22957b);
                return;
            case 1:
                ob0 ob0Var2 = this.f35749b;
                ob0Var2.f39645r.f22957b.clearFocus();
                AndroidUtilities.hideKeyboard(ob0Var2.f39645r.f22957b);
                return;
            default:
                af.g.s(this.f35749b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
