package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oc0 implements Runnable {
    public final int f39827a;
    public final dg0 f39828b;

    public oc0(dg0 dg0Var, int i10) {
        this.f39827a = i10;
        this.f39828b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f39827a) {
            case 0:
                this.f39828b.f36365c0 = false;
                return;
            case 1:
                dg0 dg0Var = this.f39828b;
                dg0Var.f36382r0 = false;
                dg0Var.x1(true, true);
                return;
            default:
                dg0 dg0Var2 = this.f39828b;
                if (dg0Var2.getParentActivity() != null && !dg0Var2.getParentActivity().isFinishing() && dg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var2.getParentActivity());
                    alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new uc0(dg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
