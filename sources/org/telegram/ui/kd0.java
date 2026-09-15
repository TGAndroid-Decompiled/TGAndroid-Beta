package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kd0 implements Runnable {
    public final int f35117a;
    public final wg0 f35118b;

    public kd0(wg0 wg0Var, int i10) {
        this.f35117a = i10;
        this.f35118b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f35117a) {
            case 0:
                wg0 wg0Var = this.f35118b;
                wg0Var.f39215r0 = false;
                wg0Var.x1(true, true);
                return;
            case 1:
                this.f35118b.f39198c0 = false;
                return;
            default:
                wg0 wg0Var2 = this.f35118b;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing() && wg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var2.getParentActivity());
                    alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pd0(wg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
