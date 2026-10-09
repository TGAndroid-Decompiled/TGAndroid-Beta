package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class id0 implements Runnable {
    public final int f38614a;
    public final wg0 f38615b;

    public id0(wg0 wg0Var, int i10) {
        this.f38614a = i10;
        this.f38615b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f38614a) {
            case 0:
                this.f38615b.f43579c0 = false;
                return;
            case 1:
                wg0 wg0Var = this.f38615b;
                wg0Var.f43597r0 = false;
                wg0Var.x1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f38615b;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing() && wg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var2.getParentActivity());
                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new od0(wg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
