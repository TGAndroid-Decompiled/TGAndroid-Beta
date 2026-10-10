package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kb0 implements Runnable {
    public final int f39247a;
    public final vb0 f39248b;

    public kb0(vb0 vb0Var, int i10) {
        this.f39247a = i10;
        this.f39248b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39247a) {
            case 0:
                vb0 vb0Var = this.f39248b;
                vb0Var.f42854r.f22301b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.f42854r.f22301b);
                return;
            case 1:
                vb0 vb0Var2 = this.f39248b;
                vb0Var2.f42854r.f22301b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.f42854r.f22301b);
                return;
            default:
                of.f.s(this.f39248b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
