package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class go0 implements qo0 {
    public final so0 f36696a;

    public go0(so0 so0Var) {
        this.f36696a = so0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f36696a.f40547a0 = password;
    }

    @Override
    public final void b() {
        this.f36696a.f40561f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        so0 so0Var = this.f36696a;
        qo0 qo0Var = so0Var.T;
        if (qo0Var != null) {
            qo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (so0Var.S0) {
            so0Var.removeSelfFromStack();
        }
        if (so0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
