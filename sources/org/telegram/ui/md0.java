package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class md0 implements Runnable {
    public final int f35765a;
    public final yg0 f35766b;

    public md0(yg0 yg0Var, int i10) {
        this.f35765a = i10;
        this.f35766b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f35765a) {
            case 0:
                yg0 yg0Var = this.f35766b;
                yg0Var.f39905r0 = false;
                yg0Var.x1(true, true);
                return;
            case 1:
                this.f35766b.f39888c0 = false;
                return;
            default:
                yg0 yg0Var2 = this.f35766b;
                if (yg0Var2.getParentActivity() != null && !yg0Var2.getParentActivity().isFinishing() && yg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var2.getParentActivity());
                    alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rd0(yg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
