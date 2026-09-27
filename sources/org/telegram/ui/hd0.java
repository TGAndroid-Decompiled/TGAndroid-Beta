package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hd0 implements Runnable {
    public final int f34197a;
    public final tg0 f34198b;

    public hd0(tg0 tg0Var, int i10) {
        this.f34197a = i10;
        this.f34198b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f34197a) {
            case 0:
                tg0 tg0Var = this.f34198b;
                tg0Var.f37806r0 = false;
                tg0Var.x1(true, true);
                return;
            case 1:
                this.f34198b.f37789c0 = false;
                return;
            default:
                tg0 tg0Var2 = this.f34198b;
                if (tg0Var2.getParentActivity() != null && !tg0Var2.getParentActivity().isFinishing() && tg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var2.getParentActivity());
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new md0(tg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
