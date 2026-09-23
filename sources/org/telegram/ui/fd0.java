package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fd0 implements Runnable {
    public final int f33289a;
    public final rg0 f33290b;

    public fd0(rg0 rg0Var, int i10) {
        this.f33289a = i10;
        this.f33290b = rg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33289a) {
            case 0:
                rg0 rg0Var = this.f33290b;
                rg0Var.f36840r0 = false;
                rg0Var.x1(true, true);
                return;
            case 1:
                this.f33290b.f36823c0 = false;
                return;
            default:
                rg0 rg0Var2 = this.f33290b;
                if (rg0Var2.getParentActivity() != null && !rg0Var2.getParentActivity().isFinishing() && rg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var2.getParentActivity());
                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new kd0(rg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
