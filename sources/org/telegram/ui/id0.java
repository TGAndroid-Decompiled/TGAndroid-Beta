package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class id0 implements Runnable {
    public final int f37397a;
    public final ug0 f37398b;

    public id0(ug0 ug0Var, int i10) {
        this.f37397a = i10;
        this.f37398b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f37397a) {
            case 0:
                ug0 ug0Var = this.f37398b;
                ug0Var.f41216r0 = false;
                ug0Var.x1(true, true);
                return;
            case 1:
                this.f37398b.f41198c0 = false;
                return;
            default:
                ug0 ug0Var2 = this.f37398b;
                if (ug0Var2.getParentActivity() != null && !ug0Var2.getParentActivity().isFinishing() && ug0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var2.getParentActivity());
                    alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nd0(ug0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
