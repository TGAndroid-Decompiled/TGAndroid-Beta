package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qc0 implements Runnable {
    public final int f40336a;
    public final eg0 f40337b;

    public qc0(eg0 eg0Var, int i10) {
        this.f40336a = i10;
        this.f40337b = eg0Var;
    }

    @Override
    public final void run() {
        switch (this.f40336a) {
            case 0:
                this.f40337b.f36494c0 = false;
                return;
            case 1:
                eg0 eg0Var = this.f40337b;
                eg0Var.f36511r0 = false;
                eg0Var.x1(true, true);
                return;
            default:
                eg0 eg0Var2 = this.f40337b;
                if (eg0Var2.getParentActivity() != null && !eg0Var2.getParentActivity().isFinishing() && eg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eg0Var2.getParentActivity());
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wc0(eg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
