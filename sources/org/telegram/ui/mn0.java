package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mn0 implements Runnable {
    public final int f39181a;
    public final lo0 f39182b;
    public final TLRPC.TL_error f39183c;
    public final TLObject d;

    public mn0(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39181a = i10;
        this.f39182b = lo0Var;
        this.f39183c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39181a) {
            case 0:
                lo0 lo0Var = this.f39182b;
                lo0Var.f38799b0 = false;
                if (this.f39183c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    lo0Var.X = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(lo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = lo0Var.f38833z0;
                    if (paymentForm != null && lo0Var.X.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        lo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(lo0Var.X);
                    lo0 lo0Var2 = lo0Var.f38802c0;
                    if (lo0Var2 != null) {
                        lo0Var2.C0(lo0Var.X);
                    }
                    if (!lo0Var.X.has_password && lo0Var.f38796a0 == null) {
                        kn0 kn0Var = new kn0(lo0Var, 3);
                        lo0Var.f38796a0 = kn0Var;
                        AndroidUtilities.runOnUIThread(kn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                lo0.V(this.f39182b, this.f39183c, this.d);
                return;
            default:
                lo0.X(this.f39182b, this.f39183c, this.d);
                return;
        }
    }
}
