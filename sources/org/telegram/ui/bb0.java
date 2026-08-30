package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bb0 implements Runnable {
    public final int f32889a;
    public final nb0 f32890b;

    public bb0(nb0 nb0Var, int i10) {
        this.f32889a = i10;
        this.f32890b = nb0Var;
    }

    @Override
    public final void run() {
        switch (this.f32889a) {
            case 0:
                nb0 nb0Var = this.f32890b;
                nb0Var.f36567r.f21199b.requestFocus();
                AndroidUtilities.showKeyboard(nb0Var.f36567r.f21199b);
                return;
            case 1:
                nb0 nb0Var2 = this.f32890b;
                nb0Var2.f36567r.f21199b.clearFocus();
                AndroidUtilities.hideKeyboard(nb0Var2.f36567r.f21199b);
                return;
            default:
                af.g.s(this.f32890b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
