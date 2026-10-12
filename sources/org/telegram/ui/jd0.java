package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jd0 implements Runnable {
    public final int f39183a;
    public final xg0 f39184b;

    public jd0(xg0 xg0Var, int i10) {
        this.f39183a = i10;
        this.f39184b = xg0Var;
    }

    @Override
    public final void run() {
        switch (this.f39183a) {
            case 0:
                this.f39184b.f43942c0 = false;
                return;
            case 1:
                xg0 xg0Var = this.f39184b;
                xg0Var.f43960r0 = false;
                xg0Var.x1(true, true);
                return;
            default:
                xg0 xg0Var2 = this.f39184b;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing() && xg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var2.getParentActivity());
                    alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pd0(xg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
