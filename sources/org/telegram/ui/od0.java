package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class od0 implements Runnable {
    public final int f38930a;
    public final bh0 f38931b;

    public od0(bh0 bh0Var, int i10) {
        this.f38930a = i10;
        this.f38931b = bh0Var;
    }

    @Override
    public final void run() {
        switch (this.f38930a) {
            case 0:
                this.f38931b.f34548c0 = false;
                return;
            case 1:
                bh0 bh0Var = this.f38931b;
                bh0Var.f34565r0 = false;
                bh0Var.x1(true, true);
                return;
            default:
                bh0 bh0Var2 = this.f38931b;
                if (bh0Var2.getParentActivity() != null && !bh0Var2.getParentActivity().isFinishing() && bh0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var2.getParentActivity());
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ud0(bh0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
