package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ed0 implements Runnable {
    public final int f33372a;
    public final qg0 f33373b;

    public ed0(qg0 qg0Var, int i10) {
        this.f33372a = i10;
        this.f33373b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33372a) {
            case 0:
                qg0 qg0Var = this.f33373b;
                qg0Var.f36907r0 = false;
                qg0Var.x1(true, true);
                return;
            case 1:
                this.f33373b.f36890c0 = false;
                return;
            default:
                qg0 qg0Var2 = this.f33373b;
                if (qg0Var2.getParentActivity() != null && !qg0Var2.getParentActivity().isFinishing() && qg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var2.getParentActivity());
                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new jd0(qg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
