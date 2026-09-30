package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bo0 implements lo0 {
    public final no0 f32542a;

    public bo0(no0 no0Var) {
        this.f32542a = no0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f32542a.f36050a0 = password;
    }

    @Override
    public final void b() {
        this.f32542a.f36063f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        no0 no0Var = this.f32542a;
        lo0 lo0Var = no0Var.T;
        if (lo0Var != null) {
            lo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (no0Var.S0) {
            no0Var.removeSelfFromStack();
        }
        if (no0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
