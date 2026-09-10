package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kd0 implements Runnable {
    public final int f34336a;
    public final xg0 f34337b;

    public kd0(xg0 xg0Var, int i10) {
        this.f34336a = i10;
        this.f34337b = xg0Var;
    }

    @Override
    public final void run() {
        switch (this.f34336a) {
            case 0:
                xg0 xg0Var = this.f34337b;
                xg0Var.f38739r0 = false;
                xg0Var.x1(true, true);
                return;
            case 1:
                this.f34337b.f38722c0 = false;
                return;
            default:
                xg0 xg0Var2 = this.f34337b;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing() && xg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var2.getParentActivity());
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pd0(xg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
