package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class dn0 implements Runnable {
    public final int f37570a;
    public final co0 f37571b;
    public final TLRPC.TL_error f37572c;
    public final TLObject d;

    public dn0(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9) {
        this.f37570a = i9;
        this.f37571b = co0Var;
        this.f37572c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37570a) {
            case 0:
                co0 co0Var = this.f37571b;
                co0Var.f37246a0 = false;
                if (this.f37572c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    co0Var.W = password;
                    if (!TwoStepVerificationActivity.h0(password, false)) {
                        org.telegram.ui.Components.y4.x0(co0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = co0Var.f37281y0;
                    if (paymentForm != null && co0Var.W.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        co0Var.K0();
                    }
                    TwoStepVerificationActivity.l0(co0Var.W);
                    co0 co0Var2 = co0Var.f37249b0;
                    if (co0Var2 != null) {
                        co0Var2.B0(co0Var.W);
                    }
                    if (!co0Var.W.has_password && co0Var.Z == null) {
                        bn0 bn0Var = new bn0(co0Var, 3);
                        co0Var.Z = bn0Var;
                        AndroidUtilities.runOnUIThread(bn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                co0.U(this.f37571b, this.f37572c, this.d);
                return;
            default:
                co0.W(this.f37571b, this.f37572c, this.d);
                return;
        }
    }
}
