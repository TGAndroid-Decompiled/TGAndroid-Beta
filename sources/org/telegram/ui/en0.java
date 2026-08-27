package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class en0 implements Runnable {

    public final int f37793a;

    public final do0 f37794b;

    public final TLRPC.TL_error f37795c;
    public final TLObject d;

    public en0(do0 do0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37793a = i10;
        this.f37794b = do0Var;
        this.f37795c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37793a) {
            case 0:
                do0 do0Var = this.f37794b;
                do0Var.f37452a0 = false;
                if (this.f37795c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    do0Var.W = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.y4.x0(do0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = do0Var.f37487y0;
                        if (paymentForm != null && do0Var.W.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            do0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(do0Var.W);
                        do0 do0Var2 = do0Var.f37455b0;
                        if (do0Var2 != null) {
                            do0Var2.C0(do0Var.W);
                        }
                        if (!do0Var.W.has_password && do0Var.Z == null) {
                            cn0 cn0Var = new cn0(do0Var, 3);
                            do0Var.Z = cn0Var;
                            AndroidUtilities.runOnUIThread(cn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                do0.V(this.f37794b, this.f37795c, this.d);
                break;
            default:
                do0.X(this.f37794b, this.f37795c, this.d);
                break;
        }
    }
}
