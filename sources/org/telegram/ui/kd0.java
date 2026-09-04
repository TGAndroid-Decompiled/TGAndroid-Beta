package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kd0 implements Runnable {
    public final int f38008a;
    public final wg0 f38009b;

    public kd0(wg0 wg0Var, int i10) {
        this.f38008a = i10;
        this.f38009b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f38008a) {
            case 0:
                wg0 wg0Var = this.f38009b;
                wg0Var.f42382r0 = false;
                wg0Var.x1(true, true);
                return;
            case 1:
                this.f38009b.f42364c0 = false;
                return;
            default:
                wg0 wg0Var2 = this.f38009b;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing() && wg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var2.getParentActivity());
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pd0(wg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
