package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hm0 implements om0 {
    public final qm0 f37836a;

    public hm0(qm0 qm0Var) {
        this.f37836a = qm0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f37836a.f40813a0 = password;
    }

    @Override
    public final void b() {
        this.f37836a.f40826f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        qm0 qm0Var = this.f37836a;
        om0 om0Var = qm0Var.T;
        if (om0Var != null) {
            om0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (qm0Var.S0) {
            qm0Var.removeSelfFromStack();
        }
        if (qm0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
