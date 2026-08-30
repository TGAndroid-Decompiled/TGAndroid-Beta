package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cd0 implements Runnable {
    public final int f33285a;
    public final ng0 f33286b;

    public cd0(ng0 ng0Var, int i10) {
        this.f33285a = i10;
        this.f33286b = ng0Var;
    }

    @Override
    public final void run() {
        switch (this.f33285a) {
            case 0:
                ng0 ng0Var = this.f33286b;
                ng0Var.f36640o0 = false;
                ng0Var.x1(true, true);
                return;
            case 1:
                this.f33286b.Z = false;
                return;
            default:
                ng0 ng0Var2 = this.f33286b;
                if (ng0Var2.getParentActivity() != null && !ng0Var2.getParentActivity().isFinishing() && ng0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var2.getParentActivity());
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new hd0(ng0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
