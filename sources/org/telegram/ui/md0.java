package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class md0 implements Runnable {
    public final int f37968a;
    public final ah0 f37969b;

    public md0(ah0 ah0Var, int i10) {
        this.f37968a = i10;
        this.f37969b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f37968a) {
            case 0:
                this.f37969b.f33910c0 = false;
                return;
            case 1:
                ah0 ah0Var = this.f37969b;
                ah0Var.f33927r0 = false;
                ah0Var.x1(true, true);
                return;
            default:
                ah0 ah0Var2 = this.f37969b;
                if (ah0Var2.getParentActivity() != null && !ah0Var2.getParentActivity().isFinishing() && ah0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var2.getParentActivity());
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new sd0(ah0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
