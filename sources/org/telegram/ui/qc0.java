package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qc0 implements Runnable {
    public final int f42808a;
    public final gg0 f42809b;

    public qc0(gg0 gg0Var, int i10) {
        this.f42808a = i10;
        this.f42809b = gg0Var;
    }

    @Override
    public final void run() {
        switch (this.f42808a) {
            case 0:
                this.f42809b.f39656c0 = false;
                return;
            case 1:
                gg0 gg0Var = this.f42809b;
                gg0Var.f39678v0 = false;
                gg0Var.C1(true, true);
                return;
            default:
                gg0 gg0Var2 = this.f42809b;
                if (gg0Var2.getParentActivity() != null && !gg0Var2.getParentActivity().isFinishing() && gg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var2.getParentActivity());
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wc0(gg0Var2, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
