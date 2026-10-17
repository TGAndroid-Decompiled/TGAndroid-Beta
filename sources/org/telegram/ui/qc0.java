package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qc0 implements Runnable {
    public final int f40372a;
    public final fg0 f40373b;

    public qc0(fg0 fg0Var, int i10) {
        this.f40372a = i10;
        this.f40373b = fg0Var;
    }

    @Override
    public final void run() {
        switch (this.f40372a) {
            case 0:
                this.f40373b.f36908c0 = false;
                return;
            case 1:
                fg0 fg0Var = this.f40373b;
                fg0Var.f36925r0 = false;
                fg0Var.x1(true, true);
                return;
            default:
                fg0 fg0Var2 = this.f40373b;
                if (fg0Var2.getParentActivity() != null && !fg0Var2.getParentActivity().isFinishing() && fg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var2.getParentActivity());
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wc0(fg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
