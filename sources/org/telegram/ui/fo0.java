package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class fo0 implements po0 {
    public final ro0 f33601a;

    public fo0(ro0 ro0Var) {
        this.f33601a = ro0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f33601a.f37168a0 = password;
    }

    @Override
    public final void b() {
        this.f33601a.f37181f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ro0 ro0Var = this.f33601a;
        po0 po0Var = ro0Var.T;
        if (po0Var != null) {
            po0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ro0Var.S0) {
            ro0Var.removeSelfFromStack();
        }
        if (ro0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
