package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gn0 implements Runnable {
    public final int f37614a;
    public final ho0 f37615b;
    public final TLRPC.TL_error f37616c;
    public final TLObject d;

    public gn0(ho0 ho0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37614a = i10;
        this.f37615b = ho0Var;
        this.f37616c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37614a) {
            case 0:
                ho0 ho0Var = this.f37615b;
                ho0Var.f37925e0 = false;
                if (this.f37616c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    ho0Var.f37915a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.w0(ho0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = ho0Var.C0;
                    if (paymentForm != null && ho0Var.f37915a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        ho0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(ho0Var.f37915a0);
                    ho0 ho0Var2 = ho0Var.f37928f0;
                    if (ho0Var2 != null) {
                        ho0Var2.C0(ho0Var.f37915a0);
                    }
                    if (!ho0Var.f37915a0.has_password && ho0Var.f37923d0 == null) {
                        en0 en0Var = new en0(ho0Var, 3);
                        ho0Var.f37923d0 = en0Var;
                        AndroidUtilities.runOnUIThread(en0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ho0.V(this.f37615b, this.f37616c, this.d);
                return;
            default:
                ho0.X(this.f37615b, this.f37616c, this.d);
                return;
        }
    }
}
