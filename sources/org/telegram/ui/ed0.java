package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ed0 implements Runnable {
    public final int f33373a;
    public final qg0 f33374b;

    public ed0(qg0 qg0Var, int i10) {
        this.f33373a = i10;
        this.f33374b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33373a) {
            case 0:
                qg0 qg0Var = this.f33374b;
                qg0Var.f36908r0 = false;
                qg0Var.x1(true, true);
                return;
            case 1:
                this.f33374b.f36891c0 = false;
                return;
            default:
                qg0 qg0Var2 = this.f33374b;
                if (qg0Var2.getParentActivity() != null && !qg0Var2.getParentActivity().isFinishing() && qg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var2.getParentActivity());
                    alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new jd0(qg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
