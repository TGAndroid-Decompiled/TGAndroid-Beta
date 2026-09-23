package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pn0 implements Runnable {
    public final int f36149a;
    public final qo0 f36150b;
    public final TLRPC.TL_error f36151c;
    public final TLObject d;

    public pn0(qo0 qo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36149a = i10;
        this.f36150b = qo0Var;
        this.f36151c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36149a) {
            case 0:
                qo0 qo0Var = this.f36150b;
                qo0Var.f36494e0 = false;
                if (this.f36151c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    qo0Var.f36484a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(qo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = qo0Var.C0;
                    if (paymentForm != null && qo0Var.f36484a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        qo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(qo0Var.f36484a0);
                    qo0 qo0Var2 = qo0Var.f36497f0;
                    if (qo0Var2 != null) {
                        qo0Var2.C0(qo0Var.f36484a0);
                    }
                    if (!qo0Var.f36484a0.has_password && qo0Var.f36492d0 == null) {
                        nn0 nn0Var = new nn0(qo0Var, 3);
                        qo0Var.f36492d0 = nn0Var;
                        AndroidUtilities.runOnUIThread(nn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qo0.V(this.f36150b, this.f36151c, this.d);
                return;
            default:
                qo0.X(this.f36150b, this.f36151c, this.d);
                return;
        }
    }
}
