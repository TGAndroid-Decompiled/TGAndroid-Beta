package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ed0 implements Runnable {
    public final int f33788a;
    public final pg0 f33789b;

    public ed0(pg0 pg0Var, int i10) {
        this.f33788a = i10;
        this.f33789b = pg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33788a) {
            case 0:
                pg0 pg0Var = this.f33789b;
                pg0Var.f37144o0 = false;
                pg0Var.x1(true, true);
                return;
            case 1:
                this.f33789b.Z = false;
                return;
            default:
                pg0 pg0Var2 = this.f33789b;
                if (pg0Var2.getParentActivity() != null && !pg0Var2.getParentActivity().isFinishing() && pg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var2.getParentActivity());
                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new jd0(pg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
