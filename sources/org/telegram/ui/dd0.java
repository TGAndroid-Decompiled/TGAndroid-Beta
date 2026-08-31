package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dd0 implements Runnable {
    public final int f36200a;
    public final og0 f36201b;

    public dd0(og0 og0Var, int i10) {
        this.f36200a = i10;
        this.f36201b = og0Var;
    }

    @Override
    public final void run() {
        switch (this.f36200a) {
            case 0:
                og0 og0Var = this.f36201b;
                og0Var.f39769o0 = false;
                og0Var.x1(true, true);
                return;
            case 1:
                this.f36201b.Z = false;
                return;
            default:
                og0 og0Var2 = this.f36201b;
                if (og0Var2.getParentActivity() != null && !og0Var2.getParentActivity().isFinishing() && og0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var2.getParentActivity());
                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new id0(og0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
