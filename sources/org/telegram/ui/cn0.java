package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cn0 implements Runnable {
    public final int f36015a;
    public final eo0 f36016b;
    public final TLRPC.TL_error f36017c;
    public final TLObject d;

    public cn0(eo0 eo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36015a = i10;
        this.f36016b = eo0Var;
        this.f36017c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36015a) {
            case 0:
                eo0 eo0Var = this.f36016b;
                eo0Var.f36713e0 = false;
                if (this.f36017c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    eo0Var.f36703a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(eo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = eo0Var.C0;
                    if (paymentForm != null && eo0Var.f36703a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        eo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(eo0Var.f36703a0);
                    eo0 eo0Var2 = eo0Var.f36716f0;
                    if (eo0Var2 != null) {
                        eo0Var2.C0(eo0Var.f36703a0);
                    }
                    if (!eo0Var.f36703a0.has_password && eo0Var.f36711d0 == null) {
                        an0 an0Var = new an0(eo0Var, 3);
                        eo0Var.f36711d0 = an0Var;
                        AndroidUtilities.runOnUIThread(an0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                eo0.V(this.f36016b, this.f36017c, this.d);
                return;
            default:
                eo0.X(this.f36016b, this.f36017c, this.d);
                return;
        }
    }
}
