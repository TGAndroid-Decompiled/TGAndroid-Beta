package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class do0 implements no0 {
    public final po0 f38912a;

    public do0(po0 po0Var) {
        this.f38912a = po0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f38912a.f42584a0 = password;
    }

    @Override
    public final void b() {
        this.f38912a.f42597f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        po0 po0Var = this.f38912a;
        no0 no0Var = po0Var.T;
        if (no0Var != null) {
            no0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (po0Var.S0) {
            po0Var.removeSelfFromStack();
        }
        if (po0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
