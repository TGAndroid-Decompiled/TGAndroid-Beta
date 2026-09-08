package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kd0 implements Runnable {
    public final int f38035a;
    public final wg0 f38036b;

    public kd0(wg0 wg0Var, int i10) {
        this.f38035a = i10;
        this.f38036b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f38035a) {
            case 0:
                wg0 wg0Var = this.f38036b;
                wg0Var.f42409r0 = false;
                wg0Var.x1(true, true);
                return;
            case 1:
                this.f38036b.f42391c0 = false;
                return;
            default:
                wg0 wg0Var2 = this.f38036b;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing() && wg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var2.getParentActivity());
                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pd0(wg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
