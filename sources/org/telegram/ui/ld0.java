package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ld0 implements Runnable {
    public final int f35347a;
    public final xg0 f35348b;

    public ld0(xg0 xg0Var, int i10) {
        this.f35347a = i10;
        this.f35348b = xg0Var;
    }

    @Override
    public final void run() {
        switch (this.f35347a) {
            case 0:
                xg0 xg0Var = this.f35348b;
                xg0Var.f39483r0 = false;
                xg0Var.x1(true, true);
                return;
            case 1:
                this.f35348b.f39466c0 = false;
                return;
            default:
                xg0 xg0Var2 = this.f35348b;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing() && xg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var2.getParentActivity());
                    alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qd0(xg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
