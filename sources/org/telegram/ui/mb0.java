package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mb0 implements Runnable {
    public final int f38633a;
    public final xb0 f38634b;

    public mb0(xb0 xb0Var, int i10) {
        this.f38633a = i10;
        this.f38634b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38633a) {
            case 0:
                xb0 xb0Var = this.f38634b;
                xb0Var.f42704r.f22101b.requestFocus();
                AndroidUtilities.showKeyboard(xb0Var.f42704r.f22101b);
                return;
            case 1:
                xb0 xb0Var2 = this.f38634b;
                xb0Var2.f42704r.f22101b.clearFocus();
                AndroidUtilities.hideKeyboard(xb0Var2.f42704r.f22101b);
                return;
            default:
                of.f.s(this.f38634b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
