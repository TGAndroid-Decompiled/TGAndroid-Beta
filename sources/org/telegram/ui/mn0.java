package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mn0 implements Runnable {
    public final int f35723a;
    public final no0 f35724b;
    public final TLRPC.TL_error f35725c;
    public final TLObject d;

    public mn0(no0 no0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35723a = i10;
        this.f35724b = no0Var;
        this.f35725c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35723a) {
            case 0:
                no0 no0Var = this.f35724b;
                no0Var.f36060e0 = false;
                if (this.f35725c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    no0Var.f36050a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(no0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = no0Var.C0;
                    if (paymentForm != null && no0Var.f36050a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        no0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(no0Var.f36050a0);
                    no0 no0Var2 = no0Var.f36063f0;
                    if (no0Var2 != null) {
                        no0Var2.C0(no0Var.f36050a0);
                    }
                    if (!no0Var.f36050a0.has_password && no0Var.f36058d0 == null) {
                        kn0 kn0Var = new kn0(no0Var, 3);
                        no0Var.f36058d0 = kn0Var;
                        AndroidUtilities.runOnUIThread(kn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                no0.V(this.f35724b, this.f35725c, this.d);
                return;
            default:
                no0.X(this.f35724b, this.f35725c, this.d);
                return;
        }
    }
}
