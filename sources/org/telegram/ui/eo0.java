package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eo0 implements oo0 {
    public final qo0 f32993a;

    public eo0(qo0 qo0Var) {
        this.f32993a = qo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f32993a.f36484a0 = password;
    }

    @Override
    public final void b() {
        this.f32993a.f36497f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        qo0 qo0Var = this.f32993a;
        oo0 oo0Var = qo0Var.T;
        if (oo0Var != null) {
            oo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (qo0Var.S0) {
            qo0Var.removeSelfFromStack();
        }
        if (qo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
