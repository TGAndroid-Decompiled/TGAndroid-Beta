package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hd0 implements Runnable {
    public final int f38417a;
    public final vg0 f38418b;

    public hd0(vg0 vg0Var, int i10) {
        this.f38417a = i10;
        this.f38418b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f38417a) {
            case 0:
                this.f38418b.f43050c0 = false;
                return;
            case 1:
                vg0 vg0Var = this.f38418b;
                vg0Var.f43068r0 = false;
                vg0Var.x1(true, true);
                return;
            default:
                vg0 vg0Var2 = this.f38418b;
                if (vg0Var2.getParentActivity() != null && !vg0Var2.getParentActivity().isFinishing() && vg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg0Var2.getParentActivity());
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nd0(vg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
