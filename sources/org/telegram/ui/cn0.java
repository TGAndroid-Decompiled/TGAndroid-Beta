package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cn0 implements Runnable {
    public final int f36012a;
    public final eo0 f36013b;
    public final TLRPC.TL_error f36014c;
    public final TLObject d;

    public cn0(eo0 eo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36012a = i10;
        this.f36013b = eo0Var;
        this.f36014c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36012a) {
            case 0:
                eo0 eo0Var = this.f36013b;
                eo0Var.f36710e0 = false;
                if (this.f36014c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    eo0Var.f36700a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(eo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = eo0Var.C0;
                    if (paymentForm != null && eo0Var.f36700a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        eo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(eo0Var.f36700a0);
                    eo0 eo0Var2 = eo0Var.f36713f0;
                    if (eo0Var2 != null) {
                        eo0Var2.C0(eo0Var.f36700a0);
                    }
                    if (!eo0Var.f36700a0.has_password && eo0Var.f36708d0 == null) {
                        an0 an0Var = new an0(eo0Var, 3);
                        eo0Var.f36708d0 = an0Var;
                        AndroidUtilities.runOnUIThread(an0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                eo0.V(this.f36013b, this.f36014c, this.d);
                return;
            default:
                eo0.X(this.f36013b, this.f36014c, this.d);
                return;
        }
    }
}
