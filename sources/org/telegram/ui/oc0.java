package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oc0 implements Runnable {
    public final int f39828a;
    public final cg0 f39829b;

    public oc0(cg0 cg0Var, int i10) {
        this.f39828a = i10;
        this.f39829b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f39828a) {
            case 0:
                this.f39829b.f35969c0 = false;
                return;
            case 1:
                cg0 cg0Var = this.f39829b;
                cg0Var.f35986r0 = false;
                cg0Var.x1(true, true);
                return;
            default:
                cg0 cg0Var2 = this.f39829b;
                if (cg0Var2.getParentActivity() != null && !cg0Var2.getParentActivity().isFinishing() && cg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg0Var2.getParentActivity());
                    alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new uc0(cg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
