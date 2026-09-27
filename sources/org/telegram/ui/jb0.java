package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jb0 implements Runnable {
    public final int f34686a;
    public final ub0 f34687b;

    public jb0(ub0 ub0Var, int i10) {
        this.f34686a = i10;
        this.f34687b = ub0Var;
    }

    @Override
    public final void run() {
        switch (this.f34686a) {
            case 0:
                ub0 ub0Var = this.f34687b;
                ub0Var.f38198r.f20493b.requestFocus();
                AndroidUtilities.showKeyboard(ub0Var.f38198r.f20493b);
                return;
            case 1:
                ub0 ub0Var2 = this.f34687b;
                ub0Var2.f38198r.f20493b.clearFocus();
                AndroidUtilities.hideKeyboard(ub0Var2.f38198r.f20493b);
                return;
            default:
                nf.f.s(this.f34687b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
